package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class likespage extends AppCompatActivity {
    private ImageButton mBtnHome;
    private ImageButton mBtnLikes;
    private ImageButton mBtnMessage;
    private ImageButton mBtnAccount;
    private Button mBtnSeeLikes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likespage);
        initializeAndViews();
    }
    private void initializeAndViews(){
        mBtnHome=findViewById(R.id.button1);
        mBtnLikes=findViewById(R.id.likes);
        mBtnMessage=findViewById(R.id.messages);
        mBtnAccount=findViewById(R.id.account);
        mBtnSeeLikes=findViewById(R.id.btnSeeLikes);

        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(likespage.this,homepage.class);
                startActivity(intent);
            }
        });
        mBtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(likespage.this,messegepage.class);
                startActivity(intent);
            }
        });
        mBtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(likespage.this,accountpage.class);
                startActivity(intent);
            }
        });
        mBtnSeeLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(likespage.this,TinderPlus.class);
                startActivity(intent);
            }
        });
    }
}