package com.mycompany.revisao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual é sua média final?");
        Double Media = leitor.nextDouble();
        
        System.out.println("Qual é sua frequência (%) final ?");
        Integer Frequencia = leitor.nextInt();
        
        if(Media > 7.0 && Frequencia > 75){
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
       
    }
}
