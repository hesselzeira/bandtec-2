package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos possui?");
        Integer filho0a3Qtd = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos possui?");
        Integer filho4a16Qtd = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos possui?");
        Integer filho17a18Qtd = leitor.nextInt();
        
        Double filho0a3Valor = 25.12;
        Double filho4a16Valor = 15.88;
        Double filho17a18Valor = 12.44;
        
        Integer totalFilhos = filho0a3Qtd + filho4a16Qtd + filho17a18Qtd;
        
        Double bolsaFamilia = (filho0a3Qtd * filho0a3Valor) + (filho4a16Qtd *
                filho4a16Valor) + (filho17a18Qtd * filho17a18Valor);
        
        System.out.println(String.format("Você tem um total de %d filhos e vai "
                + "receber R$%.2f de bolsa",totalFilhos ,bolsaFamilia));
        
    }

}
