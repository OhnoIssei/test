package com.example.myapplication;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface AccessTimeDao {

    //List<エンティティ名>を指定する。
    @Query("SELECT * FROM accesstime")
    List<AccessTime> getAll();

    @Query("SELECT * FROM accesstime WHERE id IN (:ids)")
    List<AccessTime> loadAllByIds(int[] ids);

    @Query("SELECT point2_in FROM accesstime WHERE player_number = selection")
    int playerSelect();

    @Query("SELECT SUM(point) FROM accesstime")
    int sumPoint();

    @Query("SELECT SUM(point2_in) FROM accesstime")
    int sumPoint2_in();

    @Query("SELECT SUM(point2_out) FROM accesstime")
    int sumPoint2_out();

    @Query("SELECT SUM(point3_in) FROM accesstime")
    int sumPoint3_in();

    @Query("SELECT SUM(point3_out) FROM accesstime")
    int sumPoint3_out();

    @Query("SELECT SUM(ft_in) FROM accesstime")
    int sumFt_in();

    @Query("SELECT SUM(ft_out) FROM accesstime")
    int sumFt_out();

    @Query("SELECT SUM(offense_Rebound) FROM accesstime")
    int sumOffense_Rebound();

    @Query("SELECT SUM(defense_Rebound) FROM accesstime")
    int sumDefense_Rebound();

    @Query("SELECT SUM(assist) FROM accesstime")
    int sumAssist();

    @Query("SELECT SUM(steel) FROM accesstime")
    int sumSteel();

    @Query("SELECT SUM(block) FROM accesstime")
    int sumBlock();

    @Query("SELECT SUM(turnOver) FROM accesstime")
    int sumTurnOver();

    @Query("DELETE FROM accesstime")
    void  clear();

    @Query("UPDATE accesstime SET point = 0, point2_in = 0, point2_out = 0,point3_in = 0, point3_out = 0,ft_in = 0, ft_out = 0")
    void scoreDelete();

    @Query("UPDATE accesstime SET point = (point2_in * 2) + (point3_in * 3)")
    int updatePoint();

    @Query("UPDATE accesstime SET point2_in = point2_in + 1, point2_out = point2_out + 1 WHERE player_number = (:number)")
    void update2PIN(int number);

    @Query("UPDATE accesstime SET point2_out = point2_out + 1 WHERE player_number = (:number)")
    void update2POUT(int number);

    @Query("UPDATE accesstime SET point3_in = point3_in + 1, point3_out = point3_out + 1 WHERE player_number = (:number)")
    void update3PIN(int number);

    @Query("UPDATE accesstime SET point3_out = point3_out + 1 WHERE player_number = (:number)")
    void update3POUT(int number);

    @Query("UPDATE accesstime SET ft_in = ft_in + 1 WHERE player_number = (:number)")
    void updateFTIN(int number);

    @Query("UPDATE accesstime SET ft_out = ft_out + 1 WHERE player_number = (:number)")
    void updateFTOUT(int number);

    @Query("UPDATE accesstime SET offense_Rebound = offense_Rebound + 1 WHERE player_number = (:number)")
    void updateORB(int number);

    @Query("UPDATE accesstime SET defense_Rebound = defense_Rebound + 1 WHERE player_number = (:number)")
    void updateDRB(int number);

    @Query("UPDATE accesstime SET assist = assist + 1 WHERE player_number = (:number)")
    void updateASSIST(int number);

    @Query("UPDATE accesstime SET steel = steel + 1 WHERE player_number = (:number)")
    void updateSTEEL(int number);

    @Query("UPDATE accesstime SET block = block + 1 WHERE player_number = (:number)")
    void updateBLOCK(int number);

    @Query("UPDATE accesstime SET turnOver = turnOver + 1 WHERE player_number = (:number)")
    void updateTO(int number);

    @Query("UPDATE accesstime SET selection = (:number)")
    void selectionNumber(int number);

    @Query("INSERT INTO accesstime(access_time,player_number)  VALUES (:name,:number)")
    void playerRegistration(String name,int number);

    @Insert
    void insertAll(AccessTime... accessTimes);

    @Insert
    void insert(AccessTime accessTime);

    @Update
    void update(AccessTime accessTime);

    @Delete
    void delete(AccessTime accessTime);
}
