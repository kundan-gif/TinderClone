package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenderPage_Intro extends AppCompatActivity {
    private Button btnGenderContinue;
    private Button btnMaleContinue;
    private Button btnFemaleContinue;
    private Button btnMoreContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_page__intro);
        initilizationAndListner();
    }
    private void initilizationAndListner() {
        btnGenderContinue = findViewById(R.id.btnGenderContunie);
        btnFemaleContinue = findViewById(R.id.btfenmale);
        btnMaleContinue = findViewById(R.id.btnmale);
        btnMoreContinue = findViewById(R.id.btnmore);
        btnGenderContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderPage_Intro.this , Sexual_Orientation_Page.class);
                startActivity(intent);
            }
        });

        btnFemaleContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderPage_Intro.this , Sexual_Orientation_Page.class);
                startActivity(intent);
            }
        });

        btnMaleContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderPage_Intro.this , Sexual_Orientation_Page.class);
                startActivity(intent);
            }
        });

        btnMoreContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderPage_Intro.this , Sexual_Orientation_Page.class);
                startActivity(intent);
            }
        });
    }
}