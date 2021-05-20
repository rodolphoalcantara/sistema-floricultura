/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojainformaticaado2Views;
import com.mycompany.lojainformaticaado2.controller.LojaInformaticaController;
import com.mycompany.lojainformaticaado2.model.Computador;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author aureliosantos
 */
public class LojaInformaticaView extends javax.swing.JFrame {
      
    public String Modo = "Salvar";
   
          
        
    public LojaInformaticaView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_SO = new javax.swing.ButtonGroup();
        panel_botoes = new javax.swing.JPanel();
        btn_consultar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        panel_HDPROCESSADOR = new javax.swing.JPanel();
        combo_Processador = new javax.swing.JComboBox<>();
        combo_HD = new javax.swing.JComboBox<>();
        panel_SO = new javax.swing.JPanel();
        jToggleButton_WINDOWS = new javax.swing.JToggleButton();
        jToggleButton_LINUX = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jCombo_marca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_botoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botoesLayout = new javax.swing.GroupLayout(panel_botoes);
        panel_botoes.setLayout(panel_botoesLayout);
        panel_botoesLayout.setHorizontalGroup(
            panel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botoesLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        panel_botoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_consultar, btn_salvar});

        panel_botoesLayout.setVerticalGroup(
            panel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_botoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_consultar, btn_salvar});

        panel_HDPROCESSADOR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione HD e Processador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        combo_Processador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Processador", "Icore3", "Icore4", "Icore7", "AMD Phenon X4", "AMD Phenon X9" }));

        combo_HD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o HD", "HD 250GB", "HD 500GB", "HD 1TB", "SSD 250GB", "SSD 500GB" }));

        javax.swing.GroupLayout panel_HDPROCESSADORLayout = new javax.swing.GroupLayout(panel_HDPROCESSADOR);
        panel_HDPROCESSADOR.setLayout(panel_HDPROCESSADORLayout);
        panel_HDPROCESSADORLayout.setHorizontalGroup(
            panel_HDPROCESSADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HDPROCESSADORLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo_Processador, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_HDPROCESSADORLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_HD, combo_Processador});

        panel_HDPROCESSADORLayout.setVerticalGroup(
            panel_HDPROCESSADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HDPROCESSADORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_HDPROCESSADORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_Processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panel_HDPROCESSADORLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_HD, combo_Processador});

        panel_SO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um sistema operacional", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 18))); // NOI18N

        buttonGroup_SO.add(jToggleButton_WINDOWS);
        jToggleButton_WINDOWS.setText("Windows");
        jToggleButton_WINDOWS.setActionCommand("WINDOWS");

        buttonGroup_SO.add(jToggleButton_LINUX);
        jToggleButton_LINUX.setText("Linux");
        jToggleButton_LINUX.setActionCommand("LINUX");

        javax.swing.GroupLayout panel_SOLayout = new javax.swing.GroupLayout(panel_SO);
        panel_SO.setLayout(panel_SOLayout);
        panel_SOLayout.setHorizontalGroup(
            panel_SOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SOLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jToggleButton_WINDOWS, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton_LINUX, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        panel_SOLayout.setVerticalGroup(
            panel_SOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_SOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton_LINUX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_WINDOWS, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha a Marca do seu Computador\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jCombo_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Marca", "Aurélio Bispo", "DELL", "HP", "LENOVO" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCombo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCombo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_HDPROCESSADOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(panel_SO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(panel_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panel_SO, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_HDPROCESSADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        new LojaInformaticaConsultaView().setVisible(true);
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
       String marca;
       String SO;
       String HD;
       String processador;
       marca = jCombo_marca.getSelectedItem().toString();
       SO = buttonGroup_SO.getSelection().getActionCommand();
       HD =  combo_HD.getSelectedItem().toString();
       processador = combo_Processador.getSelectedItem().toString();
       if(Modo.equals("Salvar")){
                  if(marca.trim().equals("")||marca.trim().equals("Selecione a Marca")||HD.trim().equals("Selecione o HD")||HD.trim().equals("")
            ||processador.trim().equals("")||processador.trim().equals("Selecione o Processador")){
            JOptionPane.showMessageDialog(this, "Por favor Escolhas suas opções de configuração"," Campos Obrigatórios",JOptionPane.WARNING_MESSAGE);
            
        }
       else{
           
           if(LojaInformaticaController.salvar(marca ,SO, HD, processador)){
               
           JOptionPane.showMessageDialog(this, " Configurações Salvas com sucesso!");       }
       else{
           JOptionPane.showMessageDialog(this, " Não foi possivel Salvar as configurações");
       }
           
       }
           
       }
       else if(Modo.equals("editar")){
           
           Computador comp = new Computador();
           
           int ID_computador = comp.getID_computador();
           
            if(marca.trim().equals("")||marca.trim().equals("Selecione a Marca")||HD.trim().equals("Selecione o HD")||HD.trim().equals("")
            ||processador.trim().equals("")||processador.trim().equals("Selecione o Processador")){
            JOptionPane.showMessageDialog(this, "Por favor Escolhas suas opções de configuração"," Campos Obrigatórios",JOptionPane.WARNING_MESSAGE);
            
        }
            else{
                if(LojaInformaticaController.editar(ID_computador,marca, SO, HD, processador)){
                    
                    JOptionPane.showMessageDialog(this, " Atualização Feita com sucesso!");
                }
                else{
                    JOptionPane.showMessageDialog(this, " Não foi possivel Atualizar o Item");
       }
            }
            
            this.dispose();
           
       }
       
       
       
        
    
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
         int retorno = JOptionPane.showConfirmDialog(this, "Deseja realmente SAIR ? ", " Deseja Sair ?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if ( retorno == 0 ){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_sairActionPerformed
    
      
    
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
            java.util.logging.Logger.getLogger(LojaInformaticaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaInformaticaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaInformaticaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaInformaticaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaInformaticaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.ButtonGroup buttonGroup_SO;
    private javax.swing.JComboBox<String> combo_HD;
    private javax.swing.JComboBox<String> combo_Processador;
    private javax.swing.JComboBox<String> jCombo_marca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton_LINUX;
    private javax.swing.JToggleButton jToggleButton_WINDOWS;
    private javax.swing.JPanel panel_HDPROCESSADOR;
    private javax.swing.JPanel panel_SO;
    private javax.swing.JPanel panel_botoes;
    // End of variables declaration//GEN-END:variables
}
