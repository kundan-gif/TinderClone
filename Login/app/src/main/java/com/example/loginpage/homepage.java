package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class homepage extends AppCompatActivity {
    private ImageButton btnlikes;
    private ImageButton btnmessges;
    private ImageButton btnaccount;
    private ImageButton mImgBtnReload;
    private ImageButton mImgBtnBoost;
    private ImageButton mImgBtnCross;
    private ImageButton mImgBtnStar;
    private ImageButton mImgBtnLike;


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
       mImgBtnReload=findViewById(R.id.iBtnReload);
       mImgBtnBoost=findViewById(R.id.imgBtnBoost);
       mImgBtnCross=findViewById(R.id.imgBtnCross);
       mImgBtnStar=findViewById(R.id.imgBtnStar);
       mImgBtnLike=findViewById(R.id.imgBtnLike);
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
                Intent intent = new Intent(homepage.this , accountpage.class);
                startActivity(intent);
            }
        });
        mImgBtnReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this , TinderPlus.class);
                startActivity(intent);
            }
        });
        mImgBtnBoost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this , BoostActivity.class);
                startActivity(intent);
            }
        });
        mImgBtnCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(homepage.this,"NOPE", Toast.LENGTH_SHORT).show();
            }
        });
        mImgBtnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(homepage.this,"SUPER LIKE", Toast.LENGTH_SHORT).show();
            }
        });
        mImgBtnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(homepage.this,"LIKE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}