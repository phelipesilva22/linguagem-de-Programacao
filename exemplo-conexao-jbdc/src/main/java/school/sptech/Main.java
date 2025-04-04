package school.sptech;

import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- CONEXÃO BANCO H2 -----------");
        Conexao conexao = new Conexao();
        JdbcTemplate Template = new JdbcTemplate(conexao.getConexao());

        Template.execute("DROP TABLE TIMES IF EXISTS");

        Template.execute("CREATE TABLE TIMES ( " +
                "id int primary key auto_increment," +
                "nome varchar(50)." +
                "data_fundacao DATE," +
                "maior_do_brasil bit");

    }
}