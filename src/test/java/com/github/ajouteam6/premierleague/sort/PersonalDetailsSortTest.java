package com.github.ajouteam6.premierleague.sort;

import com.github.ajouteam6.premierleague.domain.AttackStats;
import com.github.ajouteam6.premierleague.domain.DefenceStats;
import com.github.ajouteam6.premierleague.domain.PersonalDetails;
import com.github.ajouteam6.premierleague.domain.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//명수
public class PersonalDetailsSortTest {
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
                .personalDetails(new PersonalDetails("Harry Kane","Tottenham Hotspurs",9,"Striker","England",25,185))
                .build();
        Eden_Hazard = Player.builder()
                .attackStats(new AttackStats(20,17,90,61,1501))
                .defenceStats(new DefenceStats(8,10,4,5,1,2))
                .personalDetails(new PersonalDetails("Eden Hazard","Chelsea FC",10,"Forward","Belguim",27,176))
                .build();
        Sadio_Mane = Player.builder()
                .attackStats(new AttackStats(22,4,94,58,1556))
                .defenceStats(new DefenceStats(15,12,5,10,5,7))
                .personalDetails(new PersonalDetails("Sadio Mane","Liverpool FC", 10, "Left Forward", "Senegal",26,177))
                .build();
        Alexander_Lacazette = Player.builder()
                .attackStats(new AttackStats(13,10,78,50,1120))
                .defenceStats(new DefenceStats(5,12,8,4,6,3))
                .personalDetails(new PersonalDetails("Alexander Lacazette","Arsenal FC",9,"Center Forward","France",25,181))
                .build();
        Alexis_Sanchez = Player.builder()
                .attackStats(new AttackStats(2,5,52,28,506))
                .defenceStats(new DefenceStats(2,5,3,1,8,0))
                .personalDetails(new PersonalDetails("Alexis Sanchez","Manchester United",7,"Left Winger","Chile",30,180))
                .build();
        playerList[0]=Harry_Kane;
        playerList[1]=Eden_Hazard;
        playerList[2]=Sadio_Mane;
        playerList[3]=Alexander_Lacazette;
        playerList[4]=Alexis_Sanchez;
    }
    //명수 - 이름 기준 정렬 테스트
    @Test
    public void 이름기준_정렬이_내림차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerName(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertEquals(-1, (personalDetailssort.compareByNameDescend(playerList[i], playerList[i + 1])));
        }
    }
    @Test
    public void 이름기준_정렬이_오름차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerName(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertEquals(-1, (personalDetailssort.compareByNameAscend(playerList[i], playerList[i + 1])));
        }
    }

    // 명수 - 선수 소속 팀 기준 정렬 테스트
    @Test
    public void 선수소속팀기준_정렬이_내림차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerTeam(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertEquals(-1, (personalDetailssort.compareByTeamDescend(playerList[i], playerList[i + 1])));
        }
    }
    @Test
    public void 선수소속팀기준_정렬이_오름차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerTeam(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertEquals(-1, (personalDetailssort.compareByTeamAscend(playerList[i], playerList[i + 1])));
        }
    }

    // 명수 - 선수 등 번호 기준 정렬 테스트
    @Test
    public void 선수등번호기준정렬이_내림차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerBackNumber(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getPersonalDetails().getBackNumber()>=playerList[i+1].getPersonalDetails().getBackNumber());
        }
    }
    @Test
    public void 선수등번호기준정렬이_오름차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerBackNumber(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getPersonalDetails().getBackNumber()<=playerList[i+1].getPersonalDetails().getBackNumber());
        }
    }

    // 명수 - 선수 포지션 기준 정렬 테스트
    @Test
    public void 선수포지션기준_정렬이_내림차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerPosition(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertEquals(-1, (personalDetailssort.compareByPositionDescend(playerList[i], playerList[i + 1])));
        }
    }
    @Test
    public void 선수포지션기준_정렬이_오름차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerPosition(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertEquals(-1, (personalDetailssort.compareByPositionAscend(playerList[i], playerList[i + 1])));
        }
    }

    // 명수 - 선수 나이 기준 정렬 테스트
    @Test
    public void 선수나이기준정렬이_내림차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerAge(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getPersonalDetails().getAge()>=playerList[i+1].getPersonalDetails().getAge());
        }
    }
    @Test
    public void 선수나이기준정렬이_오름차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerAge(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getPersonalDetails().getAge()<=playerList[i+1].getPersonalDetails().getAge());
        }
    }

    // 명수 - 선수 키 기준 정렬 테스트
    @Test
    public void 선수키기준정렬이_내림차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerHeight(playerList,0);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getPersonalDetails().getHeight()>=playerList[i+1].getPersonalDetails().getHeight());
        }
    }
    @Test
    public void 선수키기준정렬이_오름차순이_아니면_에러() {
        PersonalDetailsSort personalDetailssort = new PersonalDetailsSort();
        personalDetailssort.sortByPlayerHeight(playerList,1);
        for(int i=0;i<playerList.length-1;i++){
            assertTrue(playerList[i].getPersonalDetails().getHeight()<=playerList[i+1].getPersonalDetails().getHeight());
        }
    }





}
