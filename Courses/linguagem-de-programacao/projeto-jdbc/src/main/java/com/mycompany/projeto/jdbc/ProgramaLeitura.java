package com.mycompany.projeto.jdbc;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProgramaLeitura {

    public static void main(String[] args) {
        DadosConexao dadosConexao = new DadosConexao();

        JdbcTemplate jdbcTemplate
                = new JdbcTemplate(dadosConexao.getDataSource());

        List lista = jdbcTemplate.queryForList(
                "select * from leitura");

        System.out.println("Consulta " + lista);

        List listaCpu = jdbcTemplate.queryForList(
                "select * from leitura WHERE origem = ?", "CPU");

        System.out.println("Consulta CPU: " + listaCpu);

        List listaCpuAlta = jdbcTemplate.queryForList(
                "select * from leitura WHERE "
                + " origem = ? and valor > ?", "CPU", 80);

        System.out.println("Consulta CPU alta: " + listaCpuAlta);

        List listaCpuPassado = jdbcTemplate.queryForList(
                "select * from leitura WHERE "
                + " origem = ? and valor < ?", "CPU", LocalDateTime.now());

        System.out.println("Consulta CPU passado: " + listaCpuPassado);

        // INSERTS 
        jdbcTemplate.update(
                "insert into leitura (origem, valor, data_hora) "
                + " values (?,?,?)",
                "Rede", 33.5, LocalDateTime.now());

        // UPTADE
        jdbcTemplate.update(
                "update leitura set valor = ? where origem = ?",
                50, "Disco");
        // faa um select no workbench p/ confirmar

        // DELETE
        jdbcTemplate.update(
                "delete from leitura where valor <== ? ", 80);

        //exercicio
        jdbcTemplate.update(
                "insert into leitura  (origem, valor, data_hora) "
                + " values (?,?,?)",
                "CPU", 55, LocalDateTime.now());
        //===================================================

        Random sorteador = new Random();

        for (int r = 0; r < 3; r++) {
            int valor = sorteador.nextInt(101);

            String sql = "insert into leitura "
                    + "(origem, valor, data_hora) "
                    + "value (?,?,?)";

            jdbcTemplate.update(
                    sql, "CPU", valor, LocalDateTime.now()
            );
        }
    }
}
