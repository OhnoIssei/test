package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.Locale;

//一覧画面
public class ThirdActivity extends AppCompatActivity {
    int i = 0;
    int length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //スーパークラスのonCreateの呼び出し（中身はわからないがonCreateを利用する際のお決まりのような物？）
        super.onCreate(savedInstanceState);

        //どのレイアウトファイルを画面に表示するか決めている
        setContentView(R.layout.fragment_first);

        //オブジェクトを取得（オブジェクトの動作を決める時に必要）
        TextView tv = findViewById(R.id.index);
        TextView tv2 = findViewById(R.id.index2);
        TextView tv3 = findViewById(R.id.index3);

        //データベースの値を全て取得
        StringBuilder sb = new StringBuilder();
        AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
        AccessTimeDao accessTimeDao = db.accessTimeDao();
        accessTimeDao.updatePoint();
        List<AccessTime> atList = accessTimeDao.getAll();

        // データベースの行の数だけ表示
        ViewGroup vg = (ViewGroup)findViewById(R.id.TableLayout1);
        getLayoutInflater().inflate(R.layout.table_row, vg);
        //リスト列名
        TableRow tr = (TableRow)vg.getChildAt(i);
        ((TextView)(tr.getChildAt(0))).setText("No ");
        ((TextView)(tr.getChildAt(1))).setHint("Name ");
        ((TextView)(tr.getChildAt(2))).setText("PT ");
        ((TextView)(tr.getChildAt(3))).setText("2P ");
        ((TextView)(tr.getChildAt(4))).setHint("3P ");
        ((TextView)(tr.getChildAt(5))).setText("FT ");
        ((TextView)(tr.getChildAt(6))).setText("ORB ");
        ((TextView)(tr.getChildAt(7))).setText("DRB ");
        ((TextView)(tr.getChildAt(8))).setHint("AS ");
        ((TextView)(tr.getChildAt(9))).setText("ST ");
        ((TextView)(tr.getChildAt(10))).setText("BL ");
        ((TextView)(tr.getChildAt(11))).setHint("TO ");

        //データベースに登録されているスコアを表示
            for (AccessTime at: atList) {
                //行を追加
                getLayoutInflater().inflate(R.layout.table_row, vg);
                //文字設定
                i++;

                //No
                tr = (TableRow)vg.getChildAt(i);
                sb.append(at.getPlayerNumber()).append("\n");
                ((TextView)(tr.getChildAt(0))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //名前
                sb.append(at.getAccessTime()).append("\n");
                ((TextView)(tr.getChildAt(1))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //PT

                sb.append(at.getPoint());
                ((TextView)(tr.getChildAt(2))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //2P
                sb.append(at.getPoint2in()).append("/").append(at.getPoint2out());
                ((TextView)(tr.getChildAt(3))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //3P
                sb.append(at.getPoint3in()).append("/").append(at.getPoint3out());
                ((TextView)(tr.getChildAt(4))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //FT
                sb.append(at.getFtin()).append("/").append(at.getFtout());
                ((TextView)(tr.getChildAt(5))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //OFRB
                sb.append(at.getOffenseRebound()).append("\n");
                ((TextView)(tr.getChildAt(6))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //DFRB
                sb.append(at.getDefenseRebound()).append("\n");
                ((TextView)(tr.getChildAt(7))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //Assist
                sb.append(at.getAssist()).append("\n");
                ((TextView)(tr.getChildAt(8))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //Steel
                sb.append(at.getSteel()).append("\n");
                ((TextView)(tr.getChildAt(9))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //Block
                sb.append(at.getBlock()).append("\n");
                ((TextView)(tr.getChildAt(10))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
                //TurnOver
                sb.append(at.getTurnOver()).append("\n");
                ((TextView)(tr.getChildAt(11))).setText(sb);
                length = sb.length();
                sb.delete(0,length);
            }
        //リストの一番下に合計表示
        getLayoutInflater().inflate(R.layout.table_row, vg);
        i++;
        //合計
        tr = (TableRow) vg.getChildAt(i);
        sb.append("合計");
        ((TextView) (tr.getChildAt(1))).setText(sb);
        length = sb.length();
        sb.delete(0, length);
        //point
        sb.append(accessTimeDao.sumPoint());
        ((TextView) (tr.getChildAt(2))).setText(sb);
        length = sb.length();
        sb.delete(0, length);
        //2P
        sb.append(accessTimeDao.sumPoint2_in()).append("/").append(accessTimeDao.sumPoint2_out());
        ((TextView)(tr.getChildAt(3))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //3P
        sb.append(accessTimeDao.sumPoint3_in()).append("/").append(accessTimeDao.sumPoint3_out());
        ((TextView)(tr.getChildAt(4))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //FT
        sb.append(accessTimeDao.sumFt_in()).append("/").append(accessTimeDao.sumFt_out());
        ((TextView)(tr.getChildAt(5))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //OFRB
        sb.append(accessTimeDao.sumOffense_Rebound()).append("\n");
        ((TextView)(tr.getChildAt(6))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //DFRB
        sb.append(accessTimeDao.sumDefense_Rebound()).append("\n");
        ((TextView)(tr.getChildAt(7))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //Assist
        sb.append(accessTimeDao.sumAssist()).append("\n");
        ((TextView)(tr.getChildAt(8))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //Steel
        sb.append(accessTimeDao.sumSteel()).append("\n");
        ((TextView)(tr.getChildAt(9))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //Block
        sb.append(accessTimeDao.sumBlock()).append("\n");
        ((TextView)(tr.getChildAt(10))).setText(sb);
        length = sb.length();
        sb.delete(0,length);
        //TurnOver
        sb.append(accessTimeDao.sumTurnOver()).append("\n");
        ((TextView)(tr.getChildAt(11))).setText(sb);
        length = sb.length();
        sb.delete(0,length);

        //戻るボタン押下時処理
        Button bt_list = findViewById(R.id.button1);
        bt_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SubActivityに画面遷移
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });

        //全消去ボタン押下時処理
        Button bt_delete = findViewById(R.id.button2);
        bt_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.clear();
                List<AccessTime> atList = accessTimeDao.getAll();
                for (AccessTime at: atList) {
                    sb.append(at.getId()).append("\n");
                }
                tv.setText(sb.toString());

                for (AccessTime at: atList) {
                    sb2.append(at.getAccessTime()).append("\n");
                }
                tv2.setText(sb2.toString());

                for (AccessTime at: atList) {
                    sb3.append(at.getPlayerNumber()).append("\n");
                }
                tv3.setText(sb3.toString());
            }
        });

        //スコアのみ削除
        Button bt_deleteLine = findViewById(R.id.button3);
        bt_deleteLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                AppDatabase db = AppDatabaseSingleton.getInstance(getApplicationContext());
                AccessTimeDao accessTimeDao = db.accessTimeDao();
                accessTimeDao.scoreDelete();
                List<AccessTime> atList = accessTimeDao.getAll();
                for (AccessTime at: atList) {

                }
            }
        });


    }

}
