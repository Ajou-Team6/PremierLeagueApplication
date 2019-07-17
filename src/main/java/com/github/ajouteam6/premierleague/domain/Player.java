package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//연호
@AllArgsConstructor
@Data
@Builder
public class Player {

    private PersonalDetails personalDetails;
    private AttackStats attackStats;
    private DefenceStats defenceStats;

    @AllArgsConstructor
    @Data
    @Builder
    public static class PersonalDetails {
        private String name;
        private String team;
        private int backNumber;
        private String position;
        private String nationality;
        private int age;
        private int height;
    }

    @AllArgsConstructor
    @Data
    @Builder
    public static class AttackStats {
        private int goals;
        private int assists;
        private int shots;
        private int shotsOnTarget;
        private int mostPasses;
    }

    @AllArgsConstructor
    @Data
    @Builder
    public static class DefenceStats {
        private int cleanSheets;
        private int tackles;
        private int interception;
        private int dualsWon;
        private int dualLost;
        private int clearances;
    }

}
