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
                .build();
        return instance;
    }
}
