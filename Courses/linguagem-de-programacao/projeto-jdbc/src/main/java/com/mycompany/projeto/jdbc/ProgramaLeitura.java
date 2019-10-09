package com.mycompany.projeto.jdbc;

import java.util.List;
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
                + " origem = ? and valor > ?", "CPU", 99);

        System.out.println("Consulta CPU: " + listaCpuAlta);

    }
}
