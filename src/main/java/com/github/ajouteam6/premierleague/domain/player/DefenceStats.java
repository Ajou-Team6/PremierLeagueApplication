package com.github.ajouteam6.premierleague.domain.player;

import lombok.Builder;
import lombok.Data;

//명수
@Data
@Builder
public class DefenceStats {
    private int cleanSheets;
    private int tackles;
    private int interception;
    private int dualsWon;
    private int dualLost;
    private int clearances;
}