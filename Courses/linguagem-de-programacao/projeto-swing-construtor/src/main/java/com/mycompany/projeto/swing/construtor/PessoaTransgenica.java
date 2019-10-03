package com.mycompany.projeto.swing.construtor;

public class PessoaTransgenica {
    private String cor;
    private String densidadeOssea;
    private Double pesoMedio;

    public PessoaTransgenica(String cor, String densidadeOssea, Double pesoMedio) {
        this.cor = cor;
        this.densidadeOssea = densidadeOssea;
        this.pesoMedio = pesoMedio;
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
