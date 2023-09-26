package apoio;

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
            Properties prop = new Properties();            
            //prop.load(new FileInputStream("db.properties"));
            prop.load(getClass().getClassLoader().getResourceAsStream("apoio/db.properties"));
            
            String dbdriver = prop.getProperty("db.driver");
            String dburl = prop.getProperty("db.url");
            String dbuser = prop.getProperty("db.user");
            String dbsenha = prop.getProperty("db.senha");

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