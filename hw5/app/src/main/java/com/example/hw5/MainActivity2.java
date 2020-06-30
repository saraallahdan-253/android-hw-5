package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name1= findViewById(R.id.name1);
        TextView age1 = findViewById(R.id.age1);
        TextView jop1= findViewById(R.id.jop1);
        TextView email1 = findViewById(R.id.email1);
        TextView phone1 = findViewById(R.id.phone1);

        Bundle p = getIntent().getExtras();
    name1.setText("name:  "+p.getString("o1")) ;
     age1.setText("age:    "+ p.getString("o2"));
     jop1.setText("jop:    " +p.getString("o3")) ;
     email1.setText("e-mail:    " +p.getString("o4")) ;
     phone1.setText("phon number:    " +p.getString("o5")) ;
    }
}