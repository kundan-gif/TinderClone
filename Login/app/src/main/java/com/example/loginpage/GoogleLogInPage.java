package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoogleLogInPage extends AppCompatActivity {
    private Button btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_log_in_page);
        intilizationandListner();
    }

    private void intilizationandListner() {
        btnGoogle = findViewById(R.id.btnSignInGoogle);
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoogleLogInPage.this , homepage.class);
                startActivity(intent);
            }
        });
    }
}