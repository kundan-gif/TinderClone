package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermAndCondition extends AppCompatActivity {
    private Button btnTermAndConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_and_condition);
        initilizationAndListner();
    }
    private void initilizationAndListner() {
        btnTermAndConditions = findViewById(R.id.buttonconti);
        btnTermAndConditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermAndCondition.this , My_firstname_intro_page.class);
                startActivity(intent);
            }
        });
    }
}