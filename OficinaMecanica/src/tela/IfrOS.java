/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import apoio.Formatacao;
import apoio.IItemPesquisa;
import dao.OSDAO;
import dao.OSItemDAO;
import entidade.OS;
import entidade.OSItem;
import javax.swing.JOptionPane;

/**
 *
 * @author pretto
 */
public class IfrOS extends javax.swing.JInternalFrame implements IItemPesquisa {

    int idOS = 0;
    double total = 0.0;

    /**
     * Creates new form IfrOS
     */
    public IfrOS() {
        initComponents();

        // setup
        tffDataOS.setText(Formatacao.getDataAtual());

        tfdIdPessoa.setEditable(false);
        tfdNomePessoa.setEditable(false);
        tfdTotal.setEditable(false);

        tfdIdItem.setEditable(false);
        tfdItem.setEditable(false);
        tfdValor.setEditable(false);

        btnLocalizarItem.setEnabled(false);
        btnRemover.setEnabled(false);
        btnInserir.setEnabled(false);

        Formatacao.formatarData(tffDataInicio);
        Formatacao.formatarData(tffDataFim);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOS = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tffDataInicio = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        tffDataFim = new javax.swing.JFormattedTextField();
        btnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfdTotal = new javax.swing.JTextField();
        tfdItem = new javax.swing.JTextField();
        btnLocalizarItem = new javax.swing.JButton();
        tfdValor = new javax.swing.JTextField();
        tfdIdItem = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tffDataOS = new javax.swing.JFormattedTextField();
        tfdNomePessoa = new javax.swing.JTextField();
        tfdIdPessoa = new javax.swing.JTextField();
        btnLocalizarPessoa = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfdQtde = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemOS = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Ordem de Serviço");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tblOS.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblOS);

        jLabel6.setText("Data início");

        jLabel7.setText("Data fim");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tffDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addComponent(tffDataFim))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tffDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tffDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnEditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listagem", jPanel1);

        tfdTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnLocalizarItem.setText("Localizar");
        btnLocalizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarItemActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade");

        jLabel1.setText("Data");

        jLabel2.setText("Cliente");

