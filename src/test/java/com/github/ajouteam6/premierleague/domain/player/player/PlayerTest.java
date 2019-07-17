package com.github.ajouteam6.premierleague.domain.player.player;

import com.github.ajouteam6.premierleague.domain.player.AttackStats;
import com.github.ajouteam6.premierleague.domain.player.DefenceStats;
import com.github.ajouteam6.premierleague.domain.player.PersonalDetails;
import com.github.ajouteam6.premierleague.domain.player.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

//연호
public class PlayerTest {

    private List<Player> liverpoolPlayerList = new ArrayList<Player>();

    @Before
    public void setUp() {
        Player salah =
                Player.builder()
                        .personalDetails(
                                PersonalDetails.builder()
                                        .name("Mohamed Salah")
                                        .team("Liverpool")
                                        .backNumber(11)
                                        .position("Forward")
                                        .nationality("Egypt")
                                        .age(27)
                                        .build()
                        )
                        .attackStats(
                                AttackStats.builder()
                                        .goals(56)
                                        .assists(19)
                                        .shots(304)
                                        .shotsOnTarget(138)
                                        .passes(2268)
                                        .build()
                        )
                        .defenceStats(
                                DefenceStats.builder()
                                        .cleanSheets(15)
                                        .tackles(21)
                                        .interception(5)
                                        .dualsWon(143)
                                        .dualLost(283)
                                        .clearances(4)
                                        .build()
                        ).build();

        liverpoolPlayerList.add(salah);

    }

    @Test
    public void personalDetails의_getName이_Mohamed_Salah이면_True() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getName(), is("Mohamed Salah"));
    }

    @Test
    public void personalDetails의_getName에_Salah가_포함면_True() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getName(), containsString("Salah"));
    }

    @Test
    public void personalDetails의_getTeam이_Liverpool이면_True() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getTeam(), is("Liverpool"));
    }

    @Test
    public void personalDetails의_getBackNumber가_11이면_True() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getBackNumber(), is(11));
    }

    @Test
    public void personalDetails의_getPosition이_Midfielder이면_False() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getPosition(), not("Midfielder"));
    }

    @Test
    public void personalDetails의_getNationality가_Senegal이면_False() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getNationality(), not("Senegal"));
    }

    @Test
    public void personalDetails의_getAge가_int타입이면_True() {
        assertThat(liverpoolPlayerList.get(0).getPersonalDetails().getAge(), instanceOf(int.class));
    }

    @Test
    public void attackStats의_getGoals가_50이상이면_True() {
        assertThat(liverpoolPlayerList.get(0).getAttackStats().getGoals(), greaterThan(50));
    }

    @Test
    public void attackStats의_getAssists가_20이하이면_True() {
        assertThat(liverpoolPlayerList.get(0).getAttackStats().getAssists(), lessThan(20));
    }

    @Test
    public void attackStats의_getShots가_null이_아니면_True() {
        assertThat(liverpoolPlayerList.get(0).getAttackStats().getShots(), notNullValue());
    }

    @Test
    public void attackStats에_passes가_있으면_True() {
        assertThat(liverpoolPlayerList.get(0).getAttackStats(), hasProperty("passes"));
    }

    @Test
    public void defenceStats의_cleanSheat가_15와_같으면_True() {
        assertThat(liverpoolPlayerList.get(0).getDefenceStats().getCleanSheets(), is(equalTo(15)));
    }

    @Test
    public void defenceStats의_tackles가_float형이_아니면_True() {
        assertThat(liverpoolPlayerList.get(0).getDefenceStats().getTackles(), not(instanceOf(float.class)));
    }

    @Test
    public void defenceStats의_interception이_int형이고_float형이_아니면_True() {
        assertThat(liverpoolPlayerList.get(0).getDefenceStats().getInterception(), allOf(is(instanceOf(int.class)), not(is(instanceOf(float.class)))));
    }

    @Test
    public void defenceStats의_dualsWon이_있거나_dualsLost가_있으면_True() {
        assertThat(liverpoolPlayerList.get(0).getDefenceStats(), anyOf(hasProperty("dualWon"), hasProperty("dualLost")));
    }

    @Test
    public void defenceStats의_clearances가_20보다_크거나_같지_않으면_True() {
        assertThat(liverpoolPlayerList.get(0).getDefenceStats().getClearances(), not(greaterThanOrEqualTo(20)));
    }

}