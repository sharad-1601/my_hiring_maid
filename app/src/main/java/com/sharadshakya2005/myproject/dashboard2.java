package com.sharadshakya2005.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard2 extends AppCompatActivity {

    Button verify, attendance, payment, feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);


        verify = findViewById(R.id.verify_mobile);
        attendance = findViewById(R.id.attendance_maid);
        payment = findViewById(R.id.payment_maid);
        feedback = findViewById(R.id.feedback_maid);


        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), verify_mobile.class);
                startActivity(intent);
            }
        });


        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), attendance.class);
                startActivity(intent);
            }
        });


        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), payment.class);
                startActivity(intent);
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), feedback.class);
                startActivity(intent);
            }
        });


    }
}