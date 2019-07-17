package com.github.ajouteam6.premierleague.domain.player;

import lombok.Builder;
import lombok.Data;

//명수
@Data
@Builder
public class AttackStats {
    private int goals;
    private int assists;
    private int shots;
    private int shotsOnTarget;
    private int passes;
}
