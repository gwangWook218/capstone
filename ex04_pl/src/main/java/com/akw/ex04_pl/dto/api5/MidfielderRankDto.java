package com.akw.ex04_pl.dto.api5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MidfielderRankDto {
    private String playerName;
    private String season;
    private int assists;
    private int bigChanceCreated;
    private int passes;
    private int passesPerMatch;
    private int crosses;
    private int crossAccuracy;
    private int throughBalls;
    private int accurateLongBalls;
}
