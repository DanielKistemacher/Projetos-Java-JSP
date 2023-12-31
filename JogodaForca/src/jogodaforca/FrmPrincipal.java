package jogodaforca;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author Edson Ahlert
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);        
    }

    ArrayList<String> palavras = new ArrayList();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAdivinhar = new javax.swing.JButton();
        lblSecreto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVidas = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblOpcao = new javax.swing.JLabel();
        lblPalavra = new javax.swing.JLabel();
        tfdPalavra = new javax.swing.JTextField();
        tfdLetra = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Jogo da Forca");

        jLabel2.setText("Informe uma palavra Secreta");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setText("Informe uma letra");

        btnAdivinhar.setText("Adivinhar");
        btnAdivinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinharActionPerformed(evt);
            }
        });

        lblSecreto.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblSecreto.setText("Univates");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("VIDAS");

        lblVidas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblVidas.setForeground(new java.awt.Color(0, 102, 0));
        lblVidas.setText("5");

        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIniciar.setText("Iniciar Jogo");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel5.setText("Palavra escolhida nº: ");

        lblOpcao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOpcao.setText("?");

        lblPalavra.setForeground(new java.awt.Color(255, 0, 0));
        lblPalavra.setText("???");

        tfdPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPalavraActionPerformed(evt);
            }
        });

        tfdLetra.setBackground(new java.awt.Color(255, 255, 153));
        tfdLetra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnAdivinhar)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPalavra))
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblSecreto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVidas)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSalvar)
                    .addComponent(tfdPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblOpcao))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAdivinhar)
                    .addComponent(lblPalavra)
                    .addComponent(tfdLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecreto)
                    .addComponent(jLabel4)
                    .addComponent(lblVidas))
                .addGap(12, 12, 12)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        
        // Verifica se há texto digitado no tfdPalavra
        if (tfdPalavra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Palavra vazia, digite uma Palavra!");
            // Posiciona cursor para próxima inserção
            tfdPalavra.requestFocus();
        } else {
            // Adiciona a nova palavra no ArrayList
            palavras.add(tfdPalavra.getText());
            JOptionPane.showMessageDialog(null, "Palavra nº " + Integer.toString(palavras.size()) + " - " + tfdPalavra.getText() + " - inserida com sucesso!");
            tfdPalavra.setText("");
            tfdPalavra.requestFocus();
        }                
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        
        // Variável p pegar o tamanho do ArrayList
        int p = palavras.size();
        // Vou gerar um número aleatório de 0 até p, lembrando que o últim valor não entra.
        // Exemplo: p = 5, gerar um número aleatório de 0 a 4.
        Random r = new Random();
        // Converter r que é Randon para Int
        int opcao = r.nextInt(p);
        // Apenas neste momento, estou mostrando o id da palavra no ArrayList
        lblOpcao.setText(Integer.toString(opcao + 1));
        // e mostrando a palavra escolhida...
        lblPalavra.setText(palavras.get(opcao).toUpperCase());    
        // >>>>> DEPOIS SERÁ IMPORTANTE OCULTAR AS DUAS OPÇÕES ACIMA.
        
        // Quebrando a palavra escolhida lblPalavra em um vetor de char
        char[] palavra = lblPalavra.getText().toCharArray();
        // String para controlar a palavra secreta
        String secreto = "";
        // Passando por todos os elementos char de 'palavra'
        for(int i = 0; i < palavra.length; i++){        
            // e colocando um '-' no local, para apresentar na tela
            secreto = secreto + "-";
        }
        // Colocando os caracteres '-' na tela, em lblSecreto
        lblSecreto.setText(secreto);
        tfdLetra.requestFocus();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnAdivinharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinharActionPerformed
        // TODO add your handling code here:
        
        // Testa se há texto em ftdLetra
        if (tfdLetra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Letra vazia, digite uma Letra!");
            // Posiciona cursor para próxima inserção
            tfdLetra.requestFocus();
        } else {
            // Repete o processo de quebrar em char o conteúdo de lblPalavra
            char[] palavra = lblPalavra.getText().toUpperCase().toCharArray();
            // secreto receberá o valor de lblSecreto, que agora está como ----------...
            String secreto = lblSecreto.getText();
            
            // Essa classe permite criar e manipular dados de Strings dinamicamente, 
            // ou seja, podem criar variáveis de String modificáveis.
            // Deixo 'adivinha' com o mesmo conteúdo de 'secreto', ou seja, ---------
            StringBuilder adivinha = new StringBuilder(secreto);            
        
            // 'letra' recebe a primeira letra digitada em tfdLetra
            char letra = tfdLetra.getText().toUpperCase().charAt(0);
            
            boolean achou = false;
            // Vou passar por todas as letras da palavra
            for(int i = 0; i < palavra.length; i++){
                // e ver se vai achar a letra digitada dentro da palavra
                if (palavra[i] == letra ) {
                    // se achar, escrevo esta letra em adivinha, na posição
                    adivinha.setCharAt(i, letra);
                    JOptionPane.showMessageDialog(null, "ACERTOU");
                    // Mostro em lblSecreto a letra localizada
                    lblSecreto.setText(adivinha.toString());  
                    // achou recebe true
                    achou = true;                    
                }
            }
            
            // vidas recebe o valor de lblVidas
            int vidas = Integer.parseInt(lblVidas.getText());            
            // Se achou estiver false, significa que a letra digitada não foi localizada
            if (achou == false) {
                // Decremento vidas
                vidas--;
                // Passo o novo valor de vidas para lblVidas
                lblVidas.setText(Integer.toString(vidas));
                JOptionPane.showMessageDialog(null, "ERROU");                
            }
                   
            // Verificar se o jogador acertou a palavra por completo
            if (lblPalavra.getText().equals(lblSecreto.getText())) {
                JOptionPane.showMessageDialog(null, "Parabéns, você adivinhou a palavra!");  
                lblPalavra.setText("");
                lblSecreto.setText("Univates");
                lblVidas.setText("");
                lblOpcao.setText("");
            }
            
            // Verificar se vidas chegou em 0
            if (vidas == 0) {
                JOptionPane.showMessageDialog(null, "GAME OVER!!!");  
                lblPalavra.setText("");
                lblSecreto.setText("Univates");                
                lblVidas.setText("");
                lblOpcao.setText("");  
                JOptionPane.showMessageDialog(null, "Vamos jogar novamente?");                  
            }       
        tfdLetra.setText("");
        tfdLetra.requestFocus();
        }
    }//GEN-LAST:event_btnAdivinharActionPerformed

    private void tfdPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdPalavraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinhar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblOpcao;
    private javax.swing.JLabel lblPalavra;
    private javax.swing.JLabel lblSecreto;
    private javax.swing.JLabel lblVidas;
    private javax.swing.JTextField tfdLetra;
    private javax.swing.JTextField tfdPalavra;
    // End of variables declaration//GEN-END:variables
}
