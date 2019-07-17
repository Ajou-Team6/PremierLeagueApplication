package com.github.ajouteam6.premierleague.service;

import com.github.ajouteam6.premierleague.domain.AttackStats;
import com.github.ajouteam6.premierleague.domain.DefenceStats;
import com.github.ajouteam6.premierleague.domain.PersonalDetails;
import com.github.ajouteam6.premierleague.domain.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.*;
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
                .personalDetails(new PersonalDetails("Harry Kane", "Tottenham Hotspur", 7, "Forward", "UK", 23))
                .attackStats(new AttackStats(17, 4,102, 46, 20))
                .defenceStats(new DefenceStats(12, 9, 1, 5, 22, 14))
                .build();

        Heungmin_Son = Player.builder()
                .personalDetails(new PersonalDetails("Son Heung-Min", "Tottenham Hotspur", 7, "Forward", "ROK", 23))
                .attackStats(new AttackStats(12, 6,74, 29, 25))
                .defenceStats(new DefenceStats(4, 23, 8, 10, 11, 4))
                .build();
    }

    @Test
    public void twoPlayerCompareByGoalTest() {
        assertThat(playerCompare.twoPlayerCompareByGoal(Heungmin_Son, Harry_kane, 0), greaterThan(0));
        assertThat(playerCompare.twoPlayerCompareByGoal(Heungmin_Son, Harry_kane, 1), lessThan(0));
    }

    @Test
    public void twoPlayerCompareByAttackPointTest() {
        assertThat(playerCompare.twoPlayerCompareByAttackPoint(Heungmin_Son, Harry_kane, 0), greaterThan(0));
        assertThat(playerCompare.twoPlayerCompareByAttackPoint(Heungmin_Son, Harry_kane, 1), lessThan(0));
    }

    @Test
    public void twoPlayerCompareByDefencePointTest() {
        assertThat(playerCompare.twoPlayerCompareByDefencePoint(Heungmin_Son, Harry_kane, 0), lessThan(0));
        assertThat(playerCompare.twoPlayerCompareByDefencePoint(Heungmin_Son, Harry_kane, 1), greaterThan(0));
    }

}
