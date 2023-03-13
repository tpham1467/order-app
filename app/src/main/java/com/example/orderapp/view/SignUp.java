package com.example.orderapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.orderapp.view.CreateAccount;
import com.example.orderapp.R;

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
        Button button = findViewById(R.id.btn_SignUp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, CreateAccount.class);
                startActivity(intent);
            }
        });

        TextView button_txt_Forgotpass_snup = findViewById(R.id.textView_Forgotpass_snup);
        button_txt_Forgotpass_snup .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SignUp.this, Reset_pass.class);
                startActivity(intent2);
            }
        });



    }

}