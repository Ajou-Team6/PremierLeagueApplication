package com.github.ajouteam6.premierleague.domain;

import lombok.Builder;
import lombok.Data;

//연호
@Data
@Builder
public class Player {

    PersonalDetails personalDetails;
    AttackStats attackStats;
    DefenceStats defenceStats;

    @Data
    @Builder
    public static class PersonalDetails {
        private String name;
        private String team;
        private int backNumber;
        private String position;
        private String country;
        private int age;
    }

    @Data
    @Builder
    public static class AttackStats {
        private int goals;
        private int assists;
        private int shots;
        private int shotsOnTarget;
        private int mostPasses;
    }

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
