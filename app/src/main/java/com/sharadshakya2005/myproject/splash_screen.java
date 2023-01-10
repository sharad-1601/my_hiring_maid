package com.sharadshakya2005.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {


    ImageView imageView;
    Animation upperanimation,bottomanimation;
    TextView textView1, textView2;



    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        imageView = findViewById(R.id.logohome);
        textView1 = findViewById(R.id.applicationname);
        textView2 = findViewById(R.id.subtitle);

        upperanimation = AnimationUtils.loadAnimation(this,R.anim.upper_animation);
        bottomanimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        imageView.setAnimation(upperanimation);
        textView1.setAnimation(bottomanimation);
        textView2.setAnimation(bottomanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), login.class));
                finish();
            }
        },4000);
    }
}