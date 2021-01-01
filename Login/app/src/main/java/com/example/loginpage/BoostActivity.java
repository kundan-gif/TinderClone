package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoostActivity extends AppCompatActivity {
    private Button mBtnBoost;
    private Button mBtnGetTinderPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boost);
        initializeViewsAndListeners();
    }
    private void initializeViewsAndListeners(){
        mBtnBoost=findViewById(R.id.btnBoost);
        mBtnGetTinderPlus=findViewById(R.id.btnGetTinderPlus);
        mBtnBoost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoostActivity.this,homepage.class);
                startActivity(intent);
            }
        });
        mBtnGetTinderPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoostActivity.this,TinderPlus.class);
                startActivity(intent);
            }
        });
    }
}