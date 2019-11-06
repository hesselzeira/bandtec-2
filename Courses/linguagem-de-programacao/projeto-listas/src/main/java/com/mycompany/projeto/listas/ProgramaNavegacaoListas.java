package com.mycompany.projeto.listas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgramaNavegacaoListas {

    public static void main(String[] args) {
        //criando uma lista completa com elementos
        List<String> textos = Arrays.asList("Chile", "Argentina", "Brasil");

        //método 1: 'form clássico'
        for (Integer i = 0; i < textos.size(); i++) {
            System.out.println(i + " - " + textos.get(i));
        }

        System.out.println("");

        // método 2: 'enhanced for '
        for (String texto : textos) {
            System.out.println(texto);

        }
        
        System.out.println("");
        
        //método 3: 'foreach'(para cada) (Java 8+)
        // também podemos dizer que aqui usamos uma expressão
        // LAMBDA (lambda expression)
        textos.forEach(texto -> {
            System.out.println(texto);
        });
        
        //ordenação simples (ou ordenação)
        Collections.sort(textos);
        
        System.out.println("lista após sort(): "+textos);
        
        
        List<Double> numeros = Arrays.asList(12.9, 50.0, 20.7, 9.0);
        Collections.sort(numeros);
        
        System.out.println("número após sort(): "+numeros);
        
        List <List> listas = Arrays.asList(numeros, textos);
        //Collections.sort(listas);
        
        //o Collection.sort() é banstante LIMITADO
        //listas de tipos complexos ele não suporta
        //assim, o código abaixo nem compila
        //Collection.sort(listas);
        

    }
}
