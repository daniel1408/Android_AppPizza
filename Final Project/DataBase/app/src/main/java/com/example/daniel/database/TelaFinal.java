package com.example.daniel.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telafinal);
    }
    public void voltarEscolha(View v) {
        Intent volt = new Intent(this, Escolha.class);
        startActivity(volt);
    }
}
