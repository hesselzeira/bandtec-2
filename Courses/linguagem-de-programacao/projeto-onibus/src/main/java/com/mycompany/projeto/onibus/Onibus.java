package com.mycompany.projeto.onibus;

import java.util.HashSet;
import java.util.Set;

public class Onibus {

    private Integer passageiros;
    private Integer limite;
    private String ultimaAcao;

    //construtor
    public Onibus() {
        passageiros = 0;
    }

    public void receber(Integer quantidade) {
        //se o limite for diferente de nulo
        //..........
        if (quantidade > 0 && this.limite != null) {

            Integer entraramMesmo;

            //para garantir se a estiver respeitando a quantidade 
            if (quantidade + this.passageiros <= limite) {
                entraramMesmo = quantidade;
            } else {
                entraramMesmo = this.limite - this.passageiros;
            }
            this.passageiros += entraramMesmo;
            this.ultimaAcao = String.format(
                    "Entratam %d passageiros", entraramMesmo);
        }
    }

    //método com o mesmo nome ("receber")
    //aqui fizemos uma SOBRECARGA de método
    //ou: nós SOBRECARREGAMOS o método receber()
    public void receber(Integer quantidade, Boolean separa) {
        if (separa) {
            receber(quantidade);
        } else {
            if (quantidade + this.passageiros <= limite) {
                receber(quantidade);
            }
        }
    }

    public void sair(Integer quantidade, Boolean deixarSozinho) {

        if (deixarSozinho) {
            sair(quantidade);

        } else {
            if (this.passageiros - quantidade >= 1) {
                sair(quantidade);
            }
        }
    }

    public void sair(Integer quantidade) {
        if (quantidade > 0) {
            Integer sairamMesmo;

            if (this.passageiros - quantidade >= 0) {
                sairamMesmo = quantidade;
            } else {
                sairamMesmo = this.passageiros;
            }

            this.passageiros -= sairamMesmo;

            this.ultimaAcao = String.format(
                    "Saíram %d passageiros", sairamMesmo);
        }

    }

    public Integer getPassageiros() {
        return passageiros;
    }

    public String getUltimaAcao() {
        return ultimaAcao;
    }

    public void setLimite(Integer limite) {
        if (limite > 0) {
            this.limite = limite;
        }
    }
}
