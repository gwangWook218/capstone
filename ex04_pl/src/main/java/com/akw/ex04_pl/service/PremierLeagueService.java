package com.akw.ex04_pl.service;

import com.akw.ex04_pl.dto.*;
import com.akw.ex04_pl.dto.api5.DefenderRankDto;
import com.akw.ex04_pl.dto.api5.ForwardRankDto;
import com.akw.ex04_pl.dto.api5.GoalkeeperRankDto;
import com.akw.ex04_pl.dto.api5.MidfielderRankDto;
import com.akw.ex04_pl.mapper.PremierLeagueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremierLeagueService {

    @Autowired
    private PremierLeagueMapper premierLeagueMapper;

    public List<Min75GoalsDto> getClutchGoals() {
        return premierLeagueMapper.getClutchGoals();
    }

    public List<TimeRangeGoalsDto> getSeasonTimeRangeGoals(String season) {
        return premierLeagueMapper.getSeasonTimeRangeGoals(season);
    }

    public List<ClubMatchResultDto> getClubMatchResult(String season, int clubId, String matchType, String resultFilter) {
        return premierLeagueMapper.getClubMatchResult(season, clubId, matchType, resultFilter);
    }

    public List<PlayerResultDto> getPlayerResult(int playerId) {
        return premierLeagueMapper.getPlayerResult(playerId);
    }

//    API 5
    public List<ForwardRankDto> getRankOfForward(String season) {
        return premierLeagueMapper.getRankOfForward(season);
    }
    public List<MidfielderRankDto> getRankOfMidfielder(String season) {
        return premierLeagueMapper.getRankOfMidfielder(season);
    }
    public List<DefenderRankDto> getRankOfDefender(String season) {
        return premierLeagueMapper.getRankOfDefender(season);
    }
    public List<GoalkeeperRankDto> getRankOfGoalkeeper(String season) {
        return premierLeagueMapper.getRankOfGoalkeeper(season);
    }

    public List<ClubRankDto> getClubRank(String season, String orderBy) {
        return premierLeagueMapper.getClubRank(season, orderBy);
    }

    public List<PlayerAppearancesDto> getPlayerAppearances(int playerId) {
        return premierLeagueMapper.getPlayerAppearances(playerId);
    }
}
