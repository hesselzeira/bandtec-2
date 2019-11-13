package prova;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Jogo {

    protected Double valorPremio;
    protected Integer quantidadeNumeros;

    public abstract String getNomeJogo();

    public String getSorteados() {

        List<Double> numerosSorteados
                = Arrays.asList(1.0, 50.0, 20.7, 9.0);
        Collections.sort(numerosSorteados);

        for (Integer i = 0; i < numerosSorteados.size(); i++) {
            System.out.println(i + " - " + numerosSorteados.get(i));
        }
        
        return "numerosSorteados";
    }
    
}
