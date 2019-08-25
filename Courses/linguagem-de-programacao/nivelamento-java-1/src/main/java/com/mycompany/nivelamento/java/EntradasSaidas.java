package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class EntradasSaidas {

    public static void main(String[] args) {
        String cidade = "Francisco";
        Integer populacao = 1_500_000_000; // o _ no número facilita a visualização do número
        Double temperaturaMedia = 23.7;
        
        //Unindo via contatenação
        String frase1 = "Você mora em "+cidade
                        +" onde moram "+populacao+" pessoas";
        
        System.out.println(frase1);
                
        String frase2 = String.format(
                // %s = textos | %d = números inteiros
                "Você mora em %s onde moram %d pessoas",
                cidade, populacao);
        
        System.out.println(frase2);
        
        String frase3 = String.format(
                // %.(numero de casa) f = números reais
                "Em %s faz %.2f celsius em média",
                cidade, temperaturaMedia);
        
        System.out.println(frase3);
        
        String frase4 = String.format(
                "Aqui moram %d e a temperatura média é %.1f. Essa é %s",
                    populacao, temperaturaMedia,cidade);
        
        System.out.println(frase4);
        
        //Solicitando valores ao usuário
        // devemos criar um "Scanner"
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe sua fruta favorita");
        //solicitando a leitura no "output"
        String fruta = leitor.next();
       // System.out.println("Sua fruta é "+fruta);
        
        frase4 = String.format ("Sua fruta favorita é %s",
                fruta);
        
        System.out.println(frase4);
        
        //exs para leira de inteiro e real
        System.out.println("Informe seu semestre");
        Integer semestre = leitor.nextInt();
        
        System.out.println("Informe sua altura");
        Double altura = leitor.nextDouble();
        
        System.out.println(
                "Você mede "+ altura +" e está no "+ semestre + " º sem.");
           
    }
    
}

