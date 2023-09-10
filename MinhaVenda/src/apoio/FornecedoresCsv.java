package apoio;

import dao.FornecedorDAO;
import entidade.Fornecedor;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class FornecedoresCsv {
    public static void gerarCsv()
    {
        try {
            exportarParaCsv();
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    
    private static void exportarParaCsv() throws Exception {
        List<Fornecedor> fornecedores = new FornecedorDAO().consultarTodos();
        
        File file = new File( "Fornecedores_Exportados.csv" );
        file.createNewFile();
        
        Writer writer = new FileWriter( file );
        
        for ( Fornecedor fornecedor : fornecedores )
        {
            String linha = fornecedor.getId() + ";" + 
                           fornecedor.getNome() + ";" + 
                           fornecedor.getEmail() + ";" + 
                           fornecedor.getTelefone() + ";" + 
                           fornecedor.getCnpj() + "\n";
            writer.write( linha );
        }
        
        writer.close();
    }
}