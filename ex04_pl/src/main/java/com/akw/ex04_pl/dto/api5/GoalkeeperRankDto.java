package com.akw.ex04_pl.dto.api5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GoalkeeperRankDto {
    private String playerName;
    private String season;
    private int saves;
    private int cleanSheets;
    private int penaltiesSaved;
    private int highClaims;
    private int catches;
    private int goalsConceded;
    private int appearances;
    private int punches;
    private int sweeperClearances;
    private int throwOuts;
    private int goalKicks;
}
