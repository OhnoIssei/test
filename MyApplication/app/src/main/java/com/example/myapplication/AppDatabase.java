package com.example.myapplication;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;

<<<<<<< HEAD
@Database(entities = {AccessTime.class,OpposingTeam.class},
        version = 7,
=======
@Database(entities = {AccessTime.class},
        version = 5,
>>>>>>> origin/main
        exportSchema = false
)

public abstract class AppDatabase extends RoomDatabase {
    //アクセスタイムDAOの呼び出し
    public abstract AccessTimeDao accessTimeDao();
<<<<<<< HEAD
    public abstract OpposingTeamDao opposingTeamDao();
=======
>>>>>>> origin/main
}
