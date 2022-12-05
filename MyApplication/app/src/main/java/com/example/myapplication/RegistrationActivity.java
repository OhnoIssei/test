package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
//選手登録画面
public class RegistrationActivity extends AppCompatActivity {

    int team;
    int Number;
=======

public class RegistrationActivity extends AppCompatActivity {
>>>>>>> origin/main

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //スーパークラスのonCreateの呼び出し（中身はわからないがonCreateを利用する際のお決まりのような物？）
        super.onCreate(savedInstanceState);
        //どのレイアウトファイルを画面に表示するか決めている
        setContentView(R.layout.registration);

<<<<<<< HEAD
        //ラジオボタン
        //押されているボタンによってテーブルを変える
        //自チーム
        Button radio_myteam = findViewById(R.id.radio_myteam);
        radio_myteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team = 0;
            }
        });
        //相手チーム
        Button radio_opposingteam = findViewById(R.id.radio_opposingteam);
        radio_opposingteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team = 1;
            }
        });


=======
>>>>>>> origin/main
        //登録ボタン
        Button bt_registration = findViewById(R.id.btn_No1);
        bt_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditTextの値を取得
                EditText editNo;
                EditText editName;
                String getName;
                String getNumber;

                editNo = (EditText)findViewById(R.id.et_No1);
                getNumber = editNo.getText().toString();

                editName = (EditText)findViewById(R.id.et_No2);
                getName = editName.getText().toString();

                //Noと名前が両方入力されている場合のみデータベースに登録
<<<<<<< HEAD
                if(!(getNumber.equals(  "")) && !(getName.equals(""))){

                    AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());

                    switch (team) {
                        case 0:
                            Number = Integer.parseInt(getNumber.toString());

                            AccessTimeDao accessTimeDao = db.accessTimeDao();
                            accessTimeDao.playerRegistration(getName.toString(), Number);
                        case 1:
                            Number = Integer.parseInt(getNumber.toString());
                            OpposingTeamDao opposingTeamDao = db.opposingTeamDao();
                            opposingTeamDao.playerRegistration(getName.toString(), Number);
                    }
                    editNo.getEditableText().clear();
                    editName.getEditableText().clear();
=======
                if(!(getNumber.equals("")) && !(getName.equals(""))){

                    int Number = Integer.parseInt(getNumber.toString());
                    AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                    AccessTimeDao accessTimeDao = db.accessTimeDao();
                    accessTimeDao.playerRegistration(getName.toString(),Number);

                    editNo.getEditableText().clear();
                    editName.getEditableText().clear();

>>>>>>> origin/main
                }

            }
        });

        //完了ボタン
        //メイン画面に遷移
        Button bt_update = findViewById(R.id.btn_No2);
        bt_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
