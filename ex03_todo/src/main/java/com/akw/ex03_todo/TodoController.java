package com.akw.ex03_todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public Iterable<Todo> selectAll() {
        return todoService.selectAll();
    }

    @GetMapping("/{id}")
    public Optional<Todo> selectOneById(@PathVariable Integer id) {
        return todoService.selectOneById(id);
    }

    @PostMapping
    public void insert(@RequestBody Todo todo) {
        todoService.insert(todo);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Todo todo) {
        todo.setId(id);
        todoService.update(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        todoService.delete(id);
    }
}
