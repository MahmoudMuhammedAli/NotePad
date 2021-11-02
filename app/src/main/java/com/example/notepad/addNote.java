package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addNote extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        EditText title = findViewById(R.id.title_input);
        Button save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(title.getText().toString().equals("")){
                    Toast.makeText(addNote.this, "enter the note title!", Toast.LENGTH_SHORT).show();
                }else{
                    Intent replyIntent = new Intent();
                    replyIntent.putExtra("add", true);
                    setResult(RESULT_OK, replyIntent);
                    finish();
                }

            }
        });
     }
    }
