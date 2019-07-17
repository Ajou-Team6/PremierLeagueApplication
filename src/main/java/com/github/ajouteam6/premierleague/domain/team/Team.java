package com.github.ajouteam6.premierleague.domain.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 주호
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    private TeamStat teamStat;
    private TeamOverView overView;
    private TeamSquadList squadList;
}
