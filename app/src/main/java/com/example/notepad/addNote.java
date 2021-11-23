package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class addNote extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_add_note);
        EditText title = findViewById(R.id.title_input);
        Button save = findViewById(R.id.save);
        //Get The image
        EditText url = findViewById(R.id.url_input);
        Button download = findViewById(R.id.download);
        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        ImageView imageView = findViewById(R.id.image) ;
        Switch canDown = findViewById(R.id.imageSwitch);
        canDown.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if ( isChecked){
                    download.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                    url.setVisibility(View.VISIBLE);
                }
                else{
                    download.setVisibility(View.GONE);
                    imageView.setVisibility(View.GONE);
                    url.setVisibility(View.GONE);
                }
            }
        });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(URLUtil.isValidUrl(url.getText().toString())){
                    Toast.makeText(addNote.this, "downloading...", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(addNote.this,DownloadAPic.class);
                    intent.putExtra("m",url.getText().toString());
                    startService(intent);
                    imageView.setImageBitmap(DownloadAPic.bitmap );
                    System.out.println(DownloadAPic.bitmap);
                    stopService(intent);

                }
                else{
                    Toast.makeText(addNote.this, "Enter a valid URL", Toast.LENGTH_SHORT).show();
                }
            }
        });



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
