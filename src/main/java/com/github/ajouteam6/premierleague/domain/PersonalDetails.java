package com.github.ajouteam6.premierleague.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//명수
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetails {
    private String name;
    private String team;
    private int backNumber;
    private String position;
    private String country;
    private int age;
}