package com.github.ajouteam6.premierleague.service;

import com.github.ajouteam6.premierleague.domain.player.Player;
import lombok.Builder;
import lombok.Data;

// 종인
@Builder
@Data
public class PlayerCompare {

    // Condition 0은 내림차순, 1은 오름차순
    public int twoPlayerCompareByGoal(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Goal: ", firstPlayer, secondPlayer, firstPlayer.getAttackStats().getGoals(), secondPlayer.getAttackStats().getGoals());
        if(isDescendingOrder(condition)) return secondPlayer.getAttackStats().getGoals() - firstPlayer.getAttackStats().getGoals();
        return firstPlayer.getAttackStats().getGoals() - secondPlayer.getAttackStats().getGoals();
    }

    public int twoPlayerCompareByAttackPoint(Player firstPlayer, Player secondPlayer, int condition) {
        int firstPlayerAttackPoint = getPlayerAttackPoint(firstPlayer);
        int secondPlayerAttackPoint = getPlayerAttackPoint(secondPlayer);
        logCompareMethods("AP: ", firstPlayer, secondPlayer, firstPlayerAttackPoint,secondPlayerAttackPoint);
        if(isDescendingOrder(condition)) return secondPlayerAttackPoint - firstPlayerAttackPoint;
        return firstPlayerAttackPoint - secondPlayerAttackPoint;
    }

    public int twoPlayerCompareByDefencePoint(Player firstPlayer, Player secondPlayer, int condition) {
        int firstPlayerDefencePoint = getPlayerDefencePoint(firstPlayer);
        int secondPlayerDefencePoint = getPlayerDefencePoint(secondPlayer);
        logCompareMethods("DP: ", firstPlayer, secondPlayer, firstPlayerDefencePoint,secondPlayerDefencePoint);
        if(isDescendingOrder(condition)) return secondPlayerDefencePoint - firstPlayerDefencePoint;
        return firstPlayerDefencePoint - secondPlayerDefencePoint;
    }

    private boolean isDescendingOrder(int condition) {
        return condition == 0;
    }

    private int getPlayerDefencePoint(Player player) {
        return player.getDefenceStats().getDualsWon() + player.getDefenceStats().getTackles() + player.getDefenceStats().getClearances() +
                player.getDefenceStats().getInterception() + player.getDefenceStats().getClearances();
    }

    private int getPlayerAttackPoint(Player player) {
        return player.getAttackStats().getGoals() + player.getAttackStats().getAssists();
    }

    private void logCompareMethods(String logWhat, Player firstPlayer, Player secondPlayer, int firstPoint, int secondPoint) {
        System.out.println(logWhat + firstPlayer.getPersonalDetails().getName() + " : " + firstPoint
                + ", " + secondPlayer.getPersonalDetails().getName() + " : " + secondPoint);
    }
}
