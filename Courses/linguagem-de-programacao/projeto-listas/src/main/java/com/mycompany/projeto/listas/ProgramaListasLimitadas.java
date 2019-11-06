package com.mycompany.projeto.listas;

import java.util.ArrayList;
import java.util.List;

public class ProgramaListasLimitadas {
    public static void main(String[] args) {
        
        List<String> frases = new ArrayList<>();
        
        frases.add("amor");
        frases.add("ódio");
        frases.add("paixão");
        frases.add("paixão");
        //frases.add(88); NÃO COMPILA!
        //frase.add(false); NÃO COMPILA!
        
        frases.remove("paixão");
        
        System.out.println("list" +frases);
        
        List<Boolean> afirmacoes = new ArrayList<>();
        afirmacoes.add(true);
        afirmacoes.add(true);
        afirmacoes.add(false);
        afirmacoes.add(false);
        
        //System.out.println("afirmações:" +afirmacoes);
        
        Esporte esp = new Esporte();
        Futebol fut = new Futebol();
        Boxe box = new Boxe();
        
       // a limitação de tipo numa lista
       //significa que ela aceirará
       // o tipo e usas subclasses
        List<Esporte> esporte = new ArrayList<>();
        esporte.add(esp);
        esporte.add(fut);
        esporte.add(box);
        
        System.out.println("Esporte: "+esporte);
    }
}
