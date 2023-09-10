package apoio;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Daniel
 */
public class ConexaoBD {

    private static ConexaoBD instancia = null;
    private Connection conexao = null;

    public ConexaoBD() {
        try {
            // Buscar parâmetros do banco de dados
            //Properties prop = new Properties();            
            //prop.load(new FileInputStream("db.properties"));
            
            String dbdriver = "com.mysql.cj.jdbc.Driver"; //prop.getProperty("db.driver");
            String dburl = "jdbc:mysql://localhost:3306/curriculoWeb"; //prop.getProperty("db.url");
            String dbuser = "root"; //prop.getProperty("db.user");
            String dbsenha = "280519";//prop.getProperty("db.senha");

            // Carregar Driver do Banco de Dados
            Class.forName(dbdriver);

            if (dbuser.length() != 0)
            {
                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
            } else
            {
                conexao = DriverManager.getConnection(dburl);
            }

        } catch (Exception e) {
            System.out.println("Erro ao conectar com o banco de dados. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Retorna instância
    public static ConexaoBD getInstance() {
        if (instancia == null) {
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    // Retorna conexão
    public Connection getConnection() {
        if (conexao == null) {
            throw new RuntimeException("conexao==null");
        }
        return conexao;
    }

    // Efetua fechamento da conexão
    public void shutDown() {
        try {
            conexao.close();
            instancia = null;
            conexao = null;
        } catch (Exception e) {
            System.out.println("Erro ao fechar a conexão com o banco de dados. Verifique o log.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}