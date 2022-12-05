package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AccessTime {
    @PrimaryKey(autoGenerate = true)
    private int id;
    //名前
    @ColumnInfo(name = "access_time")
    private String accessTime;
    //番号
    @ColumnInfo(name = "player_number")
    private int playerNumber;
    //2PIN
    @ColumnInfo(name = "point2_in",defaultValue="0")
    private int point2in;
    //2POUT
    @ColumnInfo(name = "point2_out",defaultValue="0")
    private int point2out;
    //3PIN
    @ColumnInfo(name = "point3_in",defaultValue="0")
    private int point3in;
    //3POUT
    @ColumnInfo(name = "point3_out",defaultValue="0")
    private int point3out;
    //FTIN
    @ColumnInfo(name = "ft_in",defaultValue="0")
    private int ftin;
    //FTOUT
    @ColumnInfo(name = "ft_out",defaultValue="0")
    private int ftout;
    //OR
    @ColumnInfo(name = "offense_Rebound",defaultValue="0")
    private int offenseRebound;
    //DR
    @ColumnInfo(name = "defense_Rebound",defaultValue="0")
    private int defenseRebound;
    //AST
    @ColumnInfo(defaultValue="0")
    private int assist;
    //STL
    @ColumnInfo(defaultValue="0")
    private int steel;
    //BLK
    @ColumnInfo(defaultValue="0")
    private int block;
    //TO
    @ColumnInfo(defaultValue="0")
    private int turnOver;
    //選択選手No
    @ColumnInfo(defaultValue="0")
    private int selection;
    //PT
    @ColumnInfo(defaultValue="0")
    private int point;
<<<<<<< HEAD
    @ColumnInfo(defaultValue="0")
    private int selectionTeam;
=======
>>>>>>> origin/main


    public AccessTime(String accessTime) {this.accessTime = accessTime;}

    public String getAccessTime() {return accessTime;}
    public void setAccessTime(String accessTime) {this.accessTime = accessTime;}

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    public void setPlayerNumber(int playerNumber) {this.playerNumber = playerNumber;}
    public int getPlayerNumber() {return playerNumber;}

    public void setPoint2in(int point2in) {this.point2in = point2in;}
    public int getPoint2in() {return point2in;}

    public void setPoint2out(int point2out) {this.point2out = point2out;}
    public int getPoint2out() {return point2out;}

    public void setPoint3in(int point3in) {this.point3in = point3in;}
    public int getPoint3in() {return point3in;}

    public void setPoint3out(int point3out) {this.point3out = point3out;}
    public int getPoint3out() {return point3out;}

    public void setFtin(int ftin) {this.ftin = ftin;}
    public int getFtin() {return ftin;}

    public void setFtout(int ftout) {this.ftout = ftout;}
    public int getFtout() {return ftout;}

    public void setOffenseRebound(int offenseRebound) {this.offenseRebound = offenseRebound;}
    public int getOffenseRebound() {return offenseRebound;}

    public void setDefenseRebound(int defenseRebound) {this.defenseRebound = defenseRebound;}
    public int getDefenseRebound() {return defenseRebound;}

    public void setAssist(int assist) {this.assist = assist;}
    public int getAssist() {return assist;}

    public void setSteel(int steel) {this.steel = steel;}
    public int getSteel() {return steel;}

    public void setBlock(int block) {this.block = block;}
    public int getBlock() {return block;}

    public void setTurnOver(int turnOver) {this.turnOver = turnOver;}
    public int getTurnOver() {return turnOver;}

    public void setSelection(int selection) {this.selection = selection;}
    public int getSelection() {return selection;}

    public void setPoint(int point) {this.point = point;}
    public int getPoint() {return point;}
<<<<<<< HEAD

    public void setSelectionTeam(int selectionTeam) {this.selectionTeam = selectionTeam;}
    public int getSelectionTeam() {return selectionTeam;}
=======
>>>>>>> origin/main
}
