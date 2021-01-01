package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FacebookLogin extends AppCompatActivity {
    private Button btnLogin;
    private EditText tvusername;
    private EditText tvFbPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);
        initilizationAndListner();
    }

    private void initilizationAndListner() {
        btnLogin = findViewById(R.id.Btnfblogin);
        tvusername = findViewById(R.id.tvfbusername);
        tvFbPassword = findViewById(R.id.tvfbpass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialsValid()) {
                    Intent intent = new Intent(FacebookLogin.this , homepage.class);
                    startActivity(intent);

                }
            }
        });
    }

    private boolean isCredentialsValid() {
        boolean isDatavalid = true;
        if (tvusername.getText().toString().isEmpty())
        {
            tvusername.setError("Username Can't be Empty");
            isDatavalid = false;
        }
        if (tvFbPassword.getText().toString().isEmpty())
        {
            tvFbPassword.setError("Password Can't be Empty");
            isDatavalid = false;
        }

        if (tvFbPassword.getText().toString().length() <6)
        {
            tvFbPassword.setError("Password is less than 6 charectors");
            isDatavalid = false;
        }

        if (tvFbPassword.getText().toString().length() >=6 )
        {
            isDatavalid = true;
        }
        return isDatavalid;

    }


}