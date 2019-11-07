package com.mycompany.projeto.listas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hessinho
 */
public class ProgramaOrdenacaoListas {
    public static void main(String[] args) {
        Bairro b1 = new Bairro("Saúde", 22_000);
        Bairro b2 = new Bairro("Pinheiros", 15_000);
        Bairro b3 = new Bairro("Bela Vista", 9_000);
        Bairro b4 = new Bairro("Artur Alvim", 100_000);
        
        List<Bairro> bairros = Arrays.asList(b1,b2,b3,b4);
        
        //Ordenação usando Java 8+
        bairros.sort(Comparator.comparing(bairro -> {
            return bairro.getPopulacao();
        }));
        
        //ordenando pela quantidade de população
        System.out.println("bairros após 1ª ordenação: "+bairros);
        
        //ordenando em ordem alfabética A - Z
        bairros.sort(Comparator.comparing(Bairro::getNome));
        System.out.println("bairros após 2ª ordenação: "+bairros);
        
         //ordenando em ordem alfabética Z - A
        bairros.sort(Comparator.comparing(Bairro::getNome).reversed());
        System.out.println("bairros após 3ª ordenação: "+bairros);
    }
}
