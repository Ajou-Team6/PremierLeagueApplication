package com.github.ajouteam6.premierleague.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

//주호
public class TeamTest {
    private List<Team> TeamList = new ArrayList<Team>();

    //test 전에 실행
    @Before
    public void setUp() {
        Team striker = new Team();

        striker.setTeamStat(new TeamStat(
                1,
                6,
                3,
                2,
                1,
                15,
                3,
                5));

        striker.setOverView(new TeamOverView(
                "2019,7,17,",
                "korea",
                "Test",
                "주호",
                "Blue"));

        striker.setSquadList(new TeamSquadList(
                "박주호"
        ));

        TeamList.add(striker);
    }

    // 주호..
    @Test
    public void TeamStat에_모든_변수에_숫자가_들어갈_경우_True() {
        Team ManchesterUnited = new Team();
        ManchesterUnited.setTeamStat(new TeamStat(
                5,
                10,
                5,
                3,
                2,
                15,
                3,
                5
        ));

        assertThat(ManchesterUnited.getTeamStat().getPosition(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getPlayCount(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getWin(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getDraw(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getLoss(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getGoal(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getDifference(), instanceOf(Integer.class));
        assertThat(ManchesterUnited.getTeamStat().getPoints(), instanceOf(Integer.class));

    }


    // 주호..
    @Test
    public void OverView에_모든_변수에_문자가_들어갈_경우_True() {
        Team Barcelona = new Team();
        Barcelona.setOverView(new TeamOverView(
                "2019,7,18,",
                "America",
                "Zion.t",
                "DevJuho",
                "Red"
        ));

        assertThat(Barcelona.getOverView().getFoundationYear(), instanceOf(String.class));
        assertThat(Barcelona.getOverView().getAnchorage(), instanceOf(String.class));
        assertThat(Barcelona.getOverView().getTeamName(), instanceOf(String.class));
        assertThat(Barcelona.getOverView().getDirectorName(), instanceOf(String.class));
        assertThat(Barcelona.getOverView().getTeamColor(), instanceOf(String.class));


   }

    // 주호..
    @Test
    public void squardList에_플레이어가_박주호이면_TRUE() {
        String startString ="박";
        String middleString ="주";
        String endString ="호";

        Team Liverpool = new Team();
        Liverpool.setSquadList(new TeamSquadList(
                "박주호"
        ));

        assertThat(Liverpool.getSquadList().getPlayer(), is("박주호"));
        assertThat("박주호", equalTo(Liverpool.getSquadList().getPlayer()));
        assertThat("우주호", not(equalTo(Liverpool.getSquadList().getPlayer())));
        assertThat(Liverpool.getSquadList().getPlayer(), is(startsWith("박")));
        assertThat(Liverpool.getSquadList().getPlayer(), is(endsWith(endString)));
        assertThat(Liverpool.getSquadList().getPlayer(), allOf(startsWith(startString), containsString(middleString), containsString(endString)));
        assertThat(Liverpool.getSquadList().getPlayer(), hasToString("박주호"));
    }

    // 주호..
    @Test
    public void List에_등록된_팀카운트(){
        assertThat(TeamList.size(),is(1));
        assertThat(TeamList, hasSize(1));
    }

    // 주호..
    @Test
    public void shouldHasProperty(){
        assertThat(TeamList.get(0).getTeamStat(), hasProperty("position"));
        assertThat(TeamList.get(0).getSquadList(), hasProperty("player"));
        assertThat(TeamList.get(0).getOverView(), hasProperty("foundationYear"));
    }







}

