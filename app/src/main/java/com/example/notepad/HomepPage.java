package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomepPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homep_page);
        System.out.println("Hello there! , onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Hello there! , onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Hello there! , onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Hello there! , onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Hello there! , onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("misery and destruction");


    }
}