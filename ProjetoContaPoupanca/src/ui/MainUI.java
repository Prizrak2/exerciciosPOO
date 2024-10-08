/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import models.SavingAccount;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author puc
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        TextArea1_dados.setEnabled(false);
        
        TextField1_Valor.setEnabled(false);
        Button1_depositar.setEnabled(false);
        Button1_emitirDados.setEnabled(false);
        Button1_sacar1.setEnabled(false);
        
        SetImageLabel(jLabel1_flamengo, "src/images/mc-poze-flamengo-funk.jpg");
        SetImageLabel(jLabel1_eu, "src/images/image.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextField1_nomeCompleto = new javax.swing.JTextField();
        TextField5_agencia = new javax.swing.JTextField();
        TextField6_numeroDaConta = new javax.swing.JTextField();
        TextField7_saldo = new javax.swing.JTextField();
        Button1_depositar = new javax.swing.JButton();
        Button1_sacar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TextField1_Valor = new javax.swing.JTextField();
        Button1_criarConta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea1_dados = new javax.swing.JTextArea();
        Button1_emitirDados = new javax.swing.JButton();
        jLabel1_flamengo = new javax.swing.JLabel();
        jLabel1_eu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("CONTA POUPANÇA");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("APRESENTAÇÃO DOS DADOS");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("NOME COMPLETO:");

        jLabel4.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("NUMERO DA CONTA:");

        jLabel5.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("AGENCIA:");

        jLabel6.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("SALDO:");

        jLabel7.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("BANCO SEU DINHEIRO E MEU");

        TextField1_nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1_nomeCompletoActionPerformed(evt);
            }
        });

        TextField5_agencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField5_agenciaActionPerformed(evt);
            }
        });

        TextField6_numeroDaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField6_numeroDaContaActionPerformed(evt);
            }
        });

        TextField7_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField7_saldoActionPerformed(evt);
            }
        });

        Button1_depositar.setBackground(new java.awt.Color(153, 255, 204));
        Button1_depositar.setFont(new java.awt.Font("Noto Sans Mono CJK SC", 1, 14)); // NOI18N
        Button1_depositar.setForeground(new java.awt.Color(0, 153, 153));
        Button1_depositar.setText("DEPOSITAR");
        Button1_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1_depositarActionPerformed(evt);
            }
        });

        Button1_sacar1.setBackground(new java.awt.Color(204, 255, 204));
        Button1_sacar1.setFont(new java.awt.Font("Noto Sans Mono CJK SC", 1, 14)); // NOI18N
        Button1_sacar1.setForeground(new java.awt.Color(0, 153, 51));
        Button1_sacar1.setText("SACAR");
        Button1_sacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1_sacar1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans Mono CJK SC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Valor:");

        TextField1_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1_ValorActionPerformed(evt);
            }
        });

        Button1_criarConta.setBackground(new java.awt.Color(255, 51, 102));
        Button1_criarConta.setFont(new java.awt.Font("Noto Sans Mono CJK SC", 1, 14)); // NOI18N
        Button1_criarConta.setText("CRIAR CONTA");
        Button1_criarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1_criarContaActionPerformed(evt);
            }
        });

        TextArea1_dados.setColumns(20);
        TextArea1_dados.setRows(5);
        jScrollPane2.setViewportView(TextArea1_dados);

        Button1_emitirDados.setBackground(new java.awt.Color(153, 255, 255));
        Button1_emitirDados.setFont(new java.awt.Font("Noto Sans Mono CJK SC", 1, 14)); // NOI18N
        Button1_emitirDados.setText("EMITIR DADOS");
        Button1_emitirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1_emitirDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Button1_sacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextField1_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(Button1_depositar)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField5_agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField6_numeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Button1_criarConta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(76, 76, 76)
                        .addComponent(TextField7_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1_eu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1_flamengo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TextField1_nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Button1_emitirDados)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(301, 301, 301))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(169, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(153, 153, 153)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1_eu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TextField1_nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(TextField5_agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TextField6_numeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1_flamengo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button1_criarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TextField7_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_sacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField1_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Button1_emitirDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel7)
                    .addContainerGap(434, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private SavingAccount account01 = null;
    
    private void TextField1_nomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1_nomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1_nomeCompletoActionPerformed

    private void TextField5_agenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField5_agenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField5_agenciaActionPerformed

    private void TextField6_numeroDaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField6_numeroDaContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField6_numeroDaContaActionPerformed

    private void TextField7_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField7_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField7_saldoActionPerformed

    private void Button1_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1_depositarActionPerformed
        // TODO add your handling code here:
        try {
            account01.deposit(Float.parseFloat(TextField1_Valor.getText()));
            
            TextArea1_dados.setText(account01.emitBalance());
        }catch (Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_Button1_depositarActionPerformed

    private void TextField1_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1_ValorActionPerformed
  
    private void Button1_criarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1_criarContaActionPerformed
        // TODO add your handling code here:
        try {
            account01 = new SavingAccount(TextField1_nomeCompleto.getText(),
                    Integer.parseInt(TextField5_agencia.getText()),
               Integer.parseInt(TextField6_numeroDaConta.getText()),
                   Float.parseFloat(TextField7_saldo.getText()));   
            
            TextArea1_dados.setText(account01.emitBalance());  
            
            TextField1_nomeCompleto.setEnabled(false);
            TextField5_agencia.setEnabled(false);
            TextField6_numeroDaConta.setEnabled(false);
            TextField7_saldo.setEnabled(false);
            Button1_criarConta.setEnabled(false);
            
            TextField1_Valor.setEnabled(true);
            Button1_depositar.setEnabled(true);
            Button1_emitirDados.setEnabled(true);
            Button1_sacar1.setEnabled(true);
        }catch (Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_Button1_criarContaActionPerformed

    private void Button1_emitirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1_emitirDadosActionPerformed
        // TODO add your handling code here:
        try {
            TextArea1_dados.setText(account01.emitBalance());
        }catch (Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_Button1_emitirDadosActionPerformed

    private void Button1_sacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1_sacar1ActionPerformed
        // TODO add your handling code here:
        try {
            account01.withdraw(Float.parseFloat(TextField1_Valor.getText()));
            
            TextArea1_dados.setText(account01.emitBalance());
        }catch (Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_Button1_sacar1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1_criarConta;
    private javax.swing.JButton Button1_depositar;
    private javax.swing.JButton Button1_emitirDados;
    private javax.swing.JButton Button1_sacar1;
    private javax.swing.JTextArea TextArea1_dados;
    private javax.swing.JTextField TextField1_Valor;
    private javax.swing.JTextField TextField1_nomeCompleto;
    private javax.swing.JTextField TextField5_agencia;
    private javax.swing.JTextField TextField6_numeroDaConta;
    private javax.swing.JTextField TextField7_saldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_eu;
    private javax.swing.JLabel jLabel1_flamengo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
