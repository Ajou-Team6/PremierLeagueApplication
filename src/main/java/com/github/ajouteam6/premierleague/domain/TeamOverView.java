package com.github.ajouteam6.premierleague.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 주호
@Data
@Builder

@NoArgsConstructor
public class TeamOverView {// overView -> 창단연도, 연고지, 팀이름, 감독이름, 팀 컬러
    @AllArgsConstructor
    static class overView {
        String foundationYear;
        String anchorage;
        String teamName;
        String directorName;
        String teamColor;
    }
}