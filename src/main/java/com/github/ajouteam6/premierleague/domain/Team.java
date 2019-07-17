package com.github.ajouteam6.premierleague.domain;

import lombok.Data;

@Data
public class Team {

    private TeamStat.teamStat teamStat;
    private TeamOverView.overView overView;

    Player squardList = new Player();

}
