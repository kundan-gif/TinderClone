package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Birthday_Page extends AppCompatActivity {
    private Button btnBirthContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday__page);
        initilizationAndListner();
    }
    private void initilizationAndListner() {
        btnBirthContinue = findViewById(R.id.buttonconti);
        btnBirthContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Birthday_Page.this , GenderPage_Intro.class);
                startActivity(intent);
            }
        });
    }
}