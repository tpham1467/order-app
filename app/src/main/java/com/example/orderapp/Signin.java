package com.example.orderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.orderapp.view.FirstActivity;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Button button = findViewById(R.id.btn_snin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Signin.this, MainActivity.class);
                startActivity(intent1);
            }
        });


        TextView button_txt_SignUp = findViewById(R.id.tv_SignUp);
        button_txt_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Signin.this, SignUp.class);
                startActivity(intent2);
            }
        });
    }
}