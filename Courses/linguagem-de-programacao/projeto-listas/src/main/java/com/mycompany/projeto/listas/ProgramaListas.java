package com.mycompany.projeto.listas;

import java.util.ArrayList;
import java.util.List;

public class ProgramaListas {

    public static void main(String[] args) {
        // uma lista (list) no Java é como um vetor porém, é dinâmico (cresce 
        // e diminui)

        //JAVA.UTIL NO CTRL + SPACE
        // criando uma lista vazia
        List listaLoka = new ArrayList();

        // adicionando um elemento por vez à lista
        listaLoka.add("olá");
        listaLoka.add(99);
        listaLoka.add(15.73);
        listaLoka.add(false);

        System.out.println("lista loka: " + listaLoka);

        // saber quantos elementos existem na lista?
        System.out.println("quantos na lista? " + listaLoka.size());

        // a lista está vazia? 
        System.out.println("listaLoka vazia? " + listaLoka.isEmpty());

        //obtendo determinado elemento da lista
        System.out.println("2ª elemento de listaLoka: " + listaLoka.get(1));

        System.out.println("4ª elemento de listaLoka: " + listaLoka.get(3));

        System.out.println("1ª elemento de listaLoka: " + listaLoka.get(0));

        //removendo um elemento da lista
        
        //forma 1: removendo por indice (ou posiçãa)
        listaLoka.remove(1);
        System.out.println("Após remover o 1 " + listaLoka);

        
        //forma 2: remove o valor
        listaLoka.remove("paixão");
        System.out.println("Remover 'paixão'?" + listaLoka);

        listaLoka.remove("olá");
        System.out.println("Remover 'olá'?" + listaLoka);

        
        //remove o primeiro valor
        listaLoka.add("abc");
        listaLoka.add("abc");
        System.out.println(listaLoka);
        
        listaLoka.remove("abc");
        System.out.println("Removeu 'abc'" +listaLoka);
        
        // encontrando um elemento na lista
        System.out.println("Onde está a pêra? "+listaLoka.indexOf("pêra"));
        //o indexOf retorna -1 caso o valor NÂO exista na lista
        
        System.out.println("Onde está o abc? "+listaLoka.indexOf("abc"));
        //indexOf retorna o 1º indice (ou posição)
        //onde ele encontrou o valor

        //inserindo uma lista na outra
        List lista2 = new ArrayList();
        lista2.add("feijão");
        lista2.add(888);
        lista2.add(77.22);
        
        //junta as listas mesmo
        //inserindo outra lista lista com addAll();
        listaLoka.addAll(lista2);
        System.out.println("listaLoka + lista2 -> "+listaLoka);
        
        //apagando a lista (remover todos)
        listaLoka.clear();
        System.out.println("listaLoka depois do clear() "+listaLoka);
        
        
        
    }
}
