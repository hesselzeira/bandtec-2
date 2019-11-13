package br.com.bandtec.projeto.listas;

import java.util.ArrayList;
import java.util.List;

public class ProgramaListasLimitadas {
    public static void main(String[] args) {
        // listas que só aceitam um tipo
        List<String> frases = new ArrayList<>();
        
        frases.add("amor");
        frases.add("ódio");
        frases.add("paixão");
        //frases.add(88); NÃO COMPILA!
        //frases.add(false); NÃO COMPILA!
        
        List<Boolean> afirmacoes = new ArrayList<>();
        afirmacoes.add(true);
        afirmacoes.add(false);
        afirmacoes.add(false);
        afirmacoes.add(true);
        
        
        Esporte esp = new Esporte();
        Futebol fut = new Futebol();
        Boxe box = new Boxe();
        
        // a limitação de tipo numa lista
        // significa que ela aceitará
        // o tipo e suas subclasses
        List<Esporte> esportes = new ArrayList<>();
        esportes.add(esp);
        esportes.add(fut);
        esportes.add(box);
        
        System.out.println("Esportes: "+esportes);
        
        // o inversão NÃO FUNCIONA
        // ou seja, incluir superclasse
        List<Futebol> listaSoccer = new ArrayList<>();
        listaSoccer.add(fut);
        // listaSoccer.add(esp); // NÃO COMPILA!
        
    }
}
