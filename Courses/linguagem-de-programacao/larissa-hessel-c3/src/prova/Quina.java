package prova;

public class Quina extends Jogo {

    @Override
    public String getNomeJogo() {
        return "Quina";
    }

    public Quina() {
        this.valorPremio = 10_000.00;
        this.quantidadeNumeros = 5;
    }

    
}
