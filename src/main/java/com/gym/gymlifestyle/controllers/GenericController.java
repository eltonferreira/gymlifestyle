package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.services.GenericService;
import org.modelmapper.ModelMapper;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class GenericController<T extends GenericEntity<ID>, ID, DTOReq, DTORes,
        S extends GenericService<T, ID, ? extends JpaRepository<T, ID>>> {

    @Autowired
    protected S service;

    protected final ModelMapper mapper;

    private final Class<T> entityClass;

    private final Class<DTORes> dtoResponseClass;

    @SuppressWarnings("unchecked")
    public GenericController() {
        Type[] typesGenericOfClass = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
        this.entityClass = (Class<T>) typesGenericOfClass[0];
        this.dtoResponseClass = (Class<DTORes>) typesGenericOfClass[3];
        this.mapper = new ModelMapper();
    }

    @GetMapping
    public ResponseEntity<List<DTORes>> getAll() {
        List<DTORes> dtosResponse = service.getAll().stream()
                .map(object -> mapper.map(object, dtoResponseClass))
                .toList();
        return ResponseEntity.ok(dtosResponse);
    }

    @GetMapping("{id}")
    public ResponseEntity<DTORes> getById(@PathVariable ID id) {
        DTORes dtoResponse = mapper.map(service.getById(id), dtoResponseClass);
        return ResponseEntity.ok(dtoResponse);
    }

    @GetMapping("filter")
    public ResponseEntity<Page<DTORes>> getByFilter(@ParameterObject @ModelAttribute DTOReq dtoRequest,
                                                    @ParameterObject Pageable pageable) {
        Page<DTORes> dtosResponse;

        if (dtoRequest != null) {
            T objectConverted = mapper.map(dtoRequest, entityClass);
            dtosResponse = service.getByExample(objectConverted, pageable)
                    .map(object -> mapper.map(object, dtoResponseClass));
        } else {
            dtosResponse = service.getPage(pageable)
                    .map(object -> mapper.map(object, dtoResponseClass));
        }
        return ResponseEntity.ok(dtosResponse);
    }

    @PostMapping
    public ResponseEntity<DTORes> create(@Validated @RequestBody DTOReq dtoRequest) {
        T objectConverted = mapper.map(dtoRequest, entityClass);
        DTORes dtoResponse = mapper.map(service.create(objectConverted), dtoResponseClass);
        return ResponseEntity.status(HttpStatus.CREATED).body(dtoResponse);
    }

    @PutMapping("{id}")
    public ResponseEntity<DTORes> update(@PathVariable ID id, @Validated @RequestBody DTOReq dtoRequest) {
        T objectConverted = mapper.map(dtoRequest, entityClass);
        objectConverted.setId(id);
        DTORes dtoResponse = mapper.map(service.update(objectConverted), dtoResponseClass);
        return ResponseEntity.ok(dtoResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable ID id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Successfully deleted.");
    }

}
