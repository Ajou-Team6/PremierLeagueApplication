package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//연호
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private PersonalDetails personalDetails;
    private AttackStats attackStats;
    private DefenceStats defenceStats;
}
