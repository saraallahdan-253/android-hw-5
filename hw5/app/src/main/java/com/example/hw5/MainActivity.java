package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        final EditText jop = findViewById(R.id.jop);
        final EditText email = findViewById(R.id.email);
        final EditText phone = findViewById(R.id.phone);
        final Button next = findViewById(R.id.button1);
        TextView con = findViewById(R.id.Contactme);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String one = name.getText().toString();
                String two = age.getText().toString();
                String three = jop.getText().toString();
                String four = email.getText().toString();
                String five = phone.getText().toString();
                Intent s = new Intent(MainActivity.this, MainActivity2.class);
                s.putExtra("o1", one);
                s.putExtra("o2", two);
                s.putExtra("o3", three);
                s.putExtra("o4", four);
                s.putExtra("o5", five);
                startActivity(s);
                next.setTextColor(Color.BLACK);
            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(r);
            }
        });
    }
}