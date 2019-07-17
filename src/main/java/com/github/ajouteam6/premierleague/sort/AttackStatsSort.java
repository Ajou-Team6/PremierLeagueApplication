package com.github.ajouteam6.premierleague.sort;


import com.github.ajouteam6.premierleague.domain.player.Player;

import java.util.Arrays;

//명수
public class AttackStatsSort {
    public void sortByPlayerScores(Player[] playerList){
        Arrays.sort(playerList,this::compareByGoals);
        for(Player players : playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getGoals());
        }
    }

    public void sortByPlayerAsssits(Player[] playerList){
        Arrays.sort(playerList,this::compareByAssists);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getAssists());
        }
    }

    public void sortByPlayerShots(Player[] playerList){
        Arrays.sort(playerList,this::compareByShots);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getShots());
        }
    }

    public void sortByPlayerShotsOnTarget(Player[] playerList){
        Arrays.sort(playerList,this::compareByShotsOnTarget);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getShotsOnTarget());
        }
    }

    public void sortByPlayerPasses(Player[] playerList){
        Arrays.sort(playerList, this::compareByPasses);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ ":" +
                    players.getAttackStats().getPasses());
        }
    }


    public int compareByGoals(Player p1, Player p2){
        return p2.getAttackStats().getGoals()-p1.getAttackStats().getGoals();
    }
    public int compareByAssists(Player p1, Player p2){
        return p2.getAttackStats().getAssists()-p1.getAttackStats().getAssists();
    }
    public int compareByShots(Player p1, Player p2){
        return p2.getAttackStats().getShots()-p1.getAttackStats().getShots();
    }
    public int compareByShotsOnTarget(Player p1, Player p2){
        return p2.getAttackStats().getShotsOnTarget()-p1.getAttackStats().getShotsOnTarget();
    }
    public int compareByPasses(Player p1, Player p2){
        return p2.getAttackStats().getPasses()-p1.getAttackStats().getPasses();
    }
}
