package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//연호
@AllArgsConstructor
@Builder
@Data
public class Player {

    private PersonalDetails personalDetails;
    private AttackStats attackStats;
    private DefenceStats defenceStats;

    @Data
    public static class PersonalDetails {
        private String name;
        private String team;
        private int backNumber;
        private String position;
        private String country;
        private int age;
    }

    @Data
    public static class AttackStats {
        private int goals;
        private int assists;
        private int shots;
        private int shotsOnTarget;
        private int mostPasses;
    }

    @Data
    public static class DefenceStats {
        private int cleanSheets;
        private int tackles;
        private int interception;
        private int dualsWon;
        private int dualLost;
        private int clearances;
    }

}
