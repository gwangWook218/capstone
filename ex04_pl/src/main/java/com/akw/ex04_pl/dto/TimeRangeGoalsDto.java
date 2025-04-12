package com.akw.ex04_pl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TimeRangeGoalsDto {
    private String season;
    private String timeRange;
    private int goals;
}
