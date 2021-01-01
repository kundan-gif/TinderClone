package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wlcmtotinder extends AppCompatActivity {
    private Button btnGoogleContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlcmtotinder);
        initilizationAndListner();
    }

    private void initilizationAndListner() {
        btnGoogleContinue = findViewById(R.id.btnGoogle);
        btnGoogleContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wlcmtotinder.this , TermAndCondition.class);
                startActivity(intent);
            }
        });
    }
}