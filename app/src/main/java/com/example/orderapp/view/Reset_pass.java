package com.example.orderapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.orderapp.R;

public class Reset_pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);
        Button button = findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Reset_pass.this, Confirm_reset_pass.class);
                startActivity(intent1);
            }
        });

        TextView button_txt_snin = findViewById(R.id.textView_SignIn);
        button_txt_snin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Reset_pass.this, Signin.class);
                startActivity(intent2);
            }
        });
    }
}