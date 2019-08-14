package com.mycompany.ifelse;

import java.util.Scanner;

public class ClassesSociais {
    /*
    de 0 a 2 salários: Classe D
    +2 a 4: Classe C
    +4 a 8: Classe B
    +8 salários: Classe A
    */
    
    /*
    Leia o valor do salário bruto do usuário. Considere que um salário
    é 900,00. Calcule quantos salários minímos ganha e informe sua classe sociail
    */
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
        System.out.println("Qual é seu salário bruto?");
        Double bruto = leitor.nextDouble();
        
        Double salario = bruto /900.0;
        
        System.out.println(String.format("Você ganha %.1f salário(s)", salario));
        
        if (salario <= 2){
            System.out.println("Classe D");
        } else if (salario > 8) {
            System.out.println("Classe A");
        } else if (salario > 4 && salario <= 8) {
            System.out.println("Classe C");
        }
    }
    
}
