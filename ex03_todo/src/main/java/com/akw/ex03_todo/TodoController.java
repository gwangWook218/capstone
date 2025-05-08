package com.akw.ex03_todo;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public List<Todo> findByDateAndCategory(@RequestParam String date, @RequestParam String category, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) return List.of();
        return todoService.findByDateAndCategoryAndUser(LocalDate.parse(date), category, user.getId());
    }

    @GetMapping("/{id}")
    public Optional<Todo> selectOneById(@PathVariable Integer id) {
        return todoService.selectOneById(id);
    }

    @PostMapping
    public Todo insert(@RequestBody Todo todo, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) throw new RuntimeException("로그인이 필요합니다.");
        return todoService.insert(todo, user.getId());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Todo todo, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) throw new RuntimeException("로그인이 필요합니다.");
        todo.setId(id);
        todoService.update(todo, user.getId());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        todoService.delete(id);
    }
}
