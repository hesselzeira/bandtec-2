package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Jogo {

    protected Double valorPremio;
    protected Integer quantidadeNumeros;

    public abstract String getNomeJogo();

    public String getSorteador() {
             
        return "lista";

    };

    public Double getValorPremio() {
        return valorPremio;
    }

    public Integer getQuantidadeNumeros() {
        return quantidadeNumeros;
    }
    
    
    
}
