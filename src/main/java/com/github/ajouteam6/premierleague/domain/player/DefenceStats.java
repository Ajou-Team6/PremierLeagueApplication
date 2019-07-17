package com.github.ajouteam6.premierleague.domain.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//명수
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public  class DefenceStats {
    private int cleanSheets;
    private int tackles;
    private int interception;
    private int dualsWon;
    private int dualLost;
    private int clearances;
}