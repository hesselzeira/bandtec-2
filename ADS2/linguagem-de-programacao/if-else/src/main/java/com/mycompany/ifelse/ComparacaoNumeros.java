package com.mycompany.ifelse;

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de sua idade");
        Integer idadeMinha = leitor.nextInt();
        
        System.out.println("Digite o valor do seu irmão");
        Integer idadeIrmao = leitor.nextInt();
        
        if (idadeMinha > idadeIrmao){
        System.out.println("Você é o mais velho!");
        
        }
        else if(idadeMinha < idadeIrmao){
        System.out.println("Seu irmão é o mais velho!");
        }  
        
        else{
            System.out.println("Vocês são gêmeos!");
        }
    }
}
