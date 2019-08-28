package larissa.hessel.c1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        System.out.println("Qual é seu salário bruto?");
        
        Scanner leitor = new Scanner(System.in);
        Double salarioUsuario = leitor.nextDouble();
        Double descontoINSS = 0.0;
        
        if(salarioUsuario <= 3000){
            descontoINSS = salarioUsuario * 0.10;
//            System.out.println(String.format("%.2f", descontoINSS));
        }else{
            descontoINSS = salarioUsuario * 0.20;
        }
        
        Double descontoIR = 0.0;
        
        if(salarioUsuario <= 2000){
            descontoIR = 0.0;
            
        }else if (salarioUsuario >5000){
            descontoIR = salarioUsuario * 0.20;
        }else{
            descontoIR = 0.15;
        }
        
        System.out.println("Qual é o valor do seu Vale Alimentação (VA)");
        Double vaUsuario = leitor.nextDouble();
         
        System.out.println("Qual é o valor do seu Vale Refeição (VR) POR DIA?");
        Double vrUsuario = leitor.nextDouble() * 22;
        
//        System.out.println(String.format("%.1f", vrUsuario));
        Double salarioLiquido = (descontoINSS - descontoIR) + vaUsuario + vrUsuario;
        
        System.out.println(String.format("Seu salário bruto é de R$ %.2f. Seu salário"
                + " líquido será de R$ %.1f.", salarioUsuario, salarioLiquido));
       
    }
}
