package com.mycompany.painelimc;

public class CalculadoraImc {

    Double calcular(Double peso, Double altura) {
        Double resultado = peso / (altura * altura);
        return resultado;
    }
}
