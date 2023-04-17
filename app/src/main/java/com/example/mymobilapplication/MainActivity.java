package com.example.mymobilapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


        Button btnShowName=findViewById(R.id.btnShowName);
        TextView tvShowName=findViewById(R.id.tvShowName);
        EditText editTextEnterName=findViewById(R.id.editTextEnterName);
        Button btnShowNameButSecondPage=findViewById(R.id.btnShowNameButSecondPage);

        btnShowNameButSecondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Veri Gönderme
                Intent i = new Intent(getApplicationContext(),secondPage.class);
                String data = editTextEnterName.getText().toString();
                i.putExtra("data",data);
                startActivity(i);
            }
        });

        btnShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowName.setText(editTextEnterName.getText());
                editTextEnterName.setText("");
            }
        });

        Button btnSecondPage = findViewById(R.id.btnSecondPage);
        btnSecondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Bir sonraki sayfaya geçiş kodu
                Intent i = new Intent(getApplicationContext(),secondPage.class);
                startActivity(i);
            }
        });

    }
}