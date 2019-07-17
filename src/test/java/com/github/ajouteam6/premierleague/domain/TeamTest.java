package com.github.ajouteam6.premierleague.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

//주호
public class TeamTest {
    private List<Team> playerList = new ArrayList<Team>();

    //test 전에 실행
    @Before
    public void setUp() {
        Team striker = new Team();
        Team midFielder = new Team();
        Team goalKeeper = new Team();
        Team wingBack = new Team();

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
                "2019,7,17,",
                "korea",
                "Test",
                "주호",
                "Blue"));

        striker.setSquadList(new TeamSquadList.squadList(
                "박주호"
        ));
    }

    // 주호..
    @Test
    public void TeamStat에_모든_변수에_숫자가_들어갈_경우_True() {
        Team ManchesterUnited = new Team();
        ManchesterUnited.setTeamStat(new TeamStat.teamStat(
                1,
                1,
                3,
                2,
                1,
                15,
                3,
                5
        ));

        isStringNumManchesterUnited.getTeamStat().position
        System.out.println(ManchesterUnited.getTeamStat().position);
//        assertThat("class java.lang.String",is(ManchesterUnited.getOverView().foundationYear.getClass().toString()));
//        assertThat("class java.lang.String",is(ManchesterUnited.getOverView().anchorage.getClass().toString()));
//        assertThat("class java.lang.String",is(ManchesterUnited.getOverView().teamName.getClass().toString()));
//        assertThat("class java.lang.String",is(ManchesterUnited.getOverView().directorName.getClass().toString()));
//        assertThat("class java.lang.String",is(ManchesterUnited.getOverView().teamColor.getClass().toString()));

    }


    // 주호..
    @Test
    public void OverView에_모든_변수에_문자가_들어갈_경우_True() {
        Team Barcelona = new Team();
        Barcelona.setOverView(new TeamOverView.overView(
                "2019,7,17,",
                "korea",
                "Test",
                "주호",
                "Blue"
        ));
        assertThat("class java.lang.String",is(Barcelona.getOverView().foundationYear.getClass().toString()));
        assertThat("class java.lang.String",is(Barcelona.getOverView().anchorage.getClass().toString()));
        assertThat("class java.lang.String",is(Barcelona.getOverView().teamName.getClass().toString()));
        assertThat("class java.lang.String",is(Barcelona.getOverView().directorName.getClass().toString()));
        assertThat("class java.lang.String",is(Barcelona.getOverView().teamColor.getClass().toString()));

   }

    // 주호..
    @Test
    public void squardList에_플레이어가_박주호이면_TRUE() {
        Team Liverpool = new Team();
        Liverpool.setSquadList(new TeamSquadList.squadList(
                "박주호"
        ));
        assertThat("박주호", is(Liverpool.getSquadList().player));
    }



}

