import os

BASE_DIR = "/Users/abidhossain/Desktop/Agentic Codes/Java8"

MORE_DOMAINS = [
    "Location", "Region", "Territory", "Pricing", "Discount", "Promotion", "Shipping",
    "Return", "Refund", "Wallet", "Transaction", "Currency", "ExchangeRate", "TaxBracket",
    "AssetCategory", "Depreciation", "InventoryAdjustment", "PurchaseOrder", "Requisition", "SupplierInvoice"
]

def generate_entity(domain_name):
    fields = ""
    getters_setters = ""
    for i in range(1, 21):
        fields += f"    @javax.persistence.Column\n    private String field{i};\n"
        getters_setters += f"""
    public String getField{i}() {{ return field{i}; }}
    public void setField{i}(String field{i}) {{ this.field{i} = field{i}; }}
"""
    return f"""package com.enterprise.erp.domain.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "{domain_name.lower()}")
public class {domain_name} extends BaseEntity {{
{fields}
{getters_setters}
}}
"""

def generate_repository(domain_name):
    return f"""package com.enterprise.erp.domain.repository;
import com.enterprise.erp.domain.entity.{domain_name};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface {domain_name}Repository extends JpaRepository<{domain_name}, Long> {{
    List<{domain_name}> findByField1(String field1);
    List<{domain_name}> findByField2(String field2);
}}
"""

def generate_service(domain_name):
    business_logic = ""
    for i in range(1, 11):
        business_logic += f"""
    public {domain_name} processBusinessLogic{i}({domain_name} entity) {{
        if (entity.getField{i}() != null && entity.getField{i}().length() > 5) {{
            entity.setField{i + 1}(entity.getField{i}() + "_processed");
        }} else {{
            entity.setField{i + 1}("default_val");
        }}
        return {domain_name.lower()}Repository.save(entity);
    }}
"""
    return f"""package com.enterprise.erp.core.service;
import com.enterprise.erp.domain.entity.{domain_name};
import com.enterprise.erp.domain.repository.{domain_name}Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class {domain_name}Service {{
    private final {domain_name}Repository {domain_name.lower()}Repository;
    @Autowired
    public {domain_name}Service({domain_name}Repository {domain_name.lower()}Repository) {{
        this.{domain_name.lower()}Repository = {domain_name.lower()}Repository;
    }}
    public {domain_name} create({domain_name} entity) {{
        return {domain_name.lower()}Repository.save(entity);
    }}
    public List<{domain_name}> findAll() {{
        return {domain_name.lower()}Repository.findAll();
    }}
{business_logic}
}}
"""

def generate_controller(domain_name):
    endpoints = ""
    for i in range(1, 6):
        endpoints += f"""
    @org.springframework.web.bind.annotation.PostMapping("/{i}")
    public org.springframework.http.ResponseEntity<{domain_name}> processEndpoint{i}(@org.springframework.web.bind.annotation.RequestBody {domain_name} entity) {{
        return org.springframework.http.ResponseEntity.ok({domain_name.lower()}Service.processBusinessLogic{i}(entity));
    }}
"""
    return f"""package com.enterprise.erp.web.controller;
import com.enterprise.erp.domain.entity.{domain_name};
import com.enterprise.erp.core.service.{domain_name}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/{domain_name.lower()}s")
public class {domain_name}Controller {{
    private final {domain_name}Service {domain_name.lower()}Service;
    @Autowired
    public {domain_name}Controller({domain_name}Service {domain_name.lower()}Service) {{
        this.{domain_name.lower()}Service = {domain_name.lower()}Service;
    }}
    @PostMapping
    public org.springframework.http.ResponseEntity<{domain_name}> create(@RequestBody {domain_name} entity) {{
        return org.springframework.http.ResponseEntity.ok({domain_name.lower()}Service.create(entity));
    }}
    @GetMapping
    public org.springframework.http.ResponseEntity<List<{domain_name}>> getAll() {{
        return org.springframework.http.ResponseEntity.ok({domain_name.lower()}Service.findAll());
    }}
{endpoints}
}}
"""

def write_file(path, content):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, 'w') as f:
        f.write(content)

for domain in MORE_DOMAINS:
    write_file(os.path.join(BASE_DIR, "erp-domain", "src", "main", "java", "com", "enterprise", "erp", "domain", "entity", f"{domain}.java"), generate_entity(domain))
    write_file(os.path.join(BASE_DIR, "erp-domain", "src", "main", "java", "com", "enterprise", "erp", "domain", "repository", f"{domain}Repository.java"), generate_repository(domain))
    write_file(os.path.join(BASE_DIR, "erp-core", "src", "main", "java", "com", "enterprise", "erp", "core", "service", f"{domain}Service.java"), generate_service(domain))
    write_file(os.path.join(BASE_DIR, "erp-web", "src", "main", "java", "com", "enterprise", "erp", "web", "controller", f"{domain}Controller.java"), generate_controller(domain))

