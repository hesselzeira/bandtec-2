package com.mycompany.sorteios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioRevisaoProva {

    public static void main(String[] args) {
        Random sorteio = new Random();
        Integer sorteado = sorteio.nextInt(100);
        Scanner numeroUsuario = new Scanner(System.in);
        Integer vezesSorteio = 0;

        for (vezesSorteio = 0; vezesSorteio >= 200; vezesSorteio++) {
            sorteado = sorteio.nextInt(100)+1;
        }
        
        if(vezesSorteio == 1){
            System.out.println("número");
        }
        
    }
}
