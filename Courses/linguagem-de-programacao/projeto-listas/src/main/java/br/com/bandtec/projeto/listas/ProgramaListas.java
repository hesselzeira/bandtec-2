package br.com.bandtec.projeto.listas;

import java.util.ArrayList;
import java.util.List;

public class ProgramaListas {
    
    public static void main(String[] args) {
        // uma lista (List) no Java é como um vetor
        // porém, é dinâmico (cresce e diminui)
        
        // criando uma lista vazia
        List listaLoka = new ArrayList();
        
        // adicionando um elemento por vez à lista
        listaLoka.add("olá");
        listaLoka.add(99);
        listaLoka.add(15.73);
        listaLoka.add(false);
        
        System.out.println("listaLoka: "+listaLoka);
        
        // quantos elementos existem na lista?
        System.out.println(
           "Quantos na listaLoka? "+listaLoka.size());
        
        // a lista está vazia?
        System.out.println(
            "listaLoka vazia? "+listaLoka.isEmpty());
        
        // obtendo um determinado elemento da lista
        System.out.println(
          "2ª elemento de listaLoka: "+listaLoka.get(1));
        
        System.out.println(
          "4ª elemento de listaLoka: "+listaLoka.get(3));
    
        System.out.println(
          "1ª elemento de listaLoka: "+listaLoka.get(0));
        
        // removendo um elemento da lista
        
        // forma 1: removendo por índice (ou posição)
        listaLoka.remove(1);
        System.out.println(
          "Após remover o 1 "+listaLoka);
        
        // forma 2: removendo por valor
        listaLoka.remove("paixão");
        System.out.println(
          "Removeu 'paixão'? "+listaLoka);
        
        // forma 2: removendo por valor
        listaLoka.remove("olá");
        System.out.println(
          "Removeu 'olá'? "+listaLoka);
        
        listaLoka.add("abc");
        listaLoka.add("abc");
        System.out.println(listaLoka);
        
        // forma 2: removendo por valor
        // só remove o primeiro encontrado
        listaLoka.remove("abc");
        System.out.println(
          "Removeu 'abc'? "+listaLoka);
        
        // encontrando um elemento na lista
        System.out.println(
         "Onde está a pêra? "+listaLoka.indexOf("pêra"));
        // o indexOf retorna -1 caso o valor
        // NÃO exista na lista
        
        System.out.println(
         "Onde está o abc? "+listaLoka.indexOf("abc"));
        // o indexOf retorna o 1º índice (ou posição)
        // onde encontrou o valor
        
        // inserindo uma lista na outra
        List lista2 = new ArrayList();
        lista2.add("feijão");
        lista2.add(888);
        lista2.add(77.22);
        
        // inserindo outra lista com addAll()
        listaLoka.addAll(lista2);
        System.out.println(
          "listaLoka + lista2 -> "+listaLoka);
        
        
        // apagando a lista (remover todos)
        listaLoka.clear();
        System.out.println(
          "listaLoka depois do clear() "+listaLoka);
        
    }
}
