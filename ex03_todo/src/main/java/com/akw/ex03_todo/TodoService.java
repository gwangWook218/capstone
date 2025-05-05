package com.akw.ex03_todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Iterable<Todo> selectAll() {
        return todoRepository.findAll();
    }

    public Optional<Todo> selectOneById(Integer id) {
        return todoRepository.findById(id);
    }

    public Todo insert(Todo todo) {
        return todoRepository.save(todo);
    }

    public void update(Todo todo) {
        todoRepository.save(todo);
    }

    public void delete(Integer id) {
        todoRepository.deleteById(id);
    }
}
