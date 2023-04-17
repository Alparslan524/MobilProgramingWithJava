package com.example.mymobilapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Button btnFirstPage = findViewById(R.id.btnFirstPage);

        btnFirstPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Bir önceki sayfaya geçiş kodu
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });










    }
}