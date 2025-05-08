package com.akw.ex03_todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Iterable<Todo> selectAllByUser(Integer userId) {
        return todoRepository.findByUserId(userId);
    }

    public Optional<Todo> selectOneById(Integer id) {
        return todoRepository.findById(id);
    }

    public Todo insert(Todo todo, Integer userId) {
        todo.setUserId(userId);
        return todoRepository.save(todo);
    }

    public void update(Todo todo, Integer userId) {
        todo.setUserId(userId);
        todoRepository.save(todo);
    }

    public void delete(Integer id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> findByDateAndCategoryAndUser(LocalDate date, String category, Integer userId) {
        return todoRepository.findByDateAndCategoryAndUserId(date, category, userId);
    }
}
