package com.mycompany.revisao;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Quantos minutos você se aqueceu?");
        Integer TempoAquecimento = leitor.nextInt();
        
        System.out.println("Quantos minutos você fez aeróbicos?");
        Integer TempoAerobico = leitor.nextInt();
        
        System.out.println("Quanos minitos você fez musculação?");
        Integer TempoMusculacao = leitor.nextInt();
        
        Integer TotalTempo = TempoAerobico + TempoAquecimento + TempoMusculacao;
        
        Integer CalAquecimento = 12;
        Integer CalAerobico = 20;
        Integer CalMusculacao = 25;
        
        Integer TotalCal = (CalAerobico * TempoAerobico) + (CalAquecimento * 
                TempoAquecimento) + (CalMusculacao * TempoMusculacao);
        
        System.out.println(String.format(
                "Olá Jorge. Você fez um total de %s minutos"
                + "de exercícios e perdeu cerca de %s calorias." 
                ,TotalTempo
                , TotalCal)
                    );
    }
}
