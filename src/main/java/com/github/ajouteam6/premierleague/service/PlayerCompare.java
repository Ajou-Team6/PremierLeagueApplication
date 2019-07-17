package com.github.ajouteam6.premierleague.service;

import com.github.ajouteam6.premierleague.domain.Player;
import lombok.Builder;
import lombok.Data;

// 종인
@Builder
@Data
public class PlayerCompare {

    public Player twoPlayerCompareByGoal(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.getAttackStats().getGoals() > secondPlayer.getAttackStats().getGoals())
            return firstPlayer;
        return secondPlayer;
    }

    public Player twoPlayerCompareByAttackPoint(Player firstPlayer, Player secondPlayer) {
        int firstPlayerAttackPoint = getPlayerAttackPoint(firstPlayer);
        int secondPlayerAttackPoint = getPlayerAttackPoint(secondPlayer);
        if (firstPlayerAttackPoint > secondPlayerAttackPoint) return firstPlayer;
        return secondPlayer;
    }

    private int getPlayerAttackPoint(Player firstPlayer) {
        return firstPlayer.getAttackStats().getGoals() + firstPlayer.getAttackStats().getAssists();
    }
}
