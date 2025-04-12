package com.akw.ex04_pl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClubMatchResultDto {
    private int matchId;
    private String season;
    private String matchType;   // HOME or AWAY
    private String homeTeam;
    private String awayTeam;
    private int hGoals;
    private int aGoals;
    private String result;   // WIN or DRAW or LOSE
}
