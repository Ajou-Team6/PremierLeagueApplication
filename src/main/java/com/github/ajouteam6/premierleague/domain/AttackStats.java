package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//명수
@Data
@Builder
@AllArgsConstructor
public class AttackStats {
    private int goals;
    private int assists;
    private int shots;
    private int shotsOnTarget;
    private int passes;
}
