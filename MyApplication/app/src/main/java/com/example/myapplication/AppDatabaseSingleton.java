package com.example.myapplication;

import android.content.Context;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class AppDatabaseSingleton {
    private static AppDatabase instance = null;

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE  AccessTime ADD COLUMN selection INTEGER NOT NULL DEFAULT 0");
        }
    };
    static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE  AccessTime ADD COLUMN point INTEGER NOT NULL DEFAULT 0");
        }
    };

    static final Migration MIGRATION_3_4 = new Migration(3, 4) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE `OpposingTeam` (`id` INTEGER NOT NULL, "
                    + "`player_number` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    };

    static final Migration MIGRATION_4_5 = new Migration(4, 5) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN point2_in INTEGER NOT NULL DEFAULT 0");
        }
    };

<<<<<<< HEAD
    static final Migration MIGRATION_5_6 = new Migration(5, 6) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN player_Name TEXT");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN point2_out INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN point3_in INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN point3_out INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN ft_in INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN ft_out INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN offense_Rebound INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN defense_Rebound INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN assist INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN steel INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN block INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN turnOver INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN selection INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN point INTEGER NOT NULL DEFAULT 0");
        }
    };
    static final Migration MIGRATION_6_7 = new Migration(6, 7) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE  AccessTime ADD COLUMN selectionTeam INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE  OpposingTeam ADD COLUMN selectionTeam INTEGER NOT NULL DEFAULT 0");
        }
    };

=======
>>>>>>> origin/main


    public static AppDatabase getInstance(Context context) {
        if (instance != null) {
            return instance;

        }
        instance = Room.databaseBuilder(context,
                        AppDatabase.class, "database-name").
                allowMainThreadQueries()
                .addMigrations(MIGRATION_1_2)
                .addMigrations(MIGRATION_2_3)
                .addMigrations(MIGRATION_3_4)
                .addMigrations(MIGRATION_4_5)
<<<<<<< HEAD
                .addMigrations(MIGRATION_5_6)
                .addMigrations(MIGRATION_6_7)
=======
>>>>>>> origin/main
                .build();
        return instance;
    }
}
