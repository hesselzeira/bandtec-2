package com.mycompany.projeto.swing.heranca;

public class Corredor {
    
    //quase como o private, porém fica 
    //disponível para heranças
    protected String tipoFisico;
    protected String performance;
    protected Double tempoMedioCorrendo;

    //alt + insert cria os GETTERS
    public String getTipoFisico() {
        return tipoFisico;
    }

    public String getPerformance() {
        return performance;
    }

    public Double getTempoMedioCorrendo() {
        return tempoMedioCorrendo;
    }

    
  
}
