package com.akw.ex04_pl.mapper;

import com.akw.ex04_pl.dto.*;
import com.akw.ex04_pl.dto.api5.DefenderRankDto;
import com.akw.ex04_pl.dto.api5.ForwardRankDto;
import com.akw.ex04_pl.dto.api5.GoalkeeperRankDto;
import com.akw.ex04_pl.dto.api5.MidfielderRankDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PremierLeagueMapper {
    List<Min75GoalsDto> getClutchGoals();
    List<TimeRangeGoalsDto> getSeasonTimeRangeGoals(@Param("season") String season);
    List<ClubMatchResultDto> getClubMatchResult(
            @Param("season") String season,
            @Param("clubId") int clubId,
            @Param("matchType") String matchType,
            @Param("resultFilter") String resultFilter
    );
    List<PlayerResultDto> getPlayerResult(@Param("playerId") int playerId);

    List<ForwardRankDto> getRankOfForward(@Param("season") String season);
    List<MidfielderRankDto> getRankOfMidfielder(@Param("season") String season);
    List<DefenderRankDto> getRankOfDefender(@Param("season") String season);
    List<GoalkeeperRankDto> getRankOfGoalkeeper(@Param("season") String season);

    List<ClubRankDto> getClubRank(@Param("season") String season, @Param("orderBy") String orderBy);
    List<PlayerAppearancesDto> getPlayerAppearances(@Param("playerId") int playerId);
}
