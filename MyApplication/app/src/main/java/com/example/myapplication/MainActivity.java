package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.net.IDN;
import java.util.List;
<<<<<<< HEAD
//選手選択画面
=======

>>>>>>> origin/main
public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private TableLayout rootView;
    private TableLayout rootView2;
    private LayoutInflater inflater;
    private int[] editTextIds;

<<<<<<< HEAD
=======


>>>>>>> origin/main
    //アプリが起動した時に実行するメソッド
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //スーパークラスのonCreateの呼び出し（中身はわからないがonCreateを利用する際のお決まりのような物？）
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_list).setOnClickListener(this);
        findViewById(R.id.btn_registration).setOnClickListener(this);


        //サブビューを追加
        rootView = findViewById(R.id.TableLayout1);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View subView = inflater.inflate(R.layout.table_row2, null);
        rootView.addView(subView, rootView.getChildCount() - 1);

<<<<<<< HEAD
        rootView2 = findViewById(R.id.TableLayout2);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View subView2 = inflater.inflate(R.layout.table_row3, null);
        rootView2.addView(subView2, rootView2.getChildCount() - 1);

=======
>>>>>>> origin/main
        AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
        AccessTimeDao accessTimeDao = db.accessTimeDao();
        List<AccessTime> atList = accessTimeDao.getAll();

        int i = 0;
<<<<<<< HEAD
        editTextIds = new int[42];//ID
=======
        editTextIds = new int[20];//ID
>>>>>>> origin/main
        //データベースに登録されている選手の数だけボタンを表示
        for (AccessTime at : atList) {
            // データベースに登録されている選手の数だけボタンを表示
            Button button = new Button(this);
            editTextIds[i] = ViewCompat.generateViewId();
            button.setId(editTextIds[i]);
            button.setText(Integer.toString(at.getPlayerNumber()));
            rootView.addView(button);
            findViewById(editTextIds[i]).setOnClickListener(this);
        }
<<<<<<< HEAD

        OpposingTeamDao opposingTeamDao = db.opposingTeamDao();
        List<OpposingTeam> otList = opposingTeamDao.getAll();

        for (OpposingTeam ot : otList) {
            // データベースに登録されている選手の数だけボタンを表示
            Button button = new Button(this);
            editTextIds[i] = ViewCompat.generateViewId();
            button.setId(editTextIds[i]);
            button.setText(Integer.toString(ot.getPlayerNumber()));
            rootView2.addView(button);
            findViewById(editTextIds[i]).setOnClickListener(this);
        }

=======
>>>>>>> origin/main
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_list) {//一覧画面に遷移
            //ThirdActivityに画面遷移
            Intent intent = new Intent(getApplication(), ThirdActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_registration) {//選手登録画面に遷移
            //RegistrationActivityに画面遷
            Intent intent = new Intent(getApplication(), RegistrationActivity.class);
            startActivity(intent);
        } else {//スコア画面に遷移
            Button b = (Button)v;//押されたボタンのテキスト取得
<<<<<<< HEAD
            Intent intent = new Intent(getApplication(), SecondActivity.class);
            int buttonID =b.getId();
            if(buttonID >= 3){

                intent.putExtra("selection_team",1);
            }
            String text = b.getText().toString();
            //AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
            //AccessTimeDao accessTimeDao = db.accessTimeDao();
            //accessTimeDao.selectionNumber(Integer.parseInt(text));
=======
            String text = b.getText().toString();
            AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
            AccessTimeDao accessTimeDao = db.accessTimeDao();
            accessTimeDao.selectionNumber(Integer.parseInt(text));
            Intent intent = new Intent(getApplication(), SecondActivity.class);
>>>>>>> origin/main
            intent.putExtra("SEND_DATA",Integer.parseInt(text));//画面遷移時に押されたボタンのNoを渡す
            startActivity(intent);
        }
    }
}





