package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 주호
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamStat {
    private int position;
    private int playCount;
    private int win;
    private int draw;
    private int loss;
    private int goal;
    private int difference;
    private int points;

}