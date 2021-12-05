package com.workaholic.lee.workaholic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1100);

                    Intent intent = new Intent(getApplicationContext(),WebActivity.class);
                    startActivity(intent);
                    finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();




    }
}
