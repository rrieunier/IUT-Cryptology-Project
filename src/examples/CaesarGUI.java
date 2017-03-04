/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author roman
 */
public class CaesarGUI extends javax.swing.JFrame {

    /**
     * Creates new form CaesarGUI
     */
    public CaesarGUI() {
        initComponents();
    }

    String normalize(String str) {
        return str.replaceAll("\\s+", "").toLowerCase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cleCaesar = new javax.swing.JTextField();
        crypterCaesar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        texteCrypteCaesar = new javax.swing.JTextArea();
        decrypteCaesar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        texteDecrypteCaesar = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        texteACrypter = new javax.swing.JTextField();

        jLabel2.setText("Saisissez votre clé (int) :");

        cleCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleCaesarActionPerformed(evt);
            }
        });

        crypterCaesar.setText("Crypter (César)");
        crypterCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crypterCaesarActionPerformed(evt);
            }
        });

        jLabel5.setText("Message crypté (César)");

        texteCrypteCaesar.setColumns(20);
        texteCrypteCaesar.setRows(5);
        jScrollPane5.setViewportView(texteCrypteCaesar);

        decrypteCaesar.setText("Décrypter (César)");
        decrypteCaesar.setToolTipText("");
        decrypteCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrypteCaesarActionPerformed(evt);
            }
        });

        jLabel6.setText("Message décrypté (César)");

        texteDecrypteCaesar.setEditable(false);
        texteDecrypteCaesar.setColumns(20);
        texteDecrypteCaesar.setRows(5);
        jScrollPane6.setViewportView(texteDecrypteCaesar);

        jLabel3.setText("Saisissez votre message :");

        texteACrypter.setAlignmentX(0.0F);
        texteACrypter.setName("texteACrypter"); // NOI18N
        texteACrypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texteACrypterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cleCaesar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(crypterCaesar)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(decrypteCaesar)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(texteACrypter, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texteACrypter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleCaesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decrypteCaesar)
                    .addComponent(crypterCaesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleCaesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cleCaesarActionPerformed

    private void crypterCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crypterCaesarActionPerformed
        int i = Integer.parseInt(cleCaesar.getText());
        String encryptedText = Caesar.caesarEncrypt(normalize(texteACrypter.getText()), i);
        texteCrypteCaesar.setText(encryptedText);
    }//GEN-LAST:event_crypterCaesarActionPerformed

    private void decrypteCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrypteCaesarActionPerformed
        int i = Integer.parseInt(cleCaesar.getText());
        String decryptedText = Caesar.caesarDecrypt(normalize(texteCrypteCaesar.getText()), i);
        texteDecrypteCaesar.setText(decryptedText);
    }//GEN-LAST:event_decrypteCaesarActionPerformed

    private void texteACrypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texteACrypterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texteACrypterActionPerformed

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
            java.util.logging.Logger.getLogger(CaesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaesarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cleCaesar;
    private javax.swing.JButton crypterCaesar;
    private javax.swing.JButton decrypteCaesar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField texteACrypter;
    private javax.swing.JTextArea texteCrypteCaesar;
    private javax.swing.JTextArea texteDecrypteCaesar;
    // End of variables declaration//GEN-END:variables
}