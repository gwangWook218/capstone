package com.akw.ex03_todo;

import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
    List<Todo> findByDateAndCategoryAndUserId(LocalDate date, String category, Integer userId);
    List<Todo> findByUserId(Integer userId);
}
