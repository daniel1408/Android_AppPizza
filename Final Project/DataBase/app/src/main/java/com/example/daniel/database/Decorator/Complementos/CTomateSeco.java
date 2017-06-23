package com.example.daniel.database.Decorator.Complementos;

import com.example.daniel.database.Servicos;

/**
 * Created by daniel on 6/19/16.
 */
public class CTomateSeco extends Servicos {

    public CTomateSeco (Complementos complementos ){
        super(complementos);
    }

    @Override
    public double getCusto(double valor) {
        return 6.10 + this.getComplementos().getCusto(valor);
    }

    @Override
    public String getDescricao() {
        return "\nComplemento tomate seco " + this.getComplementos().getDescricao();
    }
}
