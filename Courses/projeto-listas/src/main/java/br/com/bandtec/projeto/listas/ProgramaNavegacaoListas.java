package br.com.bandtec.projeto.listas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgramaNavegacaoListas {

    public static void main(String[] args) {
        // criando uma lista com elementos
        List<String> textos = 
           Arrays.asList("Chile", "Argentina", "Brasil");
        
        // métodos de ITERAÇÃO numa lista
        
        // método 1: 'for clássico'
        for(Integer i=0; i<textos.size(); i++) {
            System.out.println(i+" - "+textos.get(i));
        }
        
        System.out.println("");
        // método 2: 'enhanced for'
        for (String texto : textos) {
            System.out.println(texto);
        }
        
        System.out.println("");
        // método 3: 'foreach' (Java 8+)
        // também podemos dizer que aqui
        // usamos uma expressão LAMBDA (Lambda expression)
        textos.forEach(texto -> {
            System.out.println(texto);
        });
        
        // ordenação simples (ou padrão)
        Collections.sort(textos);
        
        System.out.println(
          "lista após sort(): "+textos);
        
        
        List<Double> numeros = 
                Arrays.asList(12.9, 50.0, 20.7, 9.0);
        Collections.sort(numeros);
        
        System.out.println(
          "numeros após sort(): "+numeros);
        
        
        List<List> listas = Arrays.asList(numeros, textos);
        // o Collections.sort() é bastante LIMITADO
        // listas de tipos complexos ele não suporta
        
        // assim, o código abaixo nem compila
        // Collections.sort(listas);
        
    };
        
    
    
}
