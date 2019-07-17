package com.github.ajouteam6.premierleague.domain;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {

    //연호
    private List<Player> PlayerList = new ArrayList<Player>();

    @Before
    public void setUp() {
        Player salah = new Player.PlayerBuilder()
                .personalDetails(new Player.PersonalDetails.PersonalDetailsBuilder()
                        .name("Mohamed Salah")
                        .team("Liverpool")
                        .backNumber(11)
                        .position("Forward")
                        .nationality("Egypt")
                        .age(27)
                        .build()
                )
                .attackStats(new Player.AttackStats.AttackStatsBuilder()
                        .goals(56)
                        .assists(19)
                        .shots(304)
                        .shotsOnTarget(138)
                        .passes(2268)
                        .build()
                )
                .defenceStats(new Player.DefenceStats.DefenceStatsBuilder()
                        .cleanSheets(15)
                        .tackles(21)
                        .interception(5)
                        .dualsWon(143)
                        .dualLost(283)
                        .clearances(4)
                        .build()
                ).build();
    }
}