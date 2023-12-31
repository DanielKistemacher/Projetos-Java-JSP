package telas;

import apoio.Formatacao;
import apoio.Prompts;
import dao.CurriculoDAO;
import entidade.Curriculo;

/**
 *
 * @author Daniel
 */
public class TelaCurriculo extends javax.swing.JFrame {

    int idCurriculo = 0;
    
    public TelaCurriculo() {
        initComponents();
        new CurriculoDAO().preencherTabela(jTableCurriculos, "");
        Formatacao.formatarTelefone(jFormattedTextFieldTelefone);
        
        jFormattedTextFieldData.setText(Formatacao.getDataAtual());
        jFormattedTextFieldData.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneCurriculo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurriculos = new javax.swing.JTable();
        jButtonSairListagem = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizarLista = new javax.swing.JButton();
        jButtonInativar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelData = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEscolaridade = new javax.swing.JLabel();
        jLabelExpProfi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaExpProfi = new javax.swing.JTextArea();
        jLabelExpProfi1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaOutros = new javax.swing.JTextArea();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSairManut = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jTextFieldEscolaridade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currículo");

        jTableCurriculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCurriculos);

        jButtonSairListagem.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSairListagem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSairListagem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSairListagem.setText("Sair");
        jButtonSairListagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSairListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairListagemActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(255, 0, 0));
        jButtonExcluir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizarLista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAtualizarLista.setText("Atualizar lista");
        jButtonAtualizarLista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaActionPerformed(evt);
            }
        });

        jButtonInativar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonInativar.setText("Inativar");
        jButtonInativar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInativarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInativar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSairListagem)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonAtualizarLista)
                        .addComponent(jButtonInativar))
                    .addComponent(jButtonSairListagem))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPaneCurriculo.addTab("Listagem", jPanel1);

        jLabelData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelData.setText("Data");

        jLabelNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jLabelTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        jLabelEscolaridade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEscolaridade.setText("Escolaridade:");

        jLabelExpProfi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelExpProfi.setText("Experiências Profissionais:");

        jTextAreaExpProfi.setColumns(20);
        jTextAreaExpProfi.setRows(5);
        jScrollPane2.setViewportView(jTextAreaExpProfi);

        jLabelExpProfi1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelExpProfi1.setText("Outros:");

        jTextAreaOutros.setColumns(20);
        jTextAreaOutros.setRows(5);
        jScrollPane3.setViewportView(jTextAreaOutros);

        jButtonSalvar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSalvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonSairManut.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSairManut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSairManut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSairManut.setText("Sair");
        jButtonSairManut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSairManut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairManutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSairManut))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelExpProfi)
                            .addComponent(jLabelExpProfi1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelEscolaridade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEscolaridade)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefone)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEscolaridade))
                    .addComponent(jTextFieldEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelExpProfi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelExpProfi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonSairManut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneCurriculo.addTab("Cadastro", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCurriculo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneCurriculo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Curriculo curriculo = new Curriculo();
        
        curriculo.setId(idCurriculo);
        curriculo.setData_hora_cadastro(jFormattedTextFieldData.getText());
        curriculo.setNome(jTextFieldNome.getText());
        curriculo.setEmail(jTextFieldEmail.getText());
        curriculo.setTelefone(jFormattedTextFieldTelefone.getText());
        curriculo.setEscolaridade(jTextFieldEscolaridade.getText());
        curriculo.setExp_profissionais(jTextAreaExpProfi.getText());
        curriculo.setOutros(jTextAreaOutros.getText());
        curriculo.setSituacao('1');
        
        CurriculoDAO curriculoDAO = new CurriculoDAO();
        
        if (curriculoDAO.validarCampos(curriculo)) {
            if (idCurriculo == 0) {                   // ID ser zero significa que é insert
                curriculoDAO.insert(curriculo);
            } else {
                curriculoDAO.update(curriculo);
            }
        }
       
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jFormattedTextFieldTelefone.setText("");
        jTextFieldEscolaridade.setText("");
        jTextAreaExpProfi.setText("");
        jTextAreaOutros.setText("");
        
        idCurriculo = 0;
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaActionPerformed
        new CurriculoDAO().preencherTabela(jTableCurriculos, "");
    }//GEN-LAST:event_jButtonAtualizarListaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (jTableCurriculos.getSelectedRow() == -1) {
            Prompts.promptAlerta("Selecione um currículo da tabela.");
        } else {
            String idTabela = String.valueOf(jTableCurriculos.getValueAt(jTableCurriculos.getSelectedRow(), 0));

            idCurriculo = Integer.parseInt(idTabela);

            Curriculo curriculo = new CurriculoDAO().consultarId(idCurriculo);

            if (curriculo != null) {
            jTabbedPaneCurriculo.setSelectedIndex(1);

            jTextFieldNome.setText(curriculo.getNome());
            jTextFieldEmail.setText(curriculo.getEmail());
            jFormattedTextFieldTelefone.setText(curriculo.getTelefone());
            jTextFieldEscolaridade.setText(curriculo.getEscolaridade());
            jTextAreaExpProfi.setText(curriculo.getExp_profissionais());
            jTextAreaOutros.setText(curriculo.getOutros());

            jTextFieldNome.requestFocus();
            } else {
                Prompts.promptErro("Não foi possível localizar o ID do currículo.");
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (jTableCurriculos.getSelectedRow() == -1) {
            Prompts.promptAlerta("Selecione um currículo da tabela.");
        } else {
        
            String idTabela = String.valueOf(jTableCurriculos.getValueAt(jTableCurriculos.getSelectedRow(), 0));

            idCurriculo = Integer.parseInt(idTabela);
            
            CurriculoDAO curriculoDAO = new CurriculoDAO();
            Curriculo curriculo = new CurriculoDAO().consultarId(idCurriculo);

            boolean opcao = Prompts.promptConfirmar("Tem certeza que deseja excluir o currículo do(a): " + curriculo.getNome() + " ?");
            if (opcao == true) {
                curriculoDAO.delete(curriculo.getId());
            }
        }
        idCurriculo = 0;
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairListagemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairListagemActionPerformed

    private void jButtonSairManutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairManutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairManutActionPerformed

    private void jButtonInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInativarActionPerformed
        if (jTableCurriculos.getSelectedRow() == -1) {
            Prompts.promptAlerta("Selecione um currículo da tabela.");
        } else {
            String idTabela = String.valueOf(jTableCurriculos.getValueAt(jTableCurriculos.getSelectedRow(), 0));

            idCurriculo = Integer.parseInt(idTabela);
            
            Curriculo curriculo = new CurriculoDAO().consultarId(idCurriculo);
            
            curriculo.setId(idCurriculo);
            curriculo.setData_hora_cadastro(curriculo.getData_hora_cadastro());
            curriculo.setNome(curriculo.getNome());
            curriculo.setEmail(curriculo.getEmail());
            curriculo.setTelefone(curriculo.getTelefone());
            curriculo.setEscolaridade(curriculo.getEscolaridade());
            curriculo.setExp_profissionais(curriculo.getExp_profissionais());
            curriculo.setOutros(curriculo.getOutros());
            curriculo.setSituacao('0');
        
            CurriculoDAO curriculoDAO = new CurriculoDAO();
        
            curriculoDAO.update(curriculo);
        }    
    }//GEN-LAST:event_jButtonInativarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCurriculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCurriculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarLista;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInativar;
    private javax.swing.JButton jButtonSairListagem;
    private javax.swing.JButton jButtonSairManut;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEscolaridade;
    private javax.swing.JLabel jLabelExpProfi;
    private javax.swing.JLabel jLabelExpProfi1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneCurriculo;
    private javax.swing.JTable jTableCurriculos;
    private javax.swing.JTextArea jTextAreaExpProfi;
    private javax.swing.JTextArea jTextAreaOutros;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEscolaridade;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
