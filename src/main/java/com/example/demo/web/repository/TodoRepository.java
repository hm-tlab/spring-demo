package com.example.demo.web.repository;

import com.example.demo.web.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    public Optional<Todo> findOneById(Long id);
}
