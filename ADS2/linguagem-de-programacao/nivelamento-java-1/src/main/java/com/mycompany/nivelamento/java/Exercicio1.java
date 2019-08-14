package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //apertar ctrl+space para importar biblioteca
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual é seu nome?");
        String nome = leitor.next();
        
        System.out.println("Informe a primeira nota");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Informe a sua segunda nota");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Olá %s, sua média é %.1f", 
                   nome, media));
            
            
    }
}
