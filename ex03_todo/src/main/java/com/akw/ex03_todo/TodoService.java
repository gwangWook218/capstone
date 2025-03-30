package com.akw.ex03_todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    public Optional<Todo> update(Long id, Todo newtodo) {
        return todoRepository.findById(id).map(todo -> {
            todo.setTask(newtodo.getTask());
            todo.setCompleted(newtodo.isCompleted());
            return todoRepository.save(todo);
        });
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
