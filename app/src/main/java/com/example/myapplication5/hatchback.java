package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class hatchback extends AppCompatActivity {
    private ImageView v60,v40;
    private TextView hatchbackv60,hatchbackv40;
    private Button buttongeri3;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatchback);

        v60=findViewById(R.id.v60);
        v40=findViewById(R.id.v40);
        hatchbackv40=findViewById(R.id.hatchbackv40);
        hatchbackv60=findViewById(R.id.hatchbackv60);
        buttongeri3=findViewById(R.id.buttongeri3);

        v60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        v40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttongeri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}