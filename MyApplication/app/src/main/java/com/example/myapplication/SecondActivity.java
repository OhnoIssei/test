package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;
import java.util.List;

//スコア画面
public class SecondActivity extends AppCompatActivity{
    //アプリが起動した時に実行するメソッxド
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //スーパークラスのonCreateの呼び出し（中身はわからないがonCreateを利用する際のお決まりのような物？）
        super.onCreate(savedInstanceState);
        //どのレイアウトファイルを画面に表示するか決めている
        setContentView(R.layout.content_main);

        //メイン画面で押されたボタンのNo取得
        Intent intent = getIntent();
        int getdata = intent.getIntExtra("SEND_DATA",0);
        int selectionTeam = intent.getIntExtra("selection_team",0);

        //2PINボタン
        Button bt_update = findViewById(R.id.btn_2PIN);
        bt_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.update2PIN(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //2POUTボタン
        Button btn_2POUT = findViewById(R.id.btn_2POUT);
        btn_2POUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.update2POUT(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //3PINボタン
        Button btn_3PIN = findViewById(R.id.btn_3PIN);
        btn_3PIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.update3PIN(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //3POUTボタン
        Button btn_3POUT = findViewById(R.id.btn_3POUT);
        btn_3POUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.update3POUT(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //FTINボタン
        Button btn_FTIN = findViewById(R.id.btn_FTIN);
        btn_FTIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateFTIN(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //FTOUTボタン
        Button btn_FTOUT = findViewById(R.id.btn_FTOUT);
        btn_FTOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateFTOUT(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //ORボタン
        Button btn_OR = findViewById(R.id.btn_OR);
        btn_OR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateORB(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //DRボタン
        Button btn_DR = findViewById(R.id.btn_DR);
        btn_DR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateDRB(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //ASSISTボタン
        Button btn_ASISST = findViewById(R.id.btn_ASISST);
        btn_ASISST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateASSIST(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //STEELボタン
        Button btn_STEEL = findViewById(R.id.btn_STEEL);
        btn_STEEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateSTEEL(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //BLOCKボタン
        Button btn_BLOCK = findViewById(R.id.btn_BLOCK);
        btn_BLOCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateBLOCK(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });

        //turnOverボタン
        Button btn_turnOver = findViewById(R.id.btn_turnOver);
        btn_turnOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //押された番号の選手のスコアを更新
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.updateTO(getdata);

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
