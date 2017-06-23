package com.example.daniel.database.Decorator.Complementos;
import com.example.daniel.database.Escolha;
import com.example.daniel.database.Servicos;

/**
 * Created by daniel on 6/19/16.
 */

public class CCatupiry extends Servicos {

    public CCatupiry (Complementos complementos ){
        super(complementos);
    }

    @Override
    public double getCusto(double valor) {
        return 4.90 + this.getComplementos().getCusto(valor);
    }

    @Override
    public String getDescricao() {
        return "\nComplemento catupiry " + this.getComplementos().getDescricao();
    }

}