        tffDataOS.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnLocalizarPessoa.setText("Localizar");
        btnLocalizarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarPessoaActionPerformed(evt);
            }
        });

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        jLabel3.setText("Item");

        tblItemOS.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblItemOS);

        jLabel5.setText("TOTAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tffDataOS)
                            .addComponent(tfdIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(tfdNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLocalizarPessoa))
                    .addComponent(btnCriar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdQtde)
                                    .addComponent(tfdIdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLocalizarItem))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tffDataOS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarPessoa))
                .addGap(26, 26, 26)
                .addComponent(btnCriar)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarItem)
                    .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnRemover)
                    .addComponent(jLabel4)
                    .addComponent(tfdQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manutenção", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFechar)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLocalizarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarPessoaActionPerformed
        new DlgLocalizar(null, true, this, "pessoa").setVisible(true);
    }//GEN-LAST:event_btnLocalizarPessoaActionPerformed

    private void btnLocalizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarItemActionPerformed
        new DlgLocalizar(null, true, this, "item").setVisible(true);
    }//GEN-LAST:event_btnLocalizarItemActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        OS os = new OS();

        os.setData(tffDataOS.getText());
        os.setPessoa_id(Integer.parseInt(tfdIdPessoa.getText()));
        os.setSituacao('a');

        String retorno = new OSDAO().salvar(os);

        System.out.println("Id Os retorno: " + retorno);

        if (!retorno.contains("ERROR")) {
            idOS = Integer.parseInt(retorno);

            btnCriar.setEnabled(false);
            btnLocalizarPessoa.setEnabled(false);
            btnLocalizarItem.setEnabled(true);
            btnRemover.setEnabled(true);
            btnInserir.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao criar OS: " + retorno);
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        OSItem osItem = new OSItem();

        osItem.setOsId(idOS);
        osItem.setItemId(Integer.parseInt(tfdIdItem.getText()));
        osItem.setQtde(Double.parseDouble(tfdQtde.getText()));
        osItem.setValor(Double.parseDouble(tfdValor.getText()));

        if (new OSItemDAO().salvar(osItem) == null) {
            JOptionPane.showMessageDialog(null, "Item inserido.");

            new OSItemDAO().popularTabela(tblItemOS, "", idOS);

            total += (osItem.getValor() * osItem.getQtde());

            tfdTotal.setText(Formatacao.formatarDecimal(total));

            tfdIdItem.setText("");
            tfdItem.setText("");
            tfdValor.setText("");
            tfdQtde.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Erro na inserção.");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tblItemOS.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro.");
        } else {
            int idOSIt = Integer.parseInt(String.valueOf(tblItemOS.getValueAt(tblItemOS.getSelectedRow(), 0)));

            System.out.println("OSIt: " + idOSIt);

            String retorno = new OSItemDAO().excluir(idOSIt);

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro remvodio.");

                double qtde = Double.parseDouble(String.valueOf(tblItemOS.getValueAt(tblItemOS.getSelectedRow(), 3)));
                double valor = Double.parseDouble(String.valueOf(tblItemOS.getValueAt(tblItemOS.getSelectedRow(), 4)));

                total -= (qtde * valor);

                tfdTotal.setText(Formatacao.formatarDecimal(total));

                new OSItemDAO().popularTabela(tblItemOS, "", idOS);
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Problemas ao remover registro.\n\n" + retorno);
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new OSDAO().popularTabela(tblOS, tffDataInicio.getText(), tffDataFim.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblOS.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro.");
        } else {
            idOS = Integer.parseInt(String.valueOf(tblOS.getValueAt(tblOS.getSelectedRow(), 0)));

            System.out.println("OSIt: " + idOS);

            jTabbedPane1.setSelectedIndex(1);

            tffDataOS.setText(String.valueOf(tblOS.getValueAt(tblOS.getSelectedRow(), 1)));
            tfdIdPessoa.setText(String.valueOf(tblOS.getValueAt(tblOS.getSelectedRow(), 2)));
            tfdNomePessoa.setText(String.valueOf(tblOS.getValueAt(tblOS.getSelectedRow(), 3)));
            tfdTotal.setText(String.valueOf(tblOS.getValueAt(tblOS.getSelectedRow(), 4)));

            total = Double.parseDouble(String.valueOf(tblOS.getValueAt(tblOS.getSelectedRow(), 4)));
            
            new OSItemDAO().popularTabela(tblItemOS, "", idOS);

            btnCriar.setEnabled(false);
            btnLocalizarPessoa.setEnabled(false);
            btnLocalizarItem.setEnabled(true);
            btnRemover.setEnabled(true);
            btnInserir.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    @Override
    public void definirValor(String[] valores, String itemPesquisa) {
        if (itemPesquisa.equalsIgnoreCase("pessoa")) {
            tfdIdPessoa.setText(valores[0]);
            tfdNomePessoa.setText(valores[1]);
        } else if (itemPesquisa.equalsIgnoreCase("item")) {
            tfdIdItem.setText(valores[0]);
            tfdItem.setText(valores[1]);
            tfdValor.setText(valores[2]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLocalizarItem;
    private javax.swing.JButton btnLocalizarPessoa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblItemOS;
    private javax.swing.JTable tblOS;
    private javax.swing.JTextField tfdIdItem;
    private javax.swing.JTextField tfdIdPessoa;
    private javax.swing.JTextField tfdItem;
    private javax.swing.JTextField tfdNomePessoa;
    private javax.swing.JTextField tfdQtde;
    private javax.swing.JTextField tfdTotal;
    private javax.swing.JTextField tfdValor;
    private javax.swing.JFormattedTextField tffDataFim;
    private javax.swing.JFormattedTextField tffDataInicio;
    private javax.swing.JFormattedTextField tffDataOS;
    // End of variables declaration//GEN-END:variables

}
