package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericService<T extends GenericEntity<ID>, ID, R extends JpaRepository<T, ID>> {

    @Autowired
    protected R repository;

    public List<T> getAll() {
        List<T> objects = repository.findAll();

        if (objects.isEmpty()) throw new NotFoundException("Not found.");

        return objects;
    }

    public T getById(ID id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Not found."));
    }

    public Page<T> getByExample(T object, Pageable pageable) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreNullValues();
        Page<T> objects = repository.findAll(Example.of(object, matcher), pageable);

        if (objects.isEmpty()) throw new NotFoundException("Not found.");

        return objects;
    }

    public Page<T> getPage(Pageable pageable) {
        Page<T> objects = repository.findAll(pageable);

        if (objects.isEmpty()) throw new NotFoundException("Not found.");

        return objects;
    }

    public T create(T object) {
        return repository.save(object);
    }

    public T update(T object) {
        getById(object.getId());
        return repository.save(object);
    }

    public void delete(ID id) {
        getById(id);
        repository.deleteById(id);
    }

}
