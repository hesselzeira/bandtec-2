package prova;

public class Quina extends Jogo {

    @Override
    public String getNomeJogo() {
        return "Quina";
    }

    public Quina() {
        Double valorPremio = 10_000.00;
        Integer quantidadeNumeros = 5;
    }

    
}
