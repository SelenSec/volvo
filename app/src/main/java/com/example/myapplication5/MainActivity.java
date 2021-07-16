package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTexttextView, editTextadı,
        editTextsoyadı,editTextmailadresi,editTexttelefon;
    private Button button;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private TextView textViewthosgeldiniz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

         textViewthosgeldiniz=findViewById(R.id.hosgeldiniz);
         editTextadı=findViewById(R.id.adı);
         editTextsoyadı=findViewById(R.id.soyadı);
         editTextmailadresi=findViewById(R.id.mailadresi);
         editTexttelefon=findViewById(R.id.telefon);
         button=findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(editTextadı.getText().toString().equals("selen")&&editTextsoyadı.getText().toString().equals("sec")){
                     sp=getSharedPreferences("GirisBilgi",MODE_PRIVATE);
                     editor=sp.edit();

                     editor.putString("Adı",editTextadı.getText().toString());
                     editor.putString("Soyadı",editTextsoyadı.getText().toString());
                     editor.commit();
                     startActivity(new Intent(MainActivity.this,secimekrani.class));

                 }else{
                     Toast.makeText(getApplicationContext(),"Giris Basarısız",Toast.LENGTH_SHORT).show();
                 }
             }
         });

    }
}