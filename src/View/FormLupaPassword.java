/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Config.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FormLupaPassword extends javax.swing.JFrame {
    Statement stat;
    ResultSet res;
    
     private void tampil_data()       
    {
        try
        {
            txt_id.setText(res.getString(1));
            txt_username.setText(res.getString(2));
            txt_pass.setText(res.getString(3));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane,"gagal tampil data");
        
    }
    }
    
    private void form_data()
    {
        try
        {
            stat=Koneksi.connection().createStatement();
            res = stat.executeQuery("select * from tb_user");
            if(res.next())
            {
                tampil_data();
            }
        }
        catch(SQLException e)
        {
            JOptionPane .showMessageDialog(rootPane,"gagal tampil data" +e.getMessage());
        }    
    }
    
    private void ganti_password()
    {
        try
        {
            if(txt_id.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "id tidak boleh kosong");
            }
            else
            {
                stat.executeUpdate("update tb_user set username = '"+txt_username.getText()+"', password = '"+txt_pass.getText()+"' where id_user = "+txt_id.getText()+"");
                JOptionPane.showMessageDialog(rootPane, "username dan password anda sudah di ubah");
                new FormLogin().show();
                this.dispose();
            }
        } catch (SQLException e)
        {
              JOptionPane.showMessageDialog(rootPane, "gagal ubah data" +e.getMessage());      
        }
    }
    /**
     * Creates new form FormLupaPassword
     */
    public FormLupaPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_exit = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        bt_reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eye1 = new javax.swing.JLabel();
        eye2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("RESET PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Masukkan Username Anda Sebelumnya");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buku2.png"))); // NOI18N
        jLabel3.setText("\n");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_20px_2.png"))); // NOI18N
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });
        jPanel1.add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 25, -1, -1));

        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setText("password");
        txt_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passFocusLost(evt);
            }
        });
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 311, 230, 50));

        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setText("Username");
        txt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 243, 230, 50));

        bt_reset.setBackground(new java.awt.Color(51, 51, 51));
        bt_reset.setForeground(new java.awt.Color(255, 255, 255));
        bt_reset.setText("RESET");
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });
        jPanel1.add(bt_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 230, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_lock_30px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 321, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_User_Groups_30px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 255, -1, -1));

        eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_eye_20px.png"))); // NOI18N
        eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye1MousePressed(evt);
            }
        });
        jPanel1.add(eye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_invisible_20px.png"))); // NOI18N
        eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye2MousePressed(evt);
            }
        });
        jPanel1.add(eye2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        txt_id.setBorder(null);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
        dispose();
    }//GEN-LAST:event_bt_exitMouseClicked

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        String pass = txt_pass.getText();
        if(pass.equals("password")){
            txt_pass.setText("");
        }
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusLost
        String pass=txt_pass.getText();
        if(pass.equals("")||pass.equals("password")){
            txt_pass.setText("password");

        }
    }//GEN-LAST:event_txt_passFocusLost

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        String Username=txt_username.getText();
        if(Username.equals("Username")){
            txt_username.setText("");
        }
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        String Username=txt_username.getText();
        if(Username.equals("")||Username.equals("Username")){
            txt_username.setText("Username");
        }
    }//GEN-LAST:event_txt_usernameFocusLost

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        ganti_password();
    }//GEN-LAST:event_bt_resetActionPerformed

    private void eye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye1MousePressed
        eye2.setVisible(true);
        eye1.setVisible(false);
        txt_pass.setEchoChar((char)0);
    }//GEN-LAST:event_eye1MousePressed

    private void eye2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye2MousePressed
        eye1.setVisible(true);
        eye2.setVisible(false);
        txt_pass.setEchoChar('*');
    }//GEN-LAST:event_eye2MousePressed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FormLupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FormLupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FormLupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FormLupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLupaPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_exit;
    private javax.swing.JButton bt_reset;
    private javax.swing.JLabel eye1;
    private javax.swing.JLabel eye2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
