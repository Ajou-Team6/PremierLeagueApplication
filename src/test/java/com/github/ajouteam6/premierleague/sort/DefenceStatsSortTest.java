package com.github.ajouteam6.premierleague.sort;

import com.github.ajouteam6.premierleague.domain.AttackStats;
import com.github.ajouteam6.premierleague.domain.DefenceStats;
import com.github.ajouteam6.premierleague.domain.PersonalDetails;
import com.github.ajouteam6.premierleague.domain.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

//명수
public class DefenceStatsSortTest {
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
    //명수 - 클린시트 갯수 기준 정렬 테스트
    @Test
    public void 클린싯갯수순위가_내림차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerCleanSheets(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getCleanSheets()>=playerList[i+1].getDefenceStats().getCleanSheets());
        }
    }
    @Test
    public void 클린싯갯수순위가_오름차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerCleanSheets(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getCleanSheets()<=playerList[i+1].getDefenceStats().getCleanSheets());
        }
    }

    //명수 - 태클 갯수 기준 정렬 테스트
    @Test
    public void 태클갯수순위가_내림차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerTackles(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getTackles()>=playerList[i+1].getDefenceStats().getTackles());
        }
    }
    @Test
    public void 태클갯수순위가_오름차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerTackles(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getTackles()<=playerList[i+1].getDefenceStats().getTackles());
        }
    }

    //명수 - 인터셉트 갯수 기준 정렬 테스트
    @Test
    public void 인터셉트갯수순위가_내림차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerInterception(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getInterception()>=playerList[i+1].getDefenceStats().getInterception());
        }
    }
    @Test
    public void 인터셉트갯수순위가_오름차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerInterception(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getInterception()<=playerList[i+1].getDefenceStats().getInterception());
        }
    }

    //명수 - 경합승리횟수 기준 정렬 테스트
    @Test
    public void 경합승리횟수_순위가_내림차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerDualsWon(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getDualsWon()>=playerList[i+1].getDefenceStats().getDualsWon());
        }
    }
    @Test
    public void 경합승리횟수_순위가_오름차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerDualsWon(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getDualsWon()<=playerList[i+1].getDefenceStats().getDualsWon());
        }
    }

    //명수 - 경합패배횟수 기준 정렬 테스트
    @Test
    public void 경합패배횟수_순위가_내림차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerDualsLost(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getDualLost()>=playerList[i+1].getDefenceStats().getDualLost());
        }
    }
    @Test
    public void 경합패배횟수_순위가_오름차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerDualsLost(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getDualLost()<=playerList[i+1].getDefenceStats().getDualLost());
        }
    }

    //명수 - 걷어내기 횟수 기준 정렬 테스트
    @Test
    public void 걷어내기횟수_순위가_내림차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerClearance(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getClearances()>=playerList[i+1].getDefenceStats().getClearances());
        }
    }
    @Test
    public void 걷어내기횟수_순위가_오름차순이_아니면_에러() {
        DefenceStatsSort defenceStatsSort = new DefenceStatsSort();
        defenceStatsSort.sortByPlayerClearance(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getDefenceStats().getClearances()<=playerList[i+1].getDefenceStats().getClearances());
        }
    }


}
