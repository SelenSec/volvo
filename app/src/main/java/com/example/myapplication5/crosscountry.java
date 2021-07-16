package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class crosscountry extends AppCompatActivity {
    private ImageView v60cc,v40cc;
    private TextView v60crosscountry,v40crosscountry;
    private Button buttongeri4;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crosscountry);

        v60cc=findViewById(R.id.v60cc);
        v40cc=findViewById(R.id.v40cc);
        buttongeri4=findViewById(R.id.buttongeri4);
        v60crosscountry=findViewById(R.id.v60crosscountry);

        v40crosscountry=findViewById(R.id.v40crosscountry);

        v60cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        v40cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttongeri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}