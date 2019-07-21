package com.github.ajouteam6.premierleague.sort;


import com.github.ajouteam6.premierleague.domain.player.Player;

import java.util.Arrays;

//명수
public class PersonalDetailsSort {
    // 명수 - 이름 기준 정렬
    public void sortByPlayerName(Player[] playerList, int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByNameDescend);
        else Arrays.sort(playerList,this::compareByNameAscend);
        for(Player players : playerList){
            System.out.println(players.getPersonalDetails().getName());
        }
    }
    // 명수 - 선수 소속팀 기준 정렬
    public void sortByPlayerTeam(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByTeamDescend);
        else Arrays.sort(playerList,this::compareByTeamAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ " : " +
                    players.getPersonalDetails().getTeam());
        }
    }
    // 명수 - 선수 등번호 기준 정렬
    public void sortByPlayerBackNumber(Player[] playerList, int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByBackNumberDescend);
        else Arrays.sort(playerList,this::compareByBackNumberAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ " : " +
                    players.getPersonalDetails().getBackNumber());
        }
    }
    // 명수 - 선수 포지션 기준 정렬
    public void sortByPlayerPosition(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByPositionDescend);
        else Arrays.sort(playerList,this::compareByPositionAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ " : " +
                    players.getPersonalDetails().getPosition());
        }
    }
    // 명수 - 선수 나이 기준 정렬
    public void sortByPlayerAge(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByAgeDescend);
        else Arrays.sort(playerList,this::compareByAgeAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ " : " +
                    players.getPersonalDetails().getAge());
        }
    }

    // 명수 - 선수 키 기준 정렬
    public void sortByPlayerHeight(Player[] playerList,int sortSelect){
        if(sortSelect==0)  Arrays.sort(playerList,this::compareByHeightDescend);
        else Arrays.sort(playerList,this::compareByHeightAscend);
        for(Player players:playerList){
            System.out.println(players.getPersonalDetails().getName()+ " : " +
                    players.getPersonalDetails().getHeight()+"cm");
        }
    }



    public int compareByNameDescend(Player p1, Player p2){
        if(p2.getPersonalDetails().getName().compareTo(p1.getPersonalDetails().getName())<0){
            return -1;
        }
        return 1;
    }
    public int compareByNameAscend(Player p1, Player p2){
        if(p2.getPersonalDetails().getName().compareTo(p1.getPersonalDetails().getName())<0){
            return 1;
        }
        return -1;
    }
    public int compareByTeamAscend(Player p1, Player p2){
        if(p2.getPersonalDetails().getTeam().compareTo(p1.getPersonalDetails().getTeam())<0){
            return 1;
        }
        return -1;
    }
    public int compareByTeamDescend(Player p1, Player p2){
        if(p2.getPersonalDetails().getTeam().compareTo(p1.getPersonalDetails().getTeam())<0){
            return -1;
        }
        return 1;
    }
    public int compareByBackNumberAscend(Player p1, Player p2){
        return p1.getPersonalDetails().getBackNumber()-p2.getPersonalDetails().getBackNumber();
    }
    public int compareByBackNumberDescend(Player p1, Player p2){
        return p2.getPersonalDetails().getBackNumber()-p1.getPersonalDetails().getBackNumber();
    }
    public int compareByPositionDescend(Player p1, Player p2){
        if(p2.getPersonalDetails().getPosition().compareTo(p1.getPersonalDetails().getPosition())<=0){
            return -1;
        }
        return 1;
    }
    public int compareByPositionAscend(Player p1, Player p2){
        if(p2.getPersonalDetails().getPosition().compareTo(p1.getPersonalDetails().getPosition())<=0){
            return 1;
        }
        return -1;
    }

    public int compareByAgeAscend(Player p1, Player p2){
        return p1.getPersonalDetails().getAge()-p2.getPersonalDetails().getAge();
    }
    public int compareByAgeDescend(Player p1, Player p2){
        return p2.getPersonalDetails().getAge()-p1.getPersonalDetails().getAge();
    }
    public int compareByHeightAscend(Player p1, Player p2){
        return p1.getPersonalDetails().getHeight()-p2.getPersonalDetails().getHeight();
    }
    public int compareByHeightDescend(Player p1, Player p2){
        return p2.getPersonalDetails().getHeight()-p1.getPersonalDetails().getHeight();
    }
}
