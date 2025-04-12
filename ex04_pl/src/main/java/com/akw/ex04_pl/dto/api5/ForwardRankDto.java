package com.akw.ex04_pl.dto.api5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ForwardRankDto {
    private String playerName;
    private String season;
    private int goals;
    private int goalsPerMatch;
    private int shotsOnTarget;
    private int shootingAccuracy;
    private int bigChanceMiss;
    private int headedGoals;
    private int goalsRightFoot;
    private int goalsLeftFoot;
    private int hitWoodwork;
    private int penaltiesScored;
    private int freekicksScored;
    private int shots;
}
