package com.example.daniel.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.daniel.database.Lista;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void escolher(View v) {
        Intent escolher = new Intent(this, Escolha.class);
        startActivity(escolher);
    }

    public void cadastro(View v) {
        Intent cadastro = new Intent(this, Lista.class);
        startActivity(cadastro);
    }

    public void contatos(View v) {
        Intent contatos = new Intent(this, Contatos.class);
        startActivity(contatos);
    }
    public void avaliacao(View v) {
        Intent avaliacao = new Intent(this, Avaliacao.class);
        startActivity(avaliacao);
    }

    public void sair(View v) {
        finish();
    }
}
