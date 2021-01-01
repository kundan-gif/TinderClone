package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sexual_Orientation_Page extends AppCompatActivity {
    private Button btnSexContinueintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexual__orientation__page);
        initilizationAndListner();
    }

    private void initilizationAndListner() {
        btnSexContinueintro = findViewById(R.id.btnSexContinue);
        btnSexContinueintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sexual_Orientation_Page.this, ScoolName.class);
                startActivity(intent);
            }
        });
    }
}