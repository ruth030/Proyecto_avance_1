package com.example.proyecto_avance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {

    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imagen=findViewById(R.id.imageview1);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },7000);

        String url = "https://i.pinimg.com/originals/c0/bf/43/c0bf43c0e878dffbf7162e5c84452f88.gif";

        Uri urlparse=Uri.parse(url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagen);
    }
}