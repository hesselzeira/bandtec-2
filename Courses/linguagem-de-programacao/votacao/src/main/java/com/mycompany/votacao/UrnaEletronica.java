package com.mycompany.votacao;

public class UrnaEletronica {

    private Integer votosMaria = 0;
    private Integer votosZe = 0;
    

    public void votarMaria() {

        if (votosMaria + votosZe < 10) {
            votosMaria++;
        }

    }

    public void votarZe() {

        if (votosMaria + votosZe < 10) {
            votosZe++;
        }
    }

    public String getVencedor() {
        if(getTotalVotos == 10 ){
        if (votosMaria == votosZe) {
            return "empate";

        } else if (votosMaria < votosZe) {
            return "Maria venceu!";
        } else{
            return "Zé venceu!";
        }
    }
    }
    public Integer getTotalVotos() {
        return votosMaria+votosZe;
    }
    
    

}
