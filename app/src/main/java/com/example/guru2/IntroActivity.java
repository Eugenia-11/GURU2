package com.example.guru2;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity{
@Override
protected void onCreate(Bundle saveInstanceState){
super.onCreate(saveInstanceState);
setContentView(R.layout.intro_activity); //xml,java 소스 연결
    Handler handler=new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();

        }
    },1000); //1초 후 인트로 실행
}

@Override
protected void onPause(){
    super.onPause();
    finish();
}
}
