package com.github.ajouteam6.premierleague.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 주호
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TeamSquadList {

    private String player;
}
