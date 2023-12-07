
package InfoAidTechPwGenerator;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class HomeGenerator extends javax.swing.JFrame {

    public HomeGenerator() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();
        Generate = new javax.swing.JButton();
        Copyit = new javax.swing.JLabel();
        CopyTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setLayout(null);

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InfoAidTech/PICS/password-entry.png"))); // NOI18N
        MainPanel.add(LogoLabel);
        LogoLabel.setBounds(140, -60, 390, 230);

        HeaderLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InfoAidTech/PICS/security-system.png"))); // NOI18N
        HeaderLabel.setText("Password Generator");
        MainPanel.add(HeaderLabel);
        HeaderLabel.setBounds(10, 60, 270, 70);

        PasswordLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InfoAidTech/PICS/length.png"))); // NOI18N
        PasswordLabel.setText("Password Length");
        MainPanel.add(PasswordLabel);
        PasswordLabel.setBounds(30, 190, 140, 30);

        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });
        MainPanel.add(TextField);
        TextField.setBounds(200, 190, 170, 30);

        Generate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Generate.setText("Generate Password");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        MainPanel.add(Generate);
        Generate.setBounds(200, 250, 170, 30);

        Copyit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Copyit.setForeground(new java.awt.Color(255, 255, 255));
        Copyit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainPanel.add(Copyit);
        Copyit.setBounds(30, 340, 120, 30);
        MainPanel.add(CopyTextField);
        CopyTextField.setBounds(200, 370, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        
    }//GEN-LAST:event_TextFieldActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        
     String length = TextField.getText().trim().replaceAll("[^0-9]", "");

    if (length.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter length.");
    } else {
        int lengthValue = Integer.parseInt(length);
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure with length " + length);

        if (confirmation == 0 && lengthValue >= 3 && lengthValue <= 18) {
            String result = generateRandomPassword(lengthValue);
            Copyit.setText("Copy Password");
            CopyTextField.setText(result);
        } else if (confirmation == 1) {
            this.dispose();
            new HomeGenerator().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Enter the length between 3 and 18");
            this.dispose();
            new HomeGenerator().setVisible(true);
        }
    }


        
    }//GEN-LAST:event_GenerateActionPerformed
    private String generateRandomPassword(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*_-+";
    SecureRandom random = new SecureRandom();

    StringBuilder password = new StringBuilder();
    for (int j = 0; j < length; j++) {
        int randomIndex = random.nextInt(characters.length());
        password.append(characters.charAt(randomIndex));
    }

    return password.toString();
}
    
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
            java.util.logging.Logger.getLogger(HomeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CopyTextField;
    private javax.swing.JLabel Copyit;
    private javax.swing.JButton Generate;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField TextField;
    // End of variables declaration//GEN-END:variables
}
