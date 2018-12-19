package com.example.seekm.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2= (TextView)findViewById(R.id.textView2);
        MyCount count = new MyCount(30000,1000,textView2);
        count.start();
    }
    public class MyCount extends CountDownTimer{
        TextView tv;

        public MyCount(long millisInFuture, long countDownInterval, TextView tvx) {
            super(millisInFuture, countDownInterval);
            tv = tvx;

        }

        @Override
        public void onFinish() {
            tv.setText("I'm having trouble!");
        }

        @Override
        public void onTick(long millisUntilFinished) {
            tv.setText("Resend code in 00:0" + millisUntilFinished/1000);

        }}
}
