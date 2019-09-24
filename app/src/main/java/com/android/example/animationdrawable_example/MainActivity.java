package com.android.example.animationdrawable_example;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    AnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.image);
        imageView.setBackgroundResource(R.drawable.animation_loading);

        anim=(AnimationDrawable)imageView.getBackground();
        anim.start();
        Intent intent =new Intent(MainActivity.this, SplashActivity.class);
        scheduleNextActivity(intent);
    }

  public void scheduleNextActivity(final Intent intent){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 2000);




      }

}
