package com.github.ajouteam6.premierleague.service;

import com.github.ajouteam6.premierleague.domain.Player;
import org.junit.Test;

// 종인
public class PlayerCompareTest {
    Player Heungmin_Son = Player.builder()
            .personalDetails(new Player.PersonalDetails("Son Heung-Min", "Tottenham Hotspur", 7, "Forward", "Republic of Korea", 23))
            .attackStats(new Player.AttackStats(12, 6,74, 29, 25))
            .defenceStats(new Player.DefenceStats(4, 23, 8, 10, 11, 4))
            .build();

    Player Harry_kane = Player.builder()
            .personalDetails(new Player.PersonalDetails("Harry Kane", "Tottenham Hotspur", 7, "Forward", "Republic of Korea", 23))
            .attackStats(new Player.AttackStats(17, 4,102, 46, 20))
            .defenceStats(new Player.DefenceStats(12, 9, 1, 5, 22, 14))
            .build();

    @Test
    public void twoPlayerCompareTest() {

    }

}
