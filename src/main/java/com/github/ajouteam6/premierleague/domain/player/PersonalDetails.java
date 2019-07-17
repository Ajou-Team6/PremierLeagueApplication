package com.github.ajouteam6.premierleague.domain.player;

import lombok.Builder;
import lombok.Data;

//명수
@Data
@Builder
public class PersonalDetails {
    private String name;
    private String team;
    private int backNumber;
    private String position;
    private String nationality;
    private int age;
    private int height;
}