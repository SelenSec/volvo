package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class sedan extends AppCompatActivity {
 private ImageView s90,imageView2;
 private TextView s90secreen,s60screen;
 private Button buttongeri2;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sedan);

        s90secreen=findViewById(R.id.s90secreen);
        s60screen=findViewById(R.id.s60screen);

        s90=findViewById(R.id.s90);
        imageView2=findViewById(R.id.imageView2);
        buttongeri2=findViewById(R.id.buttongeri2);


        s90secreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        s60screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttongeri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}