package com.example.daniel.database.FabricaAcrescimos;

import com.example.daniel.database.Decorator.Complementos.CCatupiry;
import com.example.daniel.database.Decorator.Complementos.CPalmito;
import com.example.daniel.database.Decorator.Complementos.Complementos;
import com.example.daniel.database.Servicos;

/**
 * Created by daniel on 6/19/16.
 */


public class FabPalmito implements FabricaServicos{

    @Override
    public Servicos fazerServico(Complementos complemento) {

        Servicos t = new CPalmito(complemento);
        return t;

    }
}
