package com.akw.ex03_todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    private Integer id;

    private String task;
    private boolean completed;
    private String memo;

    private LocalDate date;
    private String category;
}
