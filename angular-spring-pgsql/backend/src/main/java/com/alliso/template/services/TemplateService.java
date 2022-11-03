package com.alliso.template.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alliso.template.entities.TemplateEntity;
import com.alliso.template.repositories.TemplateRepository;

@Service
public class TemplateService {

    @Autowired
    private TemplateRepository templateRepository;

    public List<TemplateEntity> findAll() {
        return templateRepository.findAll();
    }

    public TemplateEntity findById(long id) {
        return templateRepository.findById(id).get();
    }

    public TemplateEntity save(TemplateEntity entity) {
        return templateRepository.save(entity);
    }

    public TemplateEntity update(long id, TemplateEntity entity) {
        return templateRepository.save(entity);
    }

    public void delete(long id) {
        templateRepository.deleteById(id);
    }
    
}
