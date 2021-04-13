/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.sistema.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodolpho
 */
public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form VendaView
     */
    
    private DefaultTableModel tableModel;
    
    public VendaView() {
        initComponents();
        cboProduto.setEnabled(false);
        btnAlterarCliente.setEnabled(false);
        btnDeletar.setEnabled(false);
        tableModel = (DefaultTableModel)tblCarrinho.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        cboProduto = new javax.swing.JComboBox<>();
        cboTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        btnAlterarCliente = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        btnDeletar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda de Flores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblCliente.setText("Cliente");

        lblProduto.setText("Produto");

        lblQuantidade.setText("Quantidade");

        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione um cliente --", "Joao", "Maria" }));
        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });

        cboProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione o produto --", "Tulipa", "Rosa", "Lírio", " " }));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione o tipo --", "Buque", "Unidade" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo");

        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuantidade.setText("0");
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCliente)
                    .addComponent(lblQuantidade)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidade))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCliente)
                        .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterarCliente, cboCliente});

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho de compras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Produto", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarrinho.setColumnSelectionAllowed(true);
        tblCarrinho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblCarrinhoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarrinho);
        tblCarrinho.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblCarrinho.getColumnModel().getColumnCount() > 0) {
            tblCarrinho.getColumnModel().getColumn(0).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblCarrinho.getColumnModel().getColumn(1).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCarrinho.getColumnModel().getColumn(2).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblCarrinho.getColumnModel().getColumn(3).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(3).setPreferredWidth(35);
        }

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lblTotal.setText("Total:     R$");

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addGap(3, 3, 3)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotal)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeletar, txtTotal});

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if((cboTipo.getSelectedIndex()!= 0)&&(cboProduto.getSelectedIndex()!= 0)&&(Integer.parseInt(txtQuantidade.getText())!= 0)){
            tableModel.addRow(new Object[] {
                cboTipo.getSelectedItem().toString(),
                cboProduto.getSelectedItem().toString(),
                Integer.parseInt(txtQuantidade.getText()), 
                5.00
            });
        
            cboTipo.setSelectedIndex(0);
            txtQuantidade.setValue(0);
    
            txtTotalActionPerformed(evt);  
        }else{
            JOptionPane.showMessageDialog(this, "Por favor, realize o preenchimento dos dados corretamente","Preenchimento Incompleto",JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        if(cboTipo.getSelectedIndex() != 0){
            cboProduto.setEnabled(true);
        }else{
            cboProduto.setSelectedIndex(0);
            cboProduto.setEnabled(false);
        }
        
    }//GEN-LAST:event_cboTipoActionPerformed

    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
        if(cboCliente.getSelectedIndex() != 0){
            btnAlterarCliente.setEnabled(true);
            cboCliente.setEnabled(false);
        }
    }//GEN-LAST:event_cboClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        
        int dialogoConfirmacao = JOptionPane.showConfirmDialog(this, "Confirme a alteração do cliente.","Confirmar alteração", JOptionPane.OK_CANCEL_OPTION);
        
        if(dialogoConfirmacao == 0){
            cboCliente.setEnabled(true);
            cboCliente.setSelectedIndex(0);
            btnAlterarCliente.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        double total = 0.0;
         
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            int quantidade = (int)tableModel.getValueAt(i, 2);
            double preco = (double)tableModel.getValueAt(i, 3);
            total += preco*quantidade;
        }
        
        txtTotal.setText(String.format("%.2f", total));
        
        
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int linhaSelecionada = tblCarrinho.getSelectedRow();
        if(tblCarrinho.getSelectedRow() >= 0){
            tableModel.removeRow(linhaSelecionada);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha","Erro ao Deletar", JOptionPane.ERROR_MESSAGE);
        }
        txtTotalActionPerformed(evt);
        btnDeletar.setEnabled(false);
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tblCarrinhoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblCarrinhoFocusGained
        btnDeletar.setEnabled(true);
    }//GEN-LAST:event_tblCarrinhoFocusGained

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        if(tableModel.getRowCount() != 0){
            int dialogConfirmacao = JOptionPane.showConfirmDialog(this, "Deseja finalizar venda ?","Finalização de venda", JOptionPane.YES_NO_OPTION);
            if(dialogConfirmacao == 0 /*yes*/){
                JOptionPane.showMessageDialog(this, "Venda Finalizada");
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Não é possível finalizar uma venda sem itens no carrinho !","Erro ao finalizar venda.", JOptionPane.ERROR_MESSAGE);
        }
        
   
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        
        char c = evt.getKeyChar();
        
        if( ((c < '0') || (c > '9')) && ((c !=KeyEvent.VK_BACK_SPACE) || (c !=KeyEvent.VK_DELETE))){
            evt.consume(); 
            JOptionPane.showMessageDialog(this, "O campo quantidade aceita apenas números","Formato incorreto", JOptionPane.ERROR_MESSAGE);
        }
        
        if(txtQuantidade.getText().length() >= 4){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Você ultrapassou o limite de 4 digitos","Limite ultrapassado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboProduto;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
