package com.github.ajouteam6.premierleague.service;

import com.github.ajouteam6.premierleague.domain.player.Player;
import lombok.Builder;
import lombok.Data;

// 종인
@Builder
@Data
public class PlayerCompare {


    // Condition 0은 내림차순, 1은 오름차순
    // Goal
    public int twoPlayerCompareByGoal(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Goal: ", firstPlayer, secondPlayer, firstPlayer.getAttackStats().getGoals(), secondPlayer.getAttackStats().getGoals());
        if(isDescendingOrder(condition)) return secondPlayer.getAttackStats().getGoals() - firstPlayer.getAttackStats().getGoals();
        return firstPlayer.getAttackStats().getGoals() - secondPlayer.getAttackStats().getGoals();
    }
    // Assist
    public int twoPlayerCompareByAssist(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Assist: ", firstPlayer, secondPlayer, firstPlayer.getAttackStats().getAssists(), secondPlayer.getAttackStats().getAssists());
        if(isDescendingOrder(condition)) return secondPlayer.getAttackStats().getAssists() - firstPlayer.getAttackStats().getAssists();
        return firstPlayer.getAttackStats().getAssists() - secondPlayer.getAttackStats().getAssists();
    }

    // Shots
    public int twoPlayerCompareByShots(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Shots: ", firstPlayer, secondPlayer, firstPlayer.getAttackStats().getShots(), secondPlayer.getAttackStats().getShots());
        if(isDescendingOrder(condition)) return secondPlayer.getAttackStats().getShots() - firstPlayer.getAttackStats().getShots();
        return firstPlayer.getAttackStats().getShots() - secondPlayer.getAttackStats().getShots();
    }

    // ShotsOnTarget
    public int twoPlayerCompareByShotsOnTarget(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("ShotsOnTarget: ", firstPlayer, secondPlayer, firstPlayer.getAttackStats().getShotsOnTarget(), secondPlayer.getAttackStats().getShotsOnTarget());
        if(isDescendingOrder(condition)) return secondPlayer.getAttackStats().getShotsOnTarget() - firstPlayer.getAttackStats().getShotsOnTarget();
        return firstPlayer.getAttackStats().getShotsOnTarget() - secondPlayer.getAttackStats().getShotsOnTarget();
    }

    // Passes
    public int twoPlayerCompareByPasses(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Passes: ", firstPlayer, secondPlayer, firstPlayer.getAttackStats().getPasses(), secondPlayer.getAttackStats().getPasses());
        if(isDescendingOrder(condition)) return secondPlayer.getAttackStats().getPasses() - firstPlayer.getAttackStats().getPasses();
        return firstPlayer.getAttackStats().getPasses() - secondPlayer.getAttackStats().getPasses();
    }

    // CleanSheets
    public int twoPlayerCompareByCleanSheets(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Clean Sheets: ", firstPlayer, secondPlayer, firstPlayer.getDefenceStats().getCleanSheets(), secondPlayer.getDefenceStats().getCleanSheets());
        if(isDescendingOrder(condition)) return secondPlayer.getDefenceStats().getCleanSheets() - firstPlayer.getDefenceStats().getCleanSheets();
        return firstPlayer.getDefenceStats().getCleanSheets() - secondPlayer.getDefenceStats().getCleanSheets();
    }

    // Tackles
    public int twoPlayerCompareByTackles(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Tackles: ", firstPlayer, secondPlayer, firstPlayer.getDefenceStats().getTackles(), secondPlayer.getDefenceStats().getTackles());
        if(isDescendingOrder(condition)) return secondPlayer.getDefenceStats().getTackles() - firstPlayer.getDefenceStats().getTackles();
        return firstPlayer.getDefenceStats().getTackles() - secondPlayer.getDefenceStats().getTackles();
    }

    // Interceptions
    public int twoPlayerCompareByInterceptions(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Interceptions: ", firstPlayer, secondPlayer, firstPlayer.getDefenceStats().getInterception(), secondPlayer.getDefenceStats().getInterception());
        if(isDescendingOrder(condition)) return secondPlayer.getDefenceStats().getInterception() - firstPlayer.getDefenceStats().getInterception();
        return firstPlayer.getDefenceStats().getInterception() - secondPlayer.getDefenceStats().getInterception();
    }

    // Dualwons
    public int twoPlayerCompareByDualwons(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("DualWons: ", firstPlayer, secondPlayer, firstPlayer.getDefenceStats().getDualsWon(), secondPlayer.getDefenceStats().getDualsWon());
        if(isDescendingOrder(condition)) return secondPlayer.getDefenceStats().getDualsWon() - firstPlayer.getDefenceStats().getDualsWon();
        return firstPlayer.getDefenceStats().getDualsWon() - secondPlayer.getDefenceStats().getDualsWon();
    }

