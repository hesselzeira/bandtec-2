package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        //apertar ctrl+space para importar biblioteca
        Scanner leitor = new Scanner(System.in); 
        
                                      // .next pega qualquer coisa que o usuário
                                      // tiver escrito 
                                      
                                      // .nextInt pega um numero inteiro do usuário
        System.out.println("Quantas pessoas entraram no elevador?");
        Integer pessoas_elevador = leitor.nextInt();
        
        System.out.println("Qual o peso total no elevador?");
        Double peso_elevador = leitor.nextDouble();
        
        Double media_peso_pessoas = peso_elevador/ pessoas_elevador;
        
        System.out.println(String.format("Entraram %d pessoa(s) no elevador. Agora ele tem %.2f kg."
                + "O peso médio de cada pessoa é %.2f", pessoas_elevador, peso_elevador,
                   media_peso_pessoas));
        
        
    }
}

