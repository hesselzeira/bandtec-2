package com.mycompany.bolsakids;

public class BolsaKidsCalculadora {
    Double calcular(Integer qtdFilhos0a2, Integer qtdFilhos3a7, Integer qtdFilhos8a16){
       
       Double valorQtdFilhos0a2 = 15.5;
       Double valorQtdFilhos3a7 = 10.0;
       Double valorQtdFilhos8a16 = 5.5;
       
       Double resultado = (qtdFilhos0a2 * valorQtdFilhos0a2) +
                            (qtdFilhos3a7 * valorQtdFilhos3a7) +
                              (qtdFilhos8a16 * valorQtdFilhos8a16);
       
       return resultado;
    }
}
