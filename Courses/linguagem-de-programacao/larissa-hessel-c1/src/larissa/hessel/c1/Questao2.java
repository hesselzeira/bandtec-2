package larissa.hessel.c1;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        System.out.println("Qual é seu nome?");

        Scanner leitor = new Scanner(System.in);
        String nomeUsuario = leitor.next();

        Double valorDepositado = 0.0;
        Integer dias = 1;
        

        while (dias <= 7) {
            System.out.println(String.format("Valor depositado no dia %d:", dias));
            valorDepositado = leitor.nextDouble();
//           
            if (valorDepositado == 0.01 || valorDepositado == 0.05
                    || valorDepositado == 0.10 || valorDepositado == 0.25
                    || valorDepositado == 0.50 || valorDepositado == 1.00) {
                
            System.out.println(String.format("Valor depositado no dia %d:" +valorDepositado, dias));
            valorDepositado = leitor.nextDouble();
           
            while(dias == 7){
                System.out.println(String.format("Ao final de 7 dias, %s guardou R$%d", 
                        nomeUsuario, valorDepositado)); 
                dias++;
            }
              
            } else {
                System.out.println("Valor inválido :( ");
            }
            dias++;
                
            }

        }
    }

