package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
public class Team {

    private teamStat teamStat;
    private overView overView;

    Player squardList = new Player();

    @AllArgsConstructor
    // teamStat -> Position(순위), Play, wins, draw, loss, goal difference, point
    public static class teamStat{
        int position;
        int playCount;
        int win;
        int draw;
        int loss;
        int goal;
        int difference;
        int points;
    }

    // overView -> 창단연도, 연고지, 팀이름, 감독이름, 팀 컬러
    public static class overView{
        String foundationYear;
        String anchorage;
        String teamName;
        String directorName;
        String teamColor;
    }


}
