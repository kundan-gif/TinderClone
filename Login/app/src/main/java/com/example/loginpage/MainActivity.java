package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnLaunchHomepage;
    private Button btnMobileVerification;
    private Button btnwithFacebook;
    private Button btnGoogleLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilizationAndLisner();
    }

    private void initilizationAndLisner() {
        btnLaunchHomepage = findViewById(R.id.btnGoogle);
        btnMobileVerification = findViewById(R.id.btnPhoneNumber);
        btnwithFacebook = findViewById(R.id.btnFacebook);
        btnGoogleLogin = findViewById(R.id.btnGoogle);
        btnLaunchHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,homepage.class);
                startActivity(intent);
            }
        });

        btnMobileVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this , MobileNumberPage.class);
                startActivity(intent);
            }
        });
        btnwithFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FacebookLogin.class);
                startActivity(intent);
            }
        });
        btnGoogleLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GoogleLogInPage.class);
                startActivity(intent);
            }
        });
    }
}