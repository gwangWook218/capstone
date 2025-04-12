package com.akw.ex04_pl.controller;

import com.akw.ex04_pl.dto.*;
import com.akw.ex04_pl.dto.api5.DefenderRankDto;
import com.akw.ex04_pl.dto.api5.ForwardRankDto;
import com.akw.ex04_pl.dto.api5.GoalkeeperRankDto;
import com.akw.ex04_pl.dto.api5.MidfielderRankDto;
import com.akw.ex04_pl.service.PremierLeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PremierLeagueController {

    @Autowired
    private final PremierLeagueService premierLeagueService;

    @GetMapping("/goals/clutch-time")
    public List<Min75GoalsDto> getClutchGoals() {
        return premierLeagueService.getClutchGoals();
    }

    @GetMapping("/time-range-goals")
    public List<TimeRangeGoalsDto> getSeasonTimeRangeGoals(@RequestParam String season) {
        return premierLeagueService.getSeasonTimeRangeGoals(season);
    }

    @GetMapping("/match-result")
    public List<ClubMatchResultDto> getClubMatchResult(
            @RequestParam String season,
            @RequestParam int clubId,
            @RequestParam(required = false) String matchType,
            @RequestParam(required = false) String resultFilter
    ) {
        return premierLeagueService.getClubMatchResult(season, clubId, matchType, resultFilter);
    }

    @GetMapping("/player-result")
    public List<PlayerResultDto> getPlayerResult(@RequestParam int playerId) {
        return premierLeagueService.getPlayerResult(playerId);
    }

//    API 5
    @GetMapping("/rank/fw")
    public List<ForwardRankDto> getRankOfForward(@RequestParam String season) {
        return premierLeagueService.getRankOfForward(season);
    }
    @GetMapping("/rank/mf")
    public List<MidfielderRankDto> getRankOfMidfielder(@RequestParam String season) {
        return premierLeagueService.getRankOfMidfielder(season);
    }
    @GetMapping("/rank/df")
    public List<DefenderRankDto> getRankOfDefender(@RequestParam String season) {
        return premierLeagueService.getRankOfDefender(season);
    }
    @GetMapping("/rank/gk")
    public List<GoalkeeperRankDto> getRankOfGoalkeeper(@RequestParam String season) {
        return premierLeagueService.getRankOfGoalkeeper(season);
    }

    @GetMapping("/club-ranking")
    public List<ClubRankDto> getClubRank(@RequestParam String season, @RequestParam String orderBy) {
        return premierLeagueService.getClubRank(season, orderBy);
    }

    @GetMapping("/player-appearance")
    public List<PlayerAppearancesDto> getPlayerAppearances(@RequestParam int playerId) {
        return premierLeagueService.getPlayerAppearances(playerId);
    }
}
