package com.example.daniel.database;

import com.example.daniel.database.Decorator.Complementos.Complementos;

/**
 * Created by daniel on 6/19/16.
 */

public abstract class Servicos extends Complementos{

    private Complementos complementos;

    public Complementos getComplementos() {
        return complementos;
    }
    public void setComplementos(Complementos complementos) {
        this.complementos = complementos;
    }



    public Servicos(Complementos complementos){
        this.complementos = complementos;
    }



}
