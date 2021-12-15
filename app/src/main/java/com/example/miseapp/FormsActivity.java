package com.example.miseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FormsActivity extends AppCompatActivity {

    private TextView txTitulo;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        txTitulo = (TextView) findViewById(R.id.txTitulo);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");

        txTitulo.setText(name);
    }
}