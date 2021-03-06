/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.snake;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shadin
 */
public class RegistrationForm extends javax.swing.JFrame {

    PreparedStatement p;
    ResultSet r;
    
    
    public RegistrationForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        BirthDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        Create = new com.k33ptoo.components.KButton();
        Signin = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("First Name:");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        FirstName.setBackground(new java.awt.Color(102, 102, 102));
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setBorder(null);
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 220, 30));

        LastName.setBackground(new java.awt.Color(102, 102, 102));
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setBorder(null);
        kGradientPanel1.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, 30));

        jLabel2.setText("Last Name:");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        username.setBackground(new java.awt.Color(102, 102, 102));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        kGradientPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 220, 30));

        jLabel3.setText("password:");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 30));

        jLabel4.setText("username:");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 176, -1, 20));

        password.setBackground(new java.awt.Color(102, 102, 102));
        password.setBorder(null);
        kGradientPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 220, 30));

        jLabel5.setText("confirm password:");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 30));

        confirmPassword.setBackground(new java.awt.Color(102, 102, 102));
        confirmPassword.setBorder(null);
        kGradientPanel1.add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 220, 30));

        jLabel6.setText("Birth Date:");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 90, -1));

        BirthDate.setBackground(new java.awt.Color(102, 0, 153));
        kGradientPanel1.add(BirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 220, 30));

        jLabel7.setText("Address:");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        Address.setBackground(new java.awt.Color(153, 153, 153));
        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setRows(5);
        Address.setBorder(null);
        jScrollPane1.setViewportView(Address);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 250, 90));

        Create.setText("Create");
        Create.setkBorderRadius(-20);
        Create.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        Create.setkPressedColor(new java.awt.Color(0, 102, 153));
        Create.setkStartColor(new java.awt.Color(0, 51, 204));
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 100, 30));

        Signin.setText("Signin");
        Signin.setkBorderRadius(-20);
        Signin.setkIndicatorThickness(4);
        Signin.setkStartColor(new java.awt.Color(0, 102, 204));
        Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 80, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Registration Form");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel9.setText("Gender:");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 60, 20));

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void SigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
            l.setVisible(true);
            l.pack();
            l.setLocationRelativeTo(null);
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_SigninActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Snake","root","");
         String sql = "INSERT INTO `Snake`(`First Name`, `Last Name`, `username`, `password`, `Gender`, `DOB`, `Address`) VALUES (?, ?, ?, ?, ?, ?, ?)";
         p = con.prepareStatement(sql);
         
         p.setString(1,FirstName.getText());
         p.setString(2,LastName.getText());
         p.setString(3,username.getText());
         p.setString(4,password.getText());
           
         String gender="";
            if(Male.isSelected())
            {gender = "Male";
            }
            else if(Female.isSelected())
            {gender = "Female";
            }
            p.setString(5,gender);
        
            
           SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
           String DOB = dateformat.format(BirthDate.getDate());
           p.setString(6,DOB);
            
           p.setString(7,Address.getText());
      
          
           p.executeUpdate();
           
           JOptionPane.showMessageDialog(this, username.getText()+" is successfully registered...");
           
           
             
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_CreateActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
        if(Male.isSelected())
        {Female.setSelected(false);}
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
        if(Female.isSelected())
        {Male.setSelected(false);}
    }//GEN-LAST:event_FemaleActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private com.toedter.calendar.JDateChooser BirthDate;
    private com.k33ptoo.components.KButton Create;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JRadioButton Male;
    private com.k33ptoo.components.KButton Signin;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
