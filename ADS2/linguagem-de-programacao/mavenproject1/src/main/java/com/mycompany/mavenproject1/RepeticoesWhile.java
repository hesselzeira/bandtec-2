package com.mycompany.mavenproject1;

public class RepeticoesWhile {

    public static void main(String[] args) {
        Integer filhos = 0;

        while (filhos < 3) {
            System.out.println("Você não está aumentando a população");
            filhos++;
        }

        System.out.println("Filhos: " + filhos);

        //exiba todos os números pares de 0 à 40 usando while
        Integer numeros = 0;

        while (numeros <= 40) {
            System.out.println(numeros);
            numeros++;
        }

        numeros = 2;
        
        while (numeros <= 40) {
            System.out.println(numeros);
            numeros += 2;
        }
        
        /*
        Exemplo de loop infinito
        
        while(true) {
            s
        }
        
        */
        
    }
}
