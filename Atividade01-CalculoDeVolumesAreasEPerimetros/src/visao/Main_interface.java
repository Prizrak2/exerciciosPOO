/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author lusra
 */
public class Main_interface extends javax.swing.JFrame {

    /**
     * Creates new form main_interface
     */
    public Main_interface() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        SetImageLabel(jLabel1_Flamengo1, "src/imagens/mc-poze-flamengo-funk.jpg");
        SetImageLabel(jLabel1_eu, "src/imagens/image.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_Piramide = new javax.swing.JButton();
        jButton1_Esfera = new javax.swing.JButton();
        jButton1_Retangulo = new javax.swing.JButton();
        jLabel1_MenuPrincipal = new javax.swing.JLabel();
        jLabel1_eu = new javax.swing.JLabel();
        jLabel1_Flamengo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");
        setBackground(new java.awt.Color(0, 204, 204));

        jButton1_Piramide.setText("Cálculos de Pirâmide");
        jButton1_Piramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_PiramideActionPerformed(evt);
            }
        });

        jButton1_Esfera.setText("Cálculos de Esfera");
        jButton1_Esfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EsferaActionPerformed(evt);
            }
        });

        jButton1_Retangulo.setText("Cálculos de Retângulo");
        jButton1_Retangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_RetanguloActionPerformed(evt);
            }
        });

        jLabel1_MenuPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1_MenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1_MenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_MenuPrincipal.setText("Menu Principal");
        jLabel1_MenuPrincipal.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1_eu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_Esfera, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_Retangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(213, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_Piramide, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1_MenuPrincipal))
                        .addGap(21, 192, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(432, Short.MAX_VALUE)
                    .addComponent(jLabel1_Flamengo1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton1_Piramide, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1_eu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1_Esfera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1_Retangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel1_Flamengo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(202, 202, 202)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_PiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_PiramideActionPerformed
        // TODO add your handling code here:
        Interface_Piramide InterfacePiramide = new Interface_Piramide();
        this.dispose();
        InterfacePiramide.setVisible(true);
    }//GEN-LAST:event_jButton1_PiramideActionPerformed

    private void jButton1_EsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EsferaActionPerformed
        // TODO add your handling code here:
        Interface_Esfera InterfaceEsfera = new Interface_Esfera();
        this.dispose();
        InterfaceEsfera.setVisible(true);
    }//GEN-LAST:event_jButton1_EsferaActionPerformed

    private void jButton1_RetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_RetanguloActionPerformed
        // TODO add your handling code here:
        Interface_Retangulo InterfaceRetangulo = new Interface_Retangulo();
        this.dispose();
        InterfaceRetangulo.setVisible(true);
    }//GEN-LAST:event_jButton1_RetanguloActionPerformed

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
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_interface().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel (JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Esfera;
    private javax.swing.JButton jButton1_Piramide;
    private javax.swing.JButton jButton1_Retangulo;
    private javax.swing.JLabel jLabel1_Flamengo1;
    private javax.swing.JLabel jLabel1_MenuPrincipal;
    private javax.swing.JLabel jLabel1_eu;
    // End of variables declaration//GEN-END:variables
}
