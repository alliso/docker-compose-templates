package com.alliso.template.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliso.template.entities.TemplateEntity;
import com.alliso.template.services.TemplateService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/templates")
@CrossOrigin
@Slf4j
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping
    public ResponseEntity<List<TemplateEntity>> findAll() {
        log.info("Find all");

        return new ResponseEntity<>(templateService.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<TemplateEntity> findById( @PathVariable("id") long id ) {
        log.info("Find with id {}", id);

        return new ResponseEntity<>(templateService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TemplateEntity> save( @RequestBody TemplateEntity entity ) {
        log.info("Save template entity with name {}", entity.getName());

        return new ResponseEntity<>(templateService.save(entity), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete( @PathVariable("id") long id ) {
        log.info("Delete template entity with id {}", id);

        templateService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<TemplateEntity> update( 
        @PathVariable("id") long id, 
        @RequestBody TemplateEntity entity) {
            log.info("Updated entity with id {}", id);

            return new ResponseEntity<>(templateService.update(id, entity), HttpStatus.OK);
    }
    
}
