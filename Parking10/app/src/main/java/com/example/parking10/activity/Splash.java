package com.example.parking10.activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.parking10.MainActivity;
import com.example.parking10.R;
import com.example.parking10.ui.login.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //延时操作
        Timer timer = new Timer();
        timer.schedule(timetask,2000);
    }
    TimerTask timetask = new TimerTask() {
        @Override
        public void run() {
/*       实际逻辑应该是：登录->主界面
         未登录->登录界面
         在实现逻辑后下面代码应当被修改或者删除*/
            startActivity(new Intent(Splash.this, LoginActivity.class));



        }
    };
}
