package com.github.ajouteam6.premierleague.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TeamTest {
    private List<Team> playerList = new ArrayList<Team>();

    //test 전에 실행

    @Before
    public void setUp(){
        Team striker = new Team();
        striker.setTeamStat(new TeamStat.teamStat(
                1,
                1,
                3,
                2,
                1,
                15,
                3,
                5));

        striker.setOverView(new TeamOverView.overView(
                "2019년7월17일"
        ));




//5개의 챔피언 객체를 만듭니다.
        Champion topChamp = new Champion("다리우스", "탑");
        Champion jungleChamp = new Champion("리신", "정글");
        Champion midChamp = new Champion("르블랑", "미드");
        Champion adcChamp = new Champion("베인", "바텀");
        Champion supportChamp = new Champion("레오나", "바텀");

        //앞서 만든 List 에 각 챔피언을 추가합니다.
        championList.add(topChamp);
        championList.add(jungleChamp);
        championList.add(midChamp);
        championList.add(adcChamp);
        championList.add(supportChamp);

    }

    @Test
}