    // Duallosts
    public int twoPlayerCompareByDuallosts(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("DualLosts: ", firstPlayer, secondPlayer, firstPlayer.getDefenceStats().getDualLost(), secondPlayer.getDefenceStats().getDualLost());
        if(isDescendingOrder(condition)) return secondPlayer.getDefenceStats().getDualLost() - firstPlayer.getDefenceStats().getDualLost();
        return firstPlayer.getDefenceStats().getDualLost() - secondPlayer.getDefenceStats().getDualLost();
    }

    // Clearance
    public int twoPlayerCompareByClearance(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Clearance: ", firstPlayer, secondPlayer, firstPlayer.getDefenceStats().getClearances(), secondPlayer.getDefenceStats().getClearances());
        if(isDescendingOrder(condition)) return secondPlayer.getDefenceStats().getClearances() - firstPlayer.getDefenceStats().getClearances();
        return firstPlayer.getDefenceStats().getClearances() - secondPlayer.getDefenceStats().getClearances();
    }

    // Name
    public int twoPlayerCompareByName(Player firstPlayer, Player secondPlayer, int condition) {
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getName().compareTo(firstPlayer.getPersonalDetails().getName());
        return firstPlayer.getPersonalDetails().getName().compareTo(secondPlayer.getPersonalDetails().getName());
    }

    // Team
    public int twoPlayerCompareByTeam(Player firstPlayer, Player secondPlayer, int condition) {
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getTeam().compareTo(firstPlayer.getPersonalDetails().getTeam());
        return firstPlayer.getPersonalDetails().getTeam().compareTo(secondPlayer.getPersonalDetails().getTeam());
    }

    // Position
    public int twoPlayerCompareByPosition(Player firstPlayer, Player secondPlayer, int condition) {
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getPosition().compareTo(firstPlayer.getPersonalDetails().getPosition());
        return firstPlayer.getPersonalDetails().getPosition().compareTo(secondPlayer.getPersonalDetails().getPosition());
    }

    // Nationality
    public int twoPlayerCompareByNationality(Player firstPlayer, Player secondPlayer, int condition) {
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getNationality().compareTo(firstPlayer.getPersonalDetails().getNationality());
        return firstPlayer.getPersonalDetails().getNationality().compareTo(secondPlayer.getPersonalDetails().getNationality());
    }

    // BackNumber
    public int twoPlayerCompareByBackNumber(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("BackNumber: ", firstPlayer, secondPlayer, firstPlayer.getPersonalDetails().getBackNumber(), secondPlayer.getPersonalDetails().getBackNumber());
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getBackNumber() - firstPlayer.getPersonalDetails().getBackNumber();
        return firstPlayer.getPersonalDetails().getBackNumber() - secondPlayer.getPersonalDetails().getBackNumber();
    }

    // Age
    public int twoPlayerCompareByBackAge(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Age: ", firstPlayer, secondPlayer, firstPlayer.getPersonalDetails().getAge(), secondPlayer.getPersonalDetails().getAge());
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getAge() - firstPlayer.getPersonalDetails().getAge();
        return firstPlayer.getPersonalDetails().getAge() - secondPlayer.getPersonalDetails().getAge();
    }

    // Height
    public int twoPlayerCompareByBackHeight(Player firstPlayer, Player secondPlayer, int condition) {
        logCompareMethods("Height: ", firstPlayer, secondPlayer, firstPlayer.getPersonalDetails().getHeight(), secondPlayer.getPersonalDetails().getHeight());
        if(isDescendingOrder(condition)) return secondPlayer.getPersonalDetails().getHeight() - firstPlayer.getPersonalDetails().getHeight();
        return firstPlayer.getPersonalDetails().getHeight() - secondPlayer.getPersonalDetails().getHeight();
    }

    // AP
    public int twoPlayerCompareByAttackPoint(Player firstPlayer, Player secondPlayer, int condition) {
        int firstPlayerAttackPoint = getPlayerAttackPoint(firstPlayer);
        int secondPlayerAttackPoint = getPlayerAttackPoint(secondPlayer);
        logCompareMethods("AP: ", firstPlayer, secondPlayer, firstPlayerAttackPoint,secondPlayerAttackPoint);
        if(isDescendingOrder(condition)) return secondPlayerAttackPoint - firstPlayerAttackPoint;
        return firstPlayerAttackPoint - secondPlayerAttackPoint;
    }

    // DP
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
