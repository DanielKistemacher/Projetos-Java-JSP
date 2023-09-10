package apoio;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Prompts {
    public static void promptErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void promptInfo(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void promptAlerta(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Alerta", JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean promptConfirmar(String mensagem) {
        int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcao == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
}