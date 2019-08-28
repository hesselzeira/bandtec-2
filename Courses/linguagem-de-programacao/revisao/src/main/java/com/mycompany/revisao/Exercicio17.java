package com.mycompany.revisao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha um valor entre 1 a 100");
        Integer numeroUsuario = leitor.nextInt();

        Random sorteador = new Random();

        Integer acertouEm = 0;
        Integer acertouPar = 0;
        Integer acertouImpar = 0;

        for (Integer i = 1; i <= 200; i++) {
            Integer sorteioDaora = sorteador.nextInt(100);
            if (sorteioDaora == numeroUsuario && acertouEm == 0) {
                acertouEm = i;
            }
            if (sorteioDaora % 2 == 0) {
                acertouPar++;
            } else {
                acertouImpar++;
            }
        }

        if (acertouEm == 0) {
            System.out.println("XELÔ NUPODI");
        } else {
            System.out.println("AEEEEEEEEE");
            System.out.println(String.format("Seu número foi sorteado na %dª vez",
                     acertouEm));
        }
        
        System.out.println(String.format("Foram sorteados %d números pares e %d números impares",
                                          acertouPar, acertouImpar
                                        ));
//        System.out.println(String.format("%s", sorteioDaora));
//        Random sorteio = new Random();
//        Integer sorteioA = sorteio.nextInt(100);;
    }
}
