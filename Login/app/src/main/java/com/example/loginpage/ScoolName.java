package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoolName extends AppCompatActivity {
    private Button btnSchoolContinueIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scool_name);
        initilizationAndListner();
    }
    private void initilizationAndListner() {
        btnSchoolContinueIntro = findViewById(R.id.btnschoolContinue);
        btnSchoolContinueIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoolName.this, PassionPage.class);
                startActivity(intent);
            }
        });
    }
}