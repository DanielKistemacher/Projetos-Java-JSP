package apoio;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public interface IDAOT <T> {

    public String insert(T objeto);

    public String update(T objeto);

    public String delete(int id);

    public ArrayList<T> consultarTodos();

    public ArrayList<T> consultar(String informacao);

    public T consultarId(int id);
    
    public boolean validarCampos(T objeto);
}