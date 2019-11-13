package br.com.bandtec.projeto.listas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramaSets {
    public static void main(String[] args) {
        // além da List, podemos agrupar valores
        // em um Set.
        
        // a implementação HashSet usa uma 
        // ordenação baseada em Hash.
        // isso muda a ordem de inserção
        // e torna a busca mais rápida
        Set<String> textos = new HashSet<>();
        textos.add("zoeira");
        textos.add("amor");
        textos.add("paixão");
        textos.add("amor");
        textos.add("saudade");
        textos.add("dor");
        textos.add("dor");
        
        System.out.println("textos: "+textos);
        
        // o LinkedHashSet respeita a ordem de inserção
        Set<String> textos2 = new LinkedHashSet<>();
        textos2.add("colher");
        textos2.add("prato");
        textos2.add("garfo");
        textos2.add("faca");
        System.out.println("textos2: "+textos2);
        
        // o TreeSet tenta ordenar na medida 
        // em que os elementos vão sendo inseridos
        Set<String> textos3 = new TreeSet<>();
        textos3.add("Recife");
        textos3.add("Porto Alegre");
        textos3.add("Cametá");
        textos3.add("Zoeiralândia");
        textos3.add("Aracajú");
        textos3.add("Manaus");
        textos3.add("Belém");
        System.out.println("textos3: "+textos3);
        
    }
}
