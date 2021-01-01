package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TinderPlus extends AppCompatActivity {
    private Button mBtnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinder_plus);
        mBtnContinue=findViewById(R.id.btnContinue);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TinderPlus.this,homepage.class);
                 startActivity(intent);
            }
        });
    }
}