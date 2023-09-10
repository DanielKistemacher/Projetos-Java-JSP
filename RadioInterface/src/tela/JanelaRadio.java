package tela;

import controle.Radio;
import controle.Radio;

/**
 *
 * @author kiste
 */
public class JanelaRadio extends javax.swing.JFrame {
    
    public static Radio ctlRadio;

    /**
     * Creates new form JanelaRadio
     */
    public JanelaRadio() {
        initComponents();
        
        ctlRadio = new Radio(88,0,false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldVolume = new javax.swing.JTextField();
        jTextFieldEstacao = new javax.swing.JTextField();
        jLabelEstacao = new javax.swing.JLabel();
        jLabelVolume = new javax.swing.JLabel();
        botaoLigar = new javax.swing.JButton();
        volumeMais = new javax.swing.JButton();
        estacaoMenos = new javax.swing.JButton();
        estacaoMais = new javax.swing.JButton();
        volumeMenos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldVolume.setEditable(false);
        jTextFieldVolume.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTextFieldVolume.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldEstacao.setEditable(false);
        jTextFieldEstacao.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTextFieldEstacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEstacao.setToolTipText("");

        jLabelEstacao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelEstacao.setText("Estação");

        jLabelVolume.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelVolume.setText("Volume");

        botaoLigar.setText("Ligar");
        botaoLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLigarActionPerformed(evt);
            }
        });

        volumeMais.setText("+");
        volumeMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeMaisActionPerformed(evt);
            }
        });

        estacaoMenos.setText("-");
        estacaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estacaoMenosActionPerformed(evt);
            }
        });

        estacaoMais.setText("+");
        estacaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estacaoMaisActionPerformed(evt);
            }
        });

        volumeMenos.setText("-");
        volumeMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeMenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoLigar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVolume)
                    .addComponent(jLabelEstacao)
                    .addComponent(jTextFieldEstacao, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jTextFieldVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estacaoMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estacaoMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(volumeMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelEstacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEstacao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estacaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estacaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabelVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volumeMais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volumeMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoLigar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLigarActionPerformed
        ctlRadio.ligarDesligar();
        if (ctlRadio.isEstado() == false){
            botaoLigar.setText("Ligar");
            jTextFieldEstacao.setText("");
            jTextFieldVolume.setText("");
            
        } else if (ctlRadio.isEstado() == true){
            botaoLigar.setText("Desligar");
            jTextFieldEstacao.setText("88");
            jTextFieldVolume.setText("0");
        }
    }//GEN-LAST:event_botaoLigarActionPerformed

    private void estacaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estacaoMaisActionPerformed
        ctlRadio.incrementarEstacao();
        jTextFieldEstacao.setText(String.valueOf(ctlRadio.getEstacao()));
    }//GEN-LAST:event_estacaoMaisActionPerformed

    private void volumeMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeMaisActionPerformed
        ctlRadio.incrementarVolume();
        jTextFieldVolume.setText(String.valueOf(ctlRadio.getVolume()));
    }//GEN-LAST:event_volumeMaisActionPerformed

    private void estacaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estacaoMenosActionPerformed
        ctlRadio.decrementarEstacao();
        jTextFieldEstacao.setText(String.valueOf(ctlRadio.getEstacao()));
    }//GEN-LAST:event_estacaoMenosActionPerformed

    private void volumeMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeMenosActionPerformed
        ctlRadio.decrementarVolume();
        jTextFieldVolume.setText(String.valueOf(ctlRadio.getVolume()));
    }//GEN-LAST:event_volumeMenosActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLigar;
    private javax.swing.JButton estacaoMais;
    private javax.swing.JButton estacaoMenos;
    private javax.swing.JLabel jLabelEstacao;
    private javax.swing.JLabel jLabelVolume;
    private javax.swing.JTextField jTextFieldEstacao;
    private javax.swing.JTextField jTextFieldVolume;
    private javax.swing.JButton volumeMais;
    private javax.swing.JButton volumeMenos;
    // End of variables declaration//GEN-END:variables
}