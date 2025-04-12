package com.akw.ex04_pl.dto.api5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DefenderRankDto {
    private String playerName;
    private String season;
    private int tackles;
    private int interceptions;
    private int clearances;
    private int cleanSheets;
    private int appearances;
    private int goalsConceded;
    private int tackleSuccessPct;
    private int lastManTackles;
    private int blockedShots;
    private int headedClearance;
    private int clearanceOffLine;
    private int recoveries;
    private int duelsWon;
    private int duelsLost;
    private int successfulFifty;
    private int aerialBattlesWon;
    private int aerialBattlesLost;
    private int ownGoals;
    private  int errorsLoadingToGoal;
}
