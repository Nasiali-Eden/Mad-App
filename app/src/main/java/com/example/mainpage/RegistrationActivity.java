package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    public Button CreateAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        EditText Password1 = findViewById(R.id.Password1);
        EditText Password2 = findViewById(R.id.Password2);

        CreateAccount = findViewById(R.id.CreateAccount);12e vb-jhgfds]451226=
        CreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Password1.getText().toString().equals(Password2.getText().toString())){
                    Toast.makeText(RegistrationActivity.this, "Make sure both Passwords Match", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}