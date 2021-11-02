package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HomepPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homep_page);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("username");
            TextView title = findViewById(R.id.welcome);
            title.setText("Welcome, "+ username);
        }
    }


}