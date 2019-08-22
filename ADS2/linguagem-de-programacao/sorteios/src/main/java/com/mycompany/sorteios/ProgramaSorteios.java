package com.mycompany.sorteios;

import java.util.Random;

public class ProgramaSorteios {
    public static void main(String[] args) {
        //Geração de números aleatórios
        
        //uma variavel do tipo random é capaz de gerar
        //número e valores aleatórios
//        Random sorteador = new Random();
        
        // ex: sorteando um inteiro qualquer (inclusive negativo)
//        Integer aleatorioA = new Random().nextInt();
//        System.out.println("Sorteio A: "+aleatorioA);
        
        // ex: sorteando um inteiro positivo até 99
        //      0 100 jamais será sorteado 
//        Integer aleatorioB = new Random().nextInt(5);
//        System.out.println("Sorteio B: "+aleatorioB);
        
        //Crie um sorteio cujo resultado exibido p/ o usuário
        // seja os valores de um dadinho (1 a 6)
        
        Random sortdadinho = new Random();
        Integer dadinho = new Random().nextInt(6);
        System.out.println(dadinho+1);
        
        
    }  
        
}
