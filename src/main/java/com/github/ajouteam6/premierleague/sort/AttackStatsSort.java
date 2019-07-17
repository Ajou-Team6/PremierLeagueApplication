package com.github.ajouteam6.premierleague.sort;


import com.github.ajouteam6.premierleague.domain.player.Player;

import java.util.Arrays;

//명수
public class AttackStatsSort {

    public void sortByPlayerScores(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByGoalsDescend);
        else Arrays.sort(playerList,this::compareByGoalsAscend);
        for(Player players : playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getGoals());
        }
    }
    public void sortByPlayerAsssits(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByAssistsDescend);
        else Arrays.sort(playerList,this::compareByAssistsAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getAssists());
        }
    }

    public void sortByPlayerShots(Player[] playerList, int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByShotsDescend);
        else Arrays.sort(playerList,this::compareByShotsAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getShots());
        }
    }

    public void sortByPlayerShotsOnTarget(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByShotsOnTargetDescend);
        else Arrays.sort(playerList,this::compareByShotsOnTargetAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getShotsOnTarget());
        }
    }

    public void sortByPlayerPasses(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByPassesDescend);
        else Arrays.sort(playerList,this::compareByPassesAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getPasses());
        }
    }



    public int compareByGoalsDescend(Player p1, Player p2){
        return p2.getAttackStats().getGoals()-p1.getAttackStats().getGoals();
    }
    public int compareByGoalsAscend(Player p1, Player p2){
        return p1.getAttackStats().getGoals()-p2.getAttackStats().getGoals();
    }
    public int compareByAssistsAscend(Player p1, Player p2){
        return p1.getAttackStats().getAssists()-p2.getAttackStats().getAssists();
    }
    public int compareByAssistsDescend(Player p1, Player p2){
        return p2.getAttackStats().getAssists()-p1.getAttackStats().getAssists();
    }
    public int compareByShotsAscend(Player p1, Player p2){
        return p1.getAttackStats().getShots()-p2.getAttackStats().getShots();
    }
    public int compareByShotsDescend(Player p1, Player p2){
        return p2.getAttackStats().getShots()-p1.getAttackStats().getShots();
    }
    public int compareByShotsOnTargetDescend(Player p1, Player p2){
        return p2.getAttackStats().getShotsOnTarget()-p1.getAttackStats().getShotsOnTarget();
    }
    public int compareByShotsOnTargetAscend(Player p1, Player p2){
        return p1.getAttackStats().getShotsOnTarget()-p2.getAttackStats().getShotsOnTarget();
    }
    public int compareByPassesDescend(Player p1, Player p2){
        return p2.getAttackStats().getPasses()-p1.getAttackStats().getPasses();
    }
    public int compareByPassesAscend(Player p1, Player p2){
        return p1.getAttackStats().getPasses()-p2.getAttackStats().getPasses();
    }
}
