package com.akw.ex04_pl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResultDto {
    private String playerName;
    private String position;
    private String season;
    private int appearances;
    private int goals;
    private int assists;
    private int passes;
    private int tackles;
    private int interceptions;
    private int duels_won;
    private int saves;
    private int shots;
    private int shots_on_target;
}
