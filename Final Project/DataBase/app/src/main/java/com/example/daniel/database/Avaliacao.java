package com.example.daniel.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

public class Avaliacao extends AppCompatActivity {

    private EditText et;
    private String data;
    private String file = "arquivo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avaliacao);
    }

    public void salvarAvaliaçao(View view){
        et = (EditText)(findViewById(R.id.IdAvalia));

        data = et.getText().toString();
        try {
            FileOutputStream fOut = openFileOutput(file,MODE_WORLD_READABLE);
            fOut.write(data.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(),"Arquivo salvo",
                    Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
