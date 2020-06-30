package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView em = findViewById(R.id.email2);
        final TextView ph = findViewById(R.id.phone2);

        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(Intent.ACTION_SEND);
                w.setType("text/html");
                w.putExtra(Intent.EXTRA_EMAIL, "saraallahdan@icloud.com");
                w.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                w.putExtra(Intent.EXTRA_TEXT, "E-MAIL ME .");

                startActivity(Intent.createChooser(w, "Send Email"));
            }
        });
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:99999999"));
                startActivity(intent);
            }
        });


    }
}