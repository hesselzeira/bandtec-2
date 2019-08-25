package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            
            System.out.println("Digite o valor unitário do produto...");
            Double preco_produto = leitor.nextDouble();
            
            System.out.println("Digite a quantidade vendida...");
            Integer quantidade = leitor.nextInt();
                       
            System.out.println("Digite o pagamento do cliente...");
            Double preco_cliente = leitor.nextDouble();
            
            Double troco = preco_cliente - (preco_produto * quantidade );
                    
            System.out.println(String.format("O seu troco será de %.2f", troco));
                
    }
    
}
