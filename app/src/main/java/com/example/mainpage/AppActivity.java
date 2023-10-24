package com.example.mainpage;

import static android.widget.Button.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.ktx.Firebase;

public class AppActivity extends AppCompatActivity {

    FirebaseAuth auth;
    public Button Logout;
    TextView textView;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        auth = FirebaseAuth.getInstance();
        Button Logout = findViewById(R.id.Logout);

        user = auth.getCurrentUser();

        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), Loginactivity.class);
            startActivity(intent);
            finish();
        } else {
            textView.setText(user.getEmail());
        }
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Loginactivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
