package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class recharge extends AppCompatActivity {
    private ImageView xc40recharge,imageView3;
    private TextView c40recharge,xc40recharger;
    private Button buttongeri5;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);

        xc40recharge=findViewById(R.id.xc40recharge);
        imageView3=findViewById(R.id.imageView3);

        c40recharge=findViewById(R.id.c40recharge);
        xc40recharger=findViewById(R.id.xc40recharger);
        buttongeri5=findViewById(R.id.buttongeri5);

        xc40recharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        c40recharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        xc40recharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttongeri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}