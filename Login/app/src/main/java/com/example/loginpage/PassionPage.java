package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PassionPage extends AppCompatActivity {
    private Button btnPassionsIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passion_page);
        initilizationAndListner();
    }
    private void initilizationAndListner() {
        btnPassionsIntro = findViewById(R.id.btnContinuepassion);
        btnPassionsIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PassionPage.this, AddPhotosPage.class);
                startActivity(intent);
            }
        });
    }
}