package com.mycompany.mavenproject1;

public class RepeticoesFor {

    public static void main(String[] args) {
//        for(Integer contador=0; contador<5; contador++){
//            System.out.println("Contando..."+contador);
//        }
//        
//        /*
//        Usando for, exiba os números impares entre 0 e 90
//        */
//  
//        for(Integer contador=1; contador<=90; contador+=2){
//            System.out.println("Contando..."+contador);
//        }
//     
        /*
        Usando for, comece exibindo o valor 0.15 e depois 0.30, depois 0.45, depois
        0.60... ou seja, aumente de 0.15 em 0.15 a cada iteração
        até que o último número seja menor que 5
        Use interpolação p/ exibir o número com duas casas decimais
         */

//        Double valor = 0.0;
//        
//        for(valor = 0.0; valor <=5.0; valor+=0.15){
//            System.out.println(String.format("Exibindo %.2f", valor));
//        };
        /*
        Quando comprarmos um carro "parcelado", pagarmos muito mais que o valor
        do carro. Você faz idéia de quanto? 
        
        Imagine que um carro de R$40.000 comprado em 60x com uma taxa de juros
        de 1,40% ao mês
        
        Usando for, começe exibindo 40.000/60, que é a primeira parcela 
        depois, cada parcela aumenta o valor em 1,40% exibindo as 60 parcelas.
        
        Exiba sempre com 2 casas decimais.
        
        Ao final das 60 parcelas, exiba quando foi o valor pago pelo carro 
         */
//        Integer parcelas = 0;
//        Double taxajuros = 1.014;
//        Double total = 0.0;
//
//        Double valorParcela = 666.67;
//        for (parcelas = 1; parcelas <= 60; parcelas++) {
//            System.out.println(String.format("%dª Parcela: %.2f", parcelas, valorParcela));
//            Double juros = (valorParcela * taxajuros) / 100;
//            valorParcela += juros;
//
//            total += valorParcela;
//        }
//        System.out.println("total: " + total);

          Double valorAvista = 40000.0;
          Double parcela = valorAvista/60;
          Double total = 0.0;
          
          for(Integer mes=1; mes<=60; mes++) {
              System.out.println(String.format("%dº parcela: %.2f", mes, parcela));
              
              total += parcela;
              parcela*= 1.014;
          }
          
          System.out.println(String.format("Total: %.2f",total));
    }
}
