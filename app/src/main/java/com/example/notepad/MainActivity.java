package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        /*start*/
        final String EMAIL = "mahmoud";
        final String PASS = "1234";
        EditText email = (EditText) findViewById(R.id.email);
        EditText pass = (EditText) findViewById(R.id.pass);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inEmail = email.getText().toString();
                String inPass  = pass.getText().toString();
                Intent intent;
               intent = new Intent(getBaseContext(), HomepPage.class);
               intent.putExtra("username" , inEmail);
                if ( inEmail.equals(EMAIL)  && inPass.equals(PASS) ) {
                    startActivity(intent);
                }
                else{
                    System.out.println("Wrong Email or Password");
                    Toast.makeText(MainActivity.this , "Wrong Email or Password", Toast.LENGTH_SHORT).show();
                }

            }
        });


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
        System.out.println("hello there!,  destruction");


    }




}