package com.example.daniel.database.FabricaAcrescimos;

import com.example.daniel.database.Decorator.Complementos.Complementos;
import com.example.daniel.database.Servicos;

/**
 * Created by daniel on 6/19/16.
 */
public interface FabricaServicos {

    public Servicos fazerServico(Complementos complemento);
}
