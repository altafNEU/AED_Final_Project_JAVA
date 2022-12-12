/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface;

import edu.northeastern.Business.DatabaseUtil.DB4OUtil;
import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.userR.User;
import edu.northeastern.Utility.Notification;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author satyajitdas
 */
public class UserRegister extends javax.swing.JPanel {

    /**
     * Creates new form UserRegister
     */
         EcoSystem ecosystem;
    JPanel workArea;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public UserRegister(JPanel workArea,EcoSystem system) {
        initComponents();
         this.ecosystem=system;
        this.workArea=workArea;
        this.setSize(1920, 1080);
        
    }
    public  void sendmail()
    {   
        Notification notification = new Notification();
        String toEmail = emailTextField.getText();
        String emailSubject = "User Account Created!!";
        String emailContent = "Welcome to Be Well Application !!!"; 
        notification.sendMail(toEmail, emailSubject, emailContent);
    }

    public void sendSMS() {
        Notification notification = new Notification();
        String toPhone = phoneTextField.getText();
        String smsContent = "Welcome to Be Well Application" + firstNameTextField.getText() + " " + lastNameTextField.getText();
        notification.sendSms(toPhone, smsContent);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" New Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 170, 60));

        jLabel3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(73, 84, 90));
        jLabel3.setText("Check your email inbox after registration");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 730, 290, 30));

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 140, -1));

        userNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        userNameTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 271, 48));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setText("First Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 130, -1));

        firstNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        firstNameTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 271, 48));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 130, -1));

        lastNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        lastNameTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 271, 48));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 110, 30));

        emailTextField.setBackground(new java.awt.Color(248, 248, 249));
        emailTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 271, 50));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setText("Phone");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 100, -1));

        phoneTextField.setBackground(new java.awt.Color(248, 248, 249));
        phoneTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 271, 48));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setText("Location");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 120, -1));

        locationTextField.setBackground(new java.awt.Color(248, 248, 249));
        locationTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 270, 48));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 110, -1));

        passwordTextField.setBackground(new java.awt.Color(248, 248, 249));
        passwordTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel2.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 271, 48));

        loginButton.setBackground(new java.awt.Color(222, 222, 222));
        loginButton.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 190, 60));

        signUpButton.setBackground(new java.awt.Color(0, 0, 0));
        signUpButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Register");
        signUpButton.setBorder(null);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, 190, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor shake hand.jpg"))); // NOI18N
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setAlignmentY(50.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 1080));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 1440, 1190));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Let's Register your ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 370, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2282, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        
           UserLogin wa=new UserLogin(workArea,ecosystem);
        workArea.add("UserLogin",wa);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
          if(userNameTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || passwordTextField.getText().isEmpty() || locationTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        } 
        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userNameTextField.getText())){
            if(!phoneTextField.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                phoneTextField.setText("");
                return;
            }
            if(!emailTextField.getText().matches("^[a-zA-Z0-9]+@[a-z]*.com"))
            {
                JOptionPane.showMessageDialog(null, "Please enter valid email address!!");
                emailTextField.setText("");
                return;
            }
            
            if(!passwordTextField.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"))
            {
                 JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                    + "with one upper case, one lower case, one digit and one special character");
                passwordTextField.setText("");
                return;
            }
            
            User customer = new User(firstNameTextField.getText(),lastNameTextField.getText(), emailTextField.getText(),phoneTextField.getText(),userNameTextField.getText(),passwordTextField.getText(), locationTextField.getText());
            ecosystem.getUserAccDir().addAccount(customer);
            ecosystem.getUserDir().addUser(customer);
            sendmail();
            sendSMS(); // costly keep it commented 
            userNameTextField.setText("");
            emailTextField.setText("");
            firstNameTextField.setText("");
            phoneTextField.setText("");
            lastNameTextField.setText("");
            passwordTextField.setText("");
            locationTextField.setText("");
              dB4OUtil.storeSystem(ecosystem);
            JOptionPane.showMessageDialog(null, "User Account Created!!");
            
            
         }else{
            JOptionPane.showMessageDialog(null, "Username " + userNameTextField.getText() + " already exists !!!, Please try a new one");
         }
    }//GEN-LAST:event_signUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}