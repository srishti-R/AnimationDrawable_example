package com.android.example.animationdrawable_example;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      // lottieAnimationView=(LottieAnimationView)findViewById(R.id.lottie);
      // lottieAnimationView.setAnimation(R.raw.chat);
       // lottieAnimationView.playAnimation();

    }
}
