package com.example.myapplication;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AccessTime.class,OpposingTeam.class},
        version = 7,
        exportSchema = false
)

public abstract class AppDatabase extends RoomDatabase {
    //アクセスタイムDAOの呼び出し
    public abstract AccessTimeDao accessTimeDao();
    public abstract OpposingTeamDao opposingTeamDao();
}
