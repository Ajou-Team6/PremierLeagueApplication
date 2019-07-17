package com.github.ajouteam6.premierleague.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 주호
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamOverView {// overView -> 창단연도, 연고지, 팀이름, 감독이름, 팀 컬러
    private String foundationYear;
    private String anchorage;
    private String teamName;
    private String directorName;
    private String teamColor;

}