package com.alliso.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alliso.template.entities.TemplateEntity;

@Repository
public interface TemplateRepository extends JpaRepository<TemplateEntity, Long> {
    
}
