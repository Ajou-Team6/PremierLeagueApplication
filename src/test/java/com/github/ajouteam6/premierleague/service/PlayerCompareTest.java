package com.github.ajouteam6.premierleague.service;

import com.github.ajouteam6.premierleague.domain.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;

// 종인
@RunWith(MockitoJUnitRunner.class)
public class PlayerCompareTest {
    PlayerCompare playerCompare;
    Player Heungmin_Son;
    Player Harry_kane;

    @Before
    public void initializeTestAttributesAboutCompare() {
        playerCompare = PlayerCompare.builder().build();
        Harry_kane = Player.builder()
                .personalDetails(new Player.PersonalDetails("Harry Kane", "Tottenham Hotspur", 7, "Forward", "UK", 23, 182))
                .attackStats(new Player.AttackStats(17, 4,102, 46, 20))
                .defenceStats(new Player.DefenceStats(12, 9, 1, 5, 22, 14))
                .build();

        Heungmin_Son = Player.builder()
                .personalDetails(new Player.PersonalDetails("Son Heung-Min", "Tottenham Hotspur", 7, "Forward", "ROK", 23, 178))
                .attackStats(new Player.AttackStats(12, 6,74, 29, 25))
                .defenceStats(new Player.DefenceStats(4, 23, 8, 10, 11, 4))
                .build();
    }

    @Test
    public void twoPlayerCompareByGoalTest() {
        assertThat(playerCompare.twoPlayerCompareByGoal(Heungmin_Son, Harry_kane), sameInstance(Harry_kane));
    }

    @Test
    public void twoPlayerCompareByAttackPointTest() {
        assertThat(playerCompare.twoPlayerCompareByAttackPoint(Heungmin_Son, Harry_kane), sameInstance(Harry_kane));
    }

    @Test
    public void twoPlayerCompareByDefencePointTest() {
        assertThat(playerCompare.twoPlayerCompareByDefencePoint(Heungmin_Son, Harry_kane), sameInstance(Heungmin_Son));
    }

}
