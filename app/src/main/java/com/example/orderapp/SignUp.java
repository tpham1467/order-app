package com.example.orderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView button_txt_SignIn = findViewById(R.id.textView_SignIn);
        button_txt_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, Signin.class);
                startActivity(intent);
            }
        });

        TextView button_txt_Forgotpass_snup = findViewById(R.id.textView_Forgotpass_snup);
        button_txt_Forgotpass_snup .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SignUp.this, CreateAccount.class);
                startActivity(intent2);
            }
        });

    }

}