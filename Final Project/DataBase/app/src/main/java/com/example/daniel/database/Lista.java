package com.example.daniel.database;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Lista extends AppCompatActivity {

    EditText nome, endereco;
    TextView textView;
    DataBase controle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        nome = (EditText) findViewById(R.id.nome);
        endereco = (EditText) findViewById(R.id.endereco);


        textView = (TextView) findViewById(R.id.idLista);

        controle = new DataBase(this,"",null,1);
    }

    public void chamada(View view){
        switch (view.getId()){

            case R.id.deleta:
                controle.deleta(nome.getText().toString());
                break;
            case R.id.atualiza:
                AlertDialog.Builder dialog = new AlertDialog.Builder(Lista.this);
                dialog.setTitle("ENTRE COM UM NOVO NOME");
                final EditText novo = new EditText(this);
                dialog.setView(novo);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        controle.atualiza(nome.getText().toString(),novo.getText().toString());
                    }
                });

                dialog.show();
                break;
            case R.id.listar:
                controle.listar(textView);
                break;
        }
    }

}
