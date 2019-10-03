package com.mycompany.projeto.nota;

public class BoletimUniEsquina extends Boletim{

    public BoletimUniEsquina(Double nota, Double frequencia) {
        
        if(nota >= 4.0 && frequencia >= 30.0){
            resultado = "aprovado";
        }else{
            resultado = "reprovado";
        }
        
    }
    
}
