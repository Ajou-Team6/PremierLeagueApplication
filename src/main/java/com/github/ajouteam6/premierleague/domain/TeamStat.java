package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;

public class TeamStat {
    @AllArgsConstructor
    // teamStat -> Position(순위), Play, wins, draw, loss, goal difference, point
    static class teamStat {
        int position;
        int playCount;
        int win;
        int draw;
        int loss;
        int goal;
        int difference;
        int points;
    }
}