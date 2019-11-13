package br.com.bandtec.projeto.listas;

public class Bairro {
    
    private String nome;
    private Integer populacao;

    public Bairro(String nome, Integer populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    @Override
    public String toString() {
        return "Bairro{" + "nome=" + nome + ", populacao=" + populacao + '}';
    }

   
    
    
    
}
