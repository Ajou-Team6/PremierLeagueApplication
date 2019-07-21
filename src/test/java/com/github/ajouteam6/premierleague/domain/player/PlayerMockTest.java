package com.github.ajouteam6.premierleague.domain.player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class PlayerMockTest {

    @Mock
    PersonalDetails personalDetails;

    @Mock
    AttackStats attackStats;

    @Mock
    DefenceStats defenceStats;

    @InjectMocks
    Player player1;

    @Mock
    Player player2;

    @Test
    public void player_Mock_객체_만들기_테스트() {
        assertTrue(player1 != null);
    }

    @Test
    public void player의_이름을_가져오면_기성용을_리턴한다() {
        when(personalDetails.getName()).thenReturn("Ki Seong Yong");
        personalDetails.setName("Lee Chung Yong");
        assertThat(personalDetails.getName(), is("Ki Seong Yong"));
    }

    @Test
    public void player의_수비_스탯을_가져오는_로직이_2번_이상_실행되는지_테스트() {
        defenceStats = DefenceStats.builder()
                .cleanSheets(15)
                .tackles(21)
                .interception(5)
                .dualsWon(143)
                .dualLost(283)
                .clearances(4)
                .build();
        when(player2.getDefenceStats()).thenReturn(defenceStats);
        System.out.println(player2.getDefenceStats());
        System.out.println(player2.getDefenceStats());
        System.out.println(player2.getDefenceStats());
        System.out.println(player2.getDefenceStats());
        verify(player2, atLeast(2)).getDefenceStats();
    }

    @Test
    public void player의_개인_정보를_가져오는_로직이_300ms이내에_3번_실행되는지_테스트() {
        personalDetails = PersonalDetails.builder()
                .name("Mohamed Salah")
                .team("Liverpool")
                .backNumber(11)
                .position("Forward")
                .nationality("Egypt")
                .age(27)
                .build();
        when(player2.getPersonalDetails()).thenReturn(personalDetails);
        System.out.println(player2.getPersonalDetails());
        System.out.println(player2.getPersonalDetails());
        System.out.println(player2.getPersonalDetails());
        verify(player2, timeout(300).atLeast(3)).getPersonalDetails();
    }
    @Test
    public void player에_공격_스탯을_저장하는_횟수가_2번인지_테스트() {
        attackStats = AttackStats.builder()
                .goals(56)
                .assists(19)
                .shots(304)
                .shotsOnTarget(138)
                .passes(2268)
                .build();
        player2.setAttackStats(attackStats);
        player2.setAttackStats(attackStats);

        verify(player2, times(2)).setAttackStats(any(AttackStats.class));
    }

}
