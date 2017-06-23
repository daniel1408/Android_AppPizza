package com.example.daniel.database.Decorator.Complementos;

import com.example.daniel.database.Servicos;

/**
 * Created by daniel on 6/19/16.
 */
public class CPalmito extends Servicos {

    public CPalmito (Complementos complementos ){
        super(complementos);
    }

    @Override
    public double getCusto(double valor) {
        return 6.20 + this.getComplementos().getCusto(valor);
    }

    @Override
    public String getDescricao() {
        return "\nComplemento palmito " + this.getComplementos().getDescricao();
    }
}
