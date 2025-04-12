package com.akw.ex04_pl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClubRankDto {
    private String clubName;
    private int pts;
    private int totalGoals;
    private int totalGoalsCond;
}
