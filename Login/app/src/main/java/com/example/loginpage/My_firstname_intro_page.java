package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class My_firstname_intro_page extends AppCompatActivity {
    private Button btnnameFirstIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_firstname_intro_page);
        initilizationAndListner();
    }
    private void initilizationAndListner() {
        btnnameFirstIntro = findViewById(R.id.buttoncontiname);
        btnnameFirstIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(My_firstname_intro_page.this , Birthday_Page.class);
                startActivity(intent);
            }
        });
    }
}