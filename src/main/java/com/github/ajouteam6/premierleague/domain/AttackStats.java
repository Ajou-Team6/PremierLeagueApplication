package com.github.ajouteam6.premierleague.domain;

import lombok.*;
//명수
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttackStats {
    private int goals;
    private int assists;
    private int shots;
    private int shotsOnTarget;
    private int passes;
}
