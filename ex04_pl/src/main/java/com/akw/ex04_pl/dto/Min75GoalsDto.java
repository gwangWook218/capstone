package com.akw.ex04_pl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Min75GoalsDto {
    private String clubName;
    private String playerName;
    private String playerAssisted;
    private int minute;
    private String result;
    private String situation;
    private String shotType;
}
