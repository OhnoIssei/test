package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //スーパークラスのonCreateの呼び出し（中身はわからないがonCreateを利用する際のお決まりのような物？）
        super.onCreate(savedInstanceState);
        //どのレイアウトファイルを画面に表示するか決めている
        setContentView(R.layout.registration);

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
                if(!(getNumber.equals("")) && !(getName.equals(""))){

                    int Number = Integer.parseInt(getNumber.toString());
                    AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                    AccessTimeDao accessTimeDao = db.accessTimeDao();
                    accessTimeDao.playerRegistration(getName.toString(),Number);

                    editNo.getEditableText().clear();
                    editName.getEditableText().clear();

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
