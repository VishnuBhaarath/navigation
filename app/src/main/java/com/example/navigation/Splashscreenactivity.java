package com.example.navigation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class Splashscreenactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreenactivity);

        EasySplashScreen config = new EasySplashScreen(Splashscreenactivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000);

     
        setContentView(R.layout.splashscreenactivity);
    }
}
