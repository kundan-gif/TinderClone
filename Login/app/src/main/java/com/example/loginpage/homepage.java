package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homepage extends AppCompatActivity {
    private ImageButton btnlikes;
    private ImageButton btnmessges;
    private ImageButton btnaccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        initilizationAndListnerr();
    }

    private void initilizationAndListnerr() {
       btnlikes = findViewById(R.id.likes);
       btnmessges = findViewById(R.id.messages);
       btnaccount = findViewById(R.id.account);
       btnlikes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(homepage.this ,likespage.class);
               startActivity(intent);
           }
       });
       btnmessges.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(homepage.this , messegepage.class);
               startActivity(intent);
           }
       });
        btnaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this,accountpage.class);
                startActivity(intent);
            }
        });
    }
}