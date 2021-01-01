package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class accountpage extends AppCompatActivity {
    private ImageButton mBtnHome;
    private ImageButton mBtnLikes;
    private ImageButton mBtnMessage;
    private ImageButton mBtnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountpage);
        initializeAndViews();
    }
    private void initializeAndViews(){
        mBtnHome=findViewById(R.id.button1);
        mBtnLikes=findViewById(R.id.likes);
        mBtnMessage=findViewById(R.id.messages);
        mBtnAccount=findViewById(R.id.account);

        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(accountpage.this,homepage.class);
                startActivity(intent);
            }
        });
        mBtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(accountpage.this,messegepage.class);
                startActivity(intent);
            }
        });
        mBtnLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(accountpage.this,likespage.class);
                startActivity(intent);
            }
        });
    }
}