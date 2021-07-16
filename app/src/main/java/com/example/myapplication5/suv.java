package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class suv extends AppCompatActivity {
    private TextView textViewsuvscreen,suv60,suvxc40;
    private ImageView suvxc90screen,suvxc60screen,suvxc40screen;
    private Button buttongeri;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suv);
      //textViewsuvscreen=findViewById(R.id.suvscreen);
      suv60=findViewById(R.id.suv60);
      suvxc40=findViewById(R.id.suvxc40);

      suvxc60screen=findViewById(R.id.suvxc60screen);
      suvxc90screen=findViewById(R.id.suvxc40screen);
      suvxc40screen=findViewById(R.id.suvxc40screen);
      buttongeri = findViewById(R.id.buttongeri);

      suvxc90screen.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });

      buttongeri.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              finish();
          }
      });
      suvxc60screen.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });
      suvxc40screen.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });

    }
}