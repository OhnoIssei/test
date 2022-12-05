package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface OpposingTeamDao {

    @Query("SELECT * FROM opposingteam")
    List<OpposingTeam> getAll();

    @Query("SELECT point2_in FROM opposingteam WHERE player_number = selection")
    int playerSelect();

    @Query("SELECT SUM(point) FROM opposingteam")
    int sumPoint();

    @Query("SELECT SUM(point2_in) FROM opposingteam")
    int sumPoint2_in();

    @Query("SELECT SUM(point2_out) FROM opposingteam")
    int sumPoint2_out();

    @Query("SELECT SUM(point3_in) FROM opposingteam")
    int sumPoint3_in();

    @Query("SELECT SUM(point3_out) FROM opposingteam")
    int sumPoint3_out();

    @Query("SELECT SUM(ft_in) FROM opposingteam")
    int sumFt_in();

    @Query("SELECT SUM(ft_out) FROM opposingteam")
    int sumFt_out();

    @Query("SELECT SUM(offense_Rebound) FROM opposingteam")
    int sumOffense_Rebound();

    @Query("SELECT SUM(defense_Rebound) FROM opposingteam")
    int sumDefense_Rebound();

    @Query("SELECT SUM(assist) FROM opposingteam")
    int sumAssist();

    @Query("SELECT SUM(steel) FROM opposingteam")
    int sumSteel();

    @Query("SELECT SUM(block) FROM opposingteam")
    int sumBlock();

    @Query("SELECT SUM(turnOver) FROM opposingteam")
    int sumTurnOver();

    @Query("DELETE FROM opposingteam")
    void  clear();

    @Query("UPDATE opposingteam SET point = 0, point2_in = 0, point2_out = 0,point3_in = 0, point3_out = 0,ft_in = 0, ft_out = 0")
    void scoreDelete();

    @Query("UPDATE opposingteam SET point = (point2_in * 2) + (point3_in * 3)")
    int updatePoint();

    @Query("UPDATE opposingteam SET point2_in = point2_in + 1, point2_out = point2_out + 1 WHERE player_number = (:number)")
    void update2PIN(int number);

    @Query("UPDATE opposingteam SET point2_out = point2_out + 1 WHERE player_number = (:number)")
    void update2POUT(int number);

    @Query("UPDATE opposingteam SET point3_in = point3_in + 1, point3_out = point3_out + 1 WHERE player_number = (:number)")
    void update3PIN(int number);

    @Query("UPDATE opposingteam SET point3_out = point3_out + 1 WHERE player_number = (:number)")
    void update3POUT(int number);

    @Query("UPDATE opposingteam SET ft_in = ft_in + 1 WHERE player_number = (:number)")
    void updateFTIN(int number);

    @Query("UPDATE opposingteam SET ft_out = ft_out + 1 WHERE player_number = (:number)")
    void updateFTOUT(int number);

    @Query("UPDATE opposingteam SET offense_Rebound = offense_Rebound + 1 WHERE player_number = (:number)")
    void updateORB(int number);

    @Query("UPDATE opposingteam SET defense_Rebound = defense_Rebound + 1 WHERE player_number = (:number)")
    void updateDRB(int number);

    @Query("UPDATE opposingteam SET assist = assist + 1 WHERE player_number = (:number)")
    void updateASSIST(int number);

    @Query("UPDATE opposingteam SET steel = steel + 1 WHERE player_number = (:number)")
    void updateSTEEL(int number);

    @Query("UPDATE opposingteam SET block = block + 1 WHERE player_number = (:number)")
    void updateBLOCK(int number);

    @Query("UPDATE opposingteam SET turnOver = turnOver + 1 WHERE player_number = (:number)")
    void updateTO(int number);

    @Query("UPDATE opposingteam SET selection = (:number)")
    void selectionNumber(int number);

    @Query("INSERT INTO opposingteam(player_Name,player_number)  VALUES (:name,:number)")
    void playerRegistration(String name,int number);

    @Insert
    void insertAll(OpposingTeam... opposingTeams);

    @Insert
    void insert(OpposingTeam opposingTeam);

    @Update
    void update(OpposingTeam opposingTeam);

    @Delete
    void delete(OpposingTeam opposingTeam);
}
