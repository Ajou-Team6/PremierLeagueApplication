package com.github.ajouteam6.premierleague.sort;

import com.github.ajouteam6.premierleague.domain.player.AttackStats;
import com.github.ajouteam6.premierleague.domain.player.DefenceStats;
import com.github.ajouteam6.premierleague.domain.player.PersonalDetails;
import com.github.ajouteam6.premierleague.domain.player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


//명수
public class AttackStatsSortTest {
    Player Harry_Kane;
    Player Eden_Hazard;
    Player Sadio_Mane;
    Player Alexis_Sanchez;
    Player Alexander_Lacazette;
    Player[] playerList = new Player[5];
    @Before
    public void 선수_정보_설정(){
        Harry_Kane = Player.builder()
                .attackStats(new AttackStats(22,10,100,68,1203))
                .defenceStats(new DefenceStats(11,18,7,6,10,2))
                .personalDetails(new PersonalDetails("Harry Kane","Tottenham Hotspurs",9,"Forward","England",25,185))
                .build();
        Eden_Hazard = Player.builder()
                .attackStats(new AttackStats(20,17,90,61,1501))
                .defenceStats(new DefenceStats(8,10,4,5,1,2))
                .personalDetails(new PersonalDetails("Eden Hazard","Chelsea FC",10,"Forward","Belguim",27,176))
                .build();
        Sadio_Mane = Player.builder()
                .attackStats(new AttackStats(22,4,94,58,1556))
                .defenceStats(new DefenceStats(15,12,5,10,5,7))
                .personalDetails(new PersonalDetails("Sadio Mane","Liverpool FC", 10, "Forward", "Senegal",26,177))
                .build();
        Alexander_Lacazette = Player.builder()
                .attackStats(new AttackStats(13,10,78,50,1120))
                .defenceStats(new DefenceStats(5,12,8,4,6,3))
                .personalDetails(new PersonalDetails("Alexander Lacazette","Arsenal FC",9,"Forward","France",25,181))
                .build();
        Alexis_Sanchez = Player.builder()
                .attackStats(new AttackStats(2,5,52,28,506))
                .defenceStats(new DefenceStats(2,5,3,1,8,0))
                .personalDetails(new PersonalDetails("Alexis Sanchez","Manchester United",7,"Forward","Chile",30,180))
                .build();
        playerList[0]=Harry_Kane;
        playerList[1]=Eden_Hazard;
        playerList[2]=Sadio_Mane;
        playerList[3]=Alexander_Lacazette;
        playerList[4]=Alexis_Sanchez;
    }
    @Test
    public void 득점순위가_내림차순이_아니면_에러() {
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerScores(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getGoals()>=playerList[i+1].getAttackStats().getGoals());
        }
    }
    @Test
    public void 득점순위가_오름차순이_아니면_에러() {
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerScores(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getGoals()<=playerList[i+1].getAttackStats().getGoals());
        }
    }

    @Test
    public void 어시스트_순위가_내림차순이_아니면_에러() {
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerAsssits(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getAssists()>=playerList[i+1].getAttackStats().getAssists());
        }
    }
    @Test
    public void 어시스트_순위가_오름차순이_아니면_에러() {
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerAsssits(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getAssists()<=playerList[i+1].getAttackStats().getAssists());
        }
    }


    @Test
    public void 슈팅개수_순위가_내림차순이_아니면_에러(){
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerShots(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getShots()>=playerList[i+1].getAttackStats().getShots());
        }
    }
    @Test
    public void 슈팅개수_순위가_오름차순이_아니면_에러(){
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerShots(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getShots()<=playerList[i+1].getAttackStats().getShots());
        }
    }

    @Test
    public void 유효슈팅개수_순위가_내림차순이_아니면_에러(){
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerShotsOnTarget(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getShotsOnTarget()>=playerList[i+1].getAttackStats().getShotsOnTarget());
        }
    }
    @Test
    public void 유효슈팅개수_순위가_오름차순이_아니면_에러(){
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerShotsOnTarget(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getShotsOnTarget()<=playerList[i+1].getAttackStats().getShotsOnTarget());
        }
    }

    @Test
    public void 패스개수_순위가_내림차순이_아니면_에러(){
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerPasses(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getPasses()>=playerList[i+1].getAttackStats().getPasses());
        }
    }
    @Test
    public void 패스개수_순위가_오름차순이_아니면_에러(){
        AttackStatsSort attackStatsSort = new AttackStatsSort();
        attackStatsSort.sortByPlayerPasses(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getAttackStats().getPasses()<=playerList[i+1].getAttackStats().getPasses());
        }
    }
}