/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplothread;

import java.util.Random;

/**
 *
 * @author CYOT7
 */
public class PrintTarefa implements Runnable {
    private final int sleepTime;
    private final String nomeTarefa;
    private final static Random gerador = new Random();
    
    public PrintTarefa (String nome) {
        nomeTarefa = nome;
        sleepTime = gerador.nextInt(500);
    }
    
    @Override
    public void run() {
        try {
            System.out.println(nomeTarefa + " vai dormir por " + sleepTime + " segundos.");
            Thread.sleep (sleepTime);
        }
        catch (InterruptedException exception) {
            System.out.println(nomeTarefa + " terminou antes do tempo devido a interrupção.");
        }
        
        System.out.println(nomeTarefa + " acordou!");
    }
    
}
