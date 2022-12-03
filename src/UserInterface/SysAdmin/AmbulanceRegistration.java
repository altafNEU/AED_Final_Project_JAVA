/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import Business.EmergencyAmbulance.Ambulance;
import Business.EcoSystem;
import Business.EmergencyAmbulance.AmbulanceDir;
import java.util.ArrayList;
//import Business.EmergencyAmbulance.Ambulance;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altaf
 */
public class AmbulanceRegistration extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceRegistration
     */
    public AmbulanceRegistration() {
        initComponents();
    }

    EcoSystem system;
    JPanel rightSidePanel;
    Ambulance amb;

    public AmbulanceRegistration(EcoSystem system, JPanel rightSidePanel) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.setSize(1160, 750);
        populateTable();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        userIdTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ambulance Name", "Drivers Name", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setBackground(new java.awt.Color(10, 132, 255));
        addButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel7.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        updateButton.setBackground(new java.awt.Color(94, 92, 230));
        updateButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel7.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 140, 39));

        deleteButton.setBackground(new java.awt.Color(255, 55, 95));
        deleteButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel7.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("First Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        locationTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(locationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Last Name");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        firstNameTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        userIdTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        passwordTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        phoneTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:`
        if (firstNameTxt.getText().isEmpty() || locationTxt.getText().isEmpty() || userIdTxt.getText().isEmpty() || passwordTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userIdTxt.getText())) {
            if (!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                phoneTxt.setText("");
                return;
            }

            if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
                JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                        + "with one upper case, one lower case, one digit and one special character");
                passwordTxt.setText("");
                return;
            }

            Ambulance customer = new Ambulance(userIdTxt.getText(), passwordTxt.getText(), locationTxt.getText(), firstNameTxt.getText(), phoneTxt.getText());
            system.getUserAccountDirectory().addAccount(customer);
            system.getAmbulanceDir().addNewAmbulance(customer);
            populateTable();
            firstNameTxt.setText("");
            phoneTxt.setText("");
            userIdTxt.setText("");
            passwordTxt.setText("");
            locationTxt.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username " + userIdTxt.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String username = userIdTxt.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1 = jTable1.getSelectedRow();
        if (t1 >= 0) {

            String a = (String) t.getValueAt(t1, 2);
            AmbulanceDir pol = system.getAmbulanceDir();
            ArrayList<Ambulance> cd1 = pol.getAmbulances();
            int z = cd1.size();

            if (firstNameTxt.getText().isEmpty() || locationTxt.getText().isEmpty() || userIdTxt.getText().isEmpty() || passwordTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
                return;
            }
            if (!username.matches(a)) {
                JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
                firstNameTxt.setText("");
                userIdTxt.setText("");
                phoneTxt.setText("");
                passwordTxt.setText("");
                userIdTxt.setText("");
                return;
            }

            for (int i = 0; i < z; i++) {
                Ambulance c = cd1.get(i);
                c.getUser_Id();
                if (c.getUser_Id().matches(a)) {
                    if (!phoneTxt.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                        JOptionPane.showMessageDialog(null, " 10 digit phone number");
                        phoneTxt.setText("");
                        return;
                    }
                    if (!passwordTxt.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
                        JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                                + "with one upper case, one lower case, one digit and one special character");
                        passwordTxt.setText("");
                        return;
                    }

                    c.setNameDriver(firstNameTxt.getText());
                    c.setAmbulanceServName(locationTxt.getText());
                    c.setPhNum(phoneTxt.getText());
                    c.setUser_Id(userIdTxt.getText());
                    c.setPwd(passwordTxt.getText());

                }
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String username = userIdTxt.getText();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int t1 = jTable1.getSelectedRow();
        if (t1 >= 0) {
            String a = (String) t.getValueAt(t1, 2);
            System.out.println(a);
            AmbulanceDir bbd = system.getAmbulanceDir();
            ArrayList<Ambulance> cd1 = bbd.getAmbulances();
            int z = cd1.size();
            for (int i = 0; i < z; i++) {
                Ambulance c = cd1.get(i);
                System.out.println(c.getUser_Id());
                if (c.getUser_Id().matches(a)) {
                    cd1.remove(c);
                    System.out.println("delete");
                    system.getUserAccountDirectory().removeccount(c);
                    break;
                }
            }
            populateTable();
            firstNameTxt.setText("");
            locationTxt.setText("");
            phoneTxt.setText("");
            userIdTxt.setText("");
            passwordTxt.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void populateTable() {
        AmbulanceDir AmbulanceDir = system.getAmbulanceDir();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Ambulance customer : AmbulanceDir.getAmbulances()) {
            Object[] row = new Object[5];
            row[0] = customer.getNameDriver();
            row[1] = customer.getAmbulanceServName();
            row[2] = customer.getUser_Id();
            row[3] = customer.getPwd();
            row[4] = customer.getPhNum();
            model.addRow(row);

        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a AmbulanceStation from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            firstNameTxt.setText(table.getValueAt(selectedRow, 0).toString());
            locationTxt.setText(table.getValueAt(selectedRow, 1).toString());
            userIdTxt.setText(table.getValueAt(selectedRow, 2).toString());
            passwordTxt.setText(table.getValueAt(selectedRow, 3).toString());
            phoneTxt.setText(table.getValueAt(selectedRow, 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables
}
