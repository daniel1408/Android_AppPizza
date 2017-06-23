package com.example.daniel.database.Decorator.Complementos;

/**
 * Created by daniel on 6/19/16.
 */
public class PizzaCompleta extends Complementos{

    @Override
    public double getCusto(double valor) {
        valor = 40;
        return valor;
    }

    @Override
    public String getDescricao() {
        return "\nPizza";
    }
}