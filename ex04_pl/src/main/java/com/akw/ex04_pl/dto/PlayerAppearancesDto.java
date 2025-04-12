package com.akw.ex04_pl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerAppearancesDto {
    private String playerName;
    private String season;
    private int totalMatches;
    private int goals;
    private int assists;
}
