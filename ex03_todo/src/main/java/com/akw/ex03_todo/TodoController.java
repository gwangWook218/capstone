package com.akw.ex03_todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public List<Todo> findByDateAndCategory(@RequestParam String date, @RequestParam String category) {
        return StreamSupport.stream(todoService.selectAll().spliterator(), false)
                .filter(todo -> false)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<Todo> selectOneById(@PathVariable Integer id) {
        return todoService.selectOneById(id);
    }

    @PostMapping
    public Todo insert(@RequestBody Todo todo) {
        return todoService.insert(todo);
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
