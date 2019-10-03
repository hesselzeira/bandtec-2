package com.mycompany.projeto.nota;

public class BoletimBandtec extends Boletim {

    public BoletimBandtec(Double nota, Double frequencia) {
        
        if(nota >= 5.0 && frequencia >= 75.0){
            resultado = "aprovado";
        }else{
            resultado = "reprovado";
        }
        
    }
        
}
