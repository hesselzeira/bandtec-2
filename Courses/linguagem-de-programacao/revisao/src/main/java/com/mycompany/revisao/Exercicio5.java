package com.mycompany.revisao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você tem?");
        Integer qtdFilhos0a3 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você tem?");
        Integer qtdFilhos4a16 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você tem?");
        Integer qtdFilhos17a18 = leitor.nextInt();
        
        Integer qtdTotalDeFilhos = qtdFilhos0a3 + qtdFilhos17a18 + qtdFilhos4a16;
        
        Double valorFilho0a3 = 25.12;
        Double valorFilho4a16 = 15.88;
        Double valorFilho17a18 = 12.44;
        
        Double bolsaFamilia = (qtdFilhos0a3 * valorFilho0a3) + (qtdFilhos4a16 *
                valorFilho4a16) + (qtdFilhos17a18 * valorFilho17a18);
        
        System.out.println(String.format("Você tem um total de %s filho(s) e receberá "
                + "R$ %.2f de bolsa", qtdTotalDeFilhos, bolsaFamilia));
        
    }
}
