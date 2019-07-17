package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//명수
@Data
@Builder
@AllArgsConstructor
public class DefenceStats {
    private int cleanSheets;
    private int tackles;
    private int interception;
    private int dualsWon;
    private int dualLost;
    private int clearances;
}