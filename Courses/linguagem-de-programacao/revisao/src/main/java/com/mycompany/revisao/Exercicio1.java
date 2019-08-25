package com.mycompany.revisao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua primeira nota...");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua segunda nota...");
        Double nota2= leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Sua média é %.1f", media));
    }
   
}
