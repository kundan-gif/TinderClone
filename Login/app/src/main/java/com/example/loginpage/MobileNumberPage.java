package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MobileNumberPage extends AppCompatActivity {
    private Button btnContinue;
    private EditText Etvtextphone;
    private EditText Etvusernamemob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number_page);
        initilizationnAndListner();
    }

    private void initilizationnAndListner() {
        btnContinue = findViewById(R.id.Tvbtncontinue);
        Etvtextphone = findViewById(R.id.editTextPhone);
        Etvusernamemob = findViewById(R.id.EtUsernamemob);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialsValid())
                {
                    Intent intent = new Intent(MobileNumberPage.this, homepage.class);
                    startActivity(intent);
                }

            }
        });
    }

    private boolean isCredentialsValid(){
        boolean isDatavalid = true;
        if (Etvusernamemob.getText().toString().isEmpty())
        {
            Etvusernamemob.setError("UserName can't be Empty");
            isDatavalid = false;
        }
        if (Etvtextphone.getText().toString().length() !=10)
        {
            Etvtextphone.setError("Mobile Number is invalid");
            isDatavalid = false;
        }
        if (Etvtextphone.getText().toString().length() ==10)
        {
            isDatavalid = true;
        }
        return isDatavalid;
    }
}