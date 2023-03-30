package com.example.mymobilapplication;

import androidx.appcompat.app.AppCompatActivity;

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

        btnShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowName.setText(editTextEnterName.getText());
                editTextEnterName.setText("");
            }
        });

    }




}