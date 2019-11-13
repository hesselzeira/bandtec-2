package prova;

public class MegaSena extends Jogo {

    @Override
    public String getNomeJogo() {
        return "Mega Sena"; 
    }

    public MegaSena() {
        Double valorPremio = 1_000_000.00;
        Integer quantidadeNumeros = 6;
    }
    
    
}
