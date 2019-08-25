package com.mycompany.sorteios;

import java.util.Random;

public class ExercicioSorteio {
    public static void main(String[] args) {
        
        /*
        a) Crie uma variável inteira entre 1 e 100 e atribua qualquer valor.
        
        b) Faça quantos sorteios forem necessários até que o sorteador sorteie o 
        mesmo número da variável do início desse enunciado
        
        c) Se a quantidade de vezes necessárias para o "bingo" for:
            *Até 3: exiba "Você é MUITO sortudo"
            *Entre 4 e 10: exiba "Você é sortudo"
            *Mais de 10: exiba "é melhor ser trabalhador"
        
        d) Ao final, exiba a quantidade de sorteios realizados 
        */
        
        Random sorteio = new Random();
        Integer sorteioA = sorteio.nextInt(100);
        Integer valor = 11;
        Integer tentativas = 1;
//        System.out.println(sorteioA);
        
        while(sorteioA != valor){
            sorteioA = sorteio.nextInt(100)+1;
            System.out.println(sorteioA);
            tentativas++;
        }
        
      
        if(tentativas <= 3){
            System.out.println("Você é MUITO sortudo");
        }else if(tentativas > 10){
            System.out.println("Não conte com a sorte");
        }else{
            System.out.println("Você até que é sortudo");
        }
        
        System.out.println("Sorteios realizados: "+tentativas);
    }
}
