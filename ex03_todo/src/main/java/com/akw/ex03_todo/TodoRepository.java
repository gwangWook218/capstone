package com.akw.ex03_todo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
    List<Todo> findByDateAndCategory(String date, String category);
}
