package com.mycompany.ifelse;

import java.util.Scanner;

public class ComparacaoTextos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        /*
    Pergunte ao usuário se ele é a favor, contra ou não sabe responder
    sobre o fim do FGTS.
    S(sim), N(não) ou NDA (não sabe responder)
         */
        System.out.println("Você é a favor do fim FGTS?     S(sim), N(não) ou "
                + "NDA (não sabe responder)\n" + "");

        String resposta = leitor.next();
        /*
        para texto não se usa == 
         */

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Você é a favor");
        } else if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Você é contra");
        } else {
            System.out.println("Sem opinião formada");
        }

        System.out.println("Digite o nome da capital do Brasil");
        String capital = leitor.next();

        if (!capital.equalsIgnoreCase("Brasília")) {
            System.out.println("Errrrrrroooooooou!!!!");
        } else {
            System.out.println("Acertou mizeravi");
        }

        System.out.println("Digite a primeira letra de sua zona");
        String zona = leitor.next();

        if (zona.equalsIgnoreCase("N")) {
            System.out.println("Zona Norte");
        } else if (zona.equalsIgnoreCase("S")) {
            System.out.println("Zona Sul");
        } else if (zona.equalsIgnoreCase("O")) {
            System.out.println("Zona Oeste");
        } else {
            System.out.println("Zona Leste");
        }

    }
}
