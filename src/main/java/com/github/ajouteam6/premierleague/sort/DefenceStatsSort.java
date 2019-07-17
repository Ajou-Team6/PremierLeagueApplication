package com.github.ajouteam6.premierleague.sort;

import com.github.ajouteam6.premierleague.domain.player.Player;

import java.util.Arrays;

//명수
public class DefenceStatsSort {
    //명수 - 클린시트 개수 기준 정렬
    public void sortByPlayerCleanSheets(Player[] playerList, int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::comparebyCleanSheetsDescend);
        else Arrays.sort(playerList,this::comparebyCleanSheetsAscend);
        for(Player players : playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getDefenceStats().getCleanSheets());
        }
    }
    //명수 - 태클 개수 기준 정렬
    public void sortByPlayerTackles(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByTacklesDescend);
        else Arrays.sort(playerList,this::compareByTacklesAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getDefenceStats().getTackles());
        }
    }
    //명수 - 인터셉트 개수 기준 정렬
    public void sortByPlayerInterception(Player[] playerList, int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByInterceptionDescend);
        else Arrays.sort(playerList,this::compareByInterceptionAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getDefenceStats().getInterception());
        }
    }
    //명수 - 경합승리 횟수 기준 정렬
    public void sortByPlayerDualsWon(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByDualsWonDescend);
        else Arrays.sort(playerList,this::compareByDualsWonAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getDefenceStats().getDualsWon());
        }
    }
    //명수 - 경합패배 횟수 기준 정렬
    public void sortByPlayerDualsLost(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByDualsLostDescend);
        else Arrays.sort(playerList,this::compareByDualsLostAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getDefenceStats().getDualLost());
        }
    }
    //명수 - 걷어내기 횟수 기준 정렬
    public void sortByPlayerClearance(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByClearanceDescend);
        else Arrays.sort(playerList,this::compareByClearanceAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getDefenceStats().getClearances());
        }
    }



    public int comparebyCleanSheetsDescend(Player p1, Player p2){
        return p2.getDefenceStats().getCleanSheets()-p1.getDefenceStats().getCleanSheets();
    }
    public int comparebyCleanSheetsAscend(Player p1, Player p2){
        return p1.getDefenceStats().getCleanSheets()-p2.getDefenceStats().getCleanSheets();
    }
    public int compareByTacklesAscend(Player p1, Player p2){
        return p1.getDefenceStats().getTackles()-p2.getDefenceStats().getTackles();
    }
    public int compareByTacklesDescend(Player p1, Player p2){
        return p2.getDefenceStats().getTackles()-p1.getDefenceStats().getTackles();
    }
    public int compareByInterceptionAscend(Player p1, Player p2){
        return p1.getDefenceStats().getInterception()-p2.getDefenceStats().getInterception();
    }
    public int compareByInterceptionDescend(Player p1, Player p2){
        return p2.getDefenceStats().getInterception()-p1.getDefenceStats().getInterception();
    }
    public int compareByDualsWonDescend(Player p1, Player p2){
        return p2.getDefenceStats().getDualsWon()-p1.getDefenceStats().getDualsWon();
    }
    public int compareByDualsWonAscend(Player p1, Player p2){
        return p1.getDefenceStats().getDualsWon()-p2.getDefenceStats().getDualsWon();
    }
    public int compareByDualsLostDescend(Player p1, Player p2){
        return p2.getDefenceStats().getDualLost()-p1.getDefenceStats().getDualLost();
    }
    public int compareByDualsLostAscend(Player p1, Player p2){
        return p1.getDefenceStats().getDualLost()-p2.getDefenceStats().getDualLost();
    }
    public int compareByClearanceDescend(Player p1, Player p2){
        return p2.getDefenceStats().getClearances()-p1.getDefenceStats().getClearances();
    }
    public int compareByClearanceAscend(Player p1, Player p2){
        return p1.getDefenceStats().getClearances()-p2.getDefenceStats().getClearances();
    }
}
