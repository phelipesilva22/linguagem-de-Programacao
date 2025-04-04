package school.sptech;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate template;
    private BasicDataSource conexao;

    public Conexao() {
        BasicDataSource driver = new BasicDataSource();
        driver.setUsername("sa");
        driver.setPassword("");
        driver.setUrl("jbdc:h2:file:./banco-de-dados");
        this.conexao = driver;
        this.template = new JdbcTemplate(driver);
    }

    public BasicDataSource getConexao() {
        return conexao;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }
}
