package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu login...");
        String login = leitor.next();
        
        System.out.println("Digite sua senha (não, não estou olhando)");
        String senha = leitor.next();
        
        System.out.println("Digite o seu limite de erros do login");
        Integer erro = leitor.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %d tentativa(s)"
                + "antes de ser bloqueado", login, senha, erro));
        }
}
