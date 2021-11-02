package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class HomepPage extends AppCompatActivity {
    static int counter = 0 ;
    static  TextView count ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homep_page);
        Bundle extras = getIntent().getExtras();
        count = findViewById(R.id.notes);
        if (extras != null) {
            String username = extras.getString("username");
            TextView title = findViewById(R.id.welcome);
            title.setText("Welcome, "+ username);

        }
        FloatingActionButton add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),addNote.class);
                startActivityForResult(intent, 12);
            }
        });
    }


    public void onActivityResult(int reqCode , int resCode , Intent  data){
        super.onActivityResult(reqCode , resCode , data);
        if(reqCode == 12 && resCode == RESULT_OK){
          Toast.makeText(HomepPage.this ,"New note added" , Toast.LENGTH_SHORT ).show();
          count.setText("Notes("+ ++counter + ")");
        }else if(resCode == RESULT_CANCELED){
            Toast.makeText(HomepPage.this ,"Nothing added!" , Toast.LENGTH_SHORT ).show();

        }
    }


}