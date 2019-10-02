package com.mycompany.projeto.swing.construtor;

public class PessoaOriental {
    private String cor;
    private String densidadeOssea;
    private Double pesoMedio;
    
    //método construtor
    //é invocado quando é criado
    //um objeto desta classe
    public PessoaOriental() {
        cor = "parda";
        densidadeOssea = "média-baixa";
        pesoMedio = 3.1;
    }
    
    

    public String getCor() {
        return cor;
    }

    public String getDensidadeOssea() {
        return densidadeOssea;
    }

    public Double getPesoMedio() {
        return pesoMedio;
    }
    
    
    
}
