package prova;

public class LotoFacil extends Jogo {

    @Override
    public String getNomeJogo() {
        return "Lotofacil";
    }

    public LotoFacil() {
        this.valorPremio = 5_000.00;
        this.quantidadeNumeros = 15;
    }
    
    
    
}
