package com.mycompany.revisao;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas tem no elevador?");
        Integer qtdPessoas = leitor.nextInt();

        System.out.println("Qual é o peso do elevador neste momento?");
        Double totalPeso = leitor.nextDouble();

        Double media = totalPeso / qtdPessoas;

        System.out.println(
                String.format(
                    "Entraram %d pessoas no elevador. Agora ele tem %.1f"
                    + "kg. O peso médio de casa pessoa é de %.1f kg",
                qtdPessoas,
                totalPeso,
                media
                )
        );
    }
}
