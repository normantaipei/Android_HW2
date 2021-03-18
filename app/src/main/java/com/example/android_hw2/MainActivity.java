package com.example.android_hw2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int answer; // 所要猜的數字
    private int times; // 猜測次數
    public int usergust;
    //public TextView text = findViewById(R.id.textView);
   // public static interface View.OnKeyListener;
    public View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newGame();

        //public abstract boolean onKey (v ,int keyCode,checkAns(v));
        Button button = findViewById(R.id.button);

        button.setOnClickListener(example);
    }

    private View.OnClickListener example = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            playAgain(v);
        }
    };

    public void newGame() {
        answer = new Random().nextInt(100) +1 ;
        times = 0;
    }
    public void checkAns(View v) {
        // 將使用者之猜測(userGuess)與正確答案(answer)做比較，並顯示結果
        //textView.setText("@string/right");

        if(usergust==answer){
            //TODO:匯出中獎，並秀出times，隱藏按鈕
        }else {
            if(usergust>answer){
                //TODO:匯出太小
            }else if(usergust<answer){
                //TODO:匯出太大
            }
        }


    }
    public void playAgain(View v) {
        times++;
        checkAns(v);
    }

}