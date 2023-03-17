package com.example.orderapp;

import static com.example.orderapp.R.id.btn_SignUp;
import static com.example.orderapp.R.id.btn_snUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.orderapp.view.SignUp;
import com.example.orderapp.view.Signin;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button_Signin = findViewById(R.id.btn_login);
        button_Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, Signin.class);
                startActivity(intent);
            }
        });

       Button button_Signup = findViewById(btn_snUp);
        button_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

    }
}