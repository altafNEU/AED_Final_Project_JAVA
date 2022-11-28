/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.BloodBank;

import Business.BloodBank.BloodWork;
import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import Business.WorkQueue.DonateBlood;
import Business.WorkQueue.DonateBlood_Dir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altaf
 */
public class UserAppJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserAppJPanel
     */
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;

    public UserAppJPanel(JPanel userProcessContainer, EcoSystem system, UserAcc userAcc) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        displayTable();
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
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAppDetails = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        collectBlood = new javax.swing.JButton();
        cancelApp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wbcTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbcTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cholestrolTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        platletTxt = new javax.swing.JTextField();
        bloodType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Manage Appointments");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAppDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAppDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAppDetailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAppDetails);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        collectBlood.setBackground(new java.awt.Color(10, 132, 255));
        collectBlood.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        collectBlood.setForeground(new java.awt.Color(255, 255, 255));
        collectBlood.setText("Collect Blood ");
        collectBlood.setBorder(null);
        collectBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectBloodActionPerformed(evt);
            }
        });
        jPanel9.add(collectBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 200, 39));

        cancelApp.setBackground(new java.awt.Color(255, 55, 95));
        cancelApp.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelApp.setForeground(new java.awt.Color(255, 255, 255));
        cancelApp.setText("Cancel Appointment");
        cancelApp.setBorder(null);
        cancelApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAppActionPerformed(evt);
            }
        });
        jPanel9.add(cancelApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 190, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Blood Type");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, -1));

        wbcTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        wbcTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wbcTxtKeyPressed(evt);
            }
        });
        jPanel9.add(wbcTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 420, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("WBC (m/mm3)");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, -1));

        rbcTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        rbcTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbcTxtKeyPressed(evt);
            }
        });
        jPanel9.add(rbcTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("RBC  (m/mm3)");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, -1));

        cholestrolTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        cholestrolTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cholestrolTxtKeyPressed(evt);
            }
        });
        jPanel9.add(cholestrolTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 420, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Cholestrol");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText(" Platelets (m/mm3)");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 220, -1));

        platletTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        platletTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                platletTxtKeyPressed(evt);
            }
        });
        jPanel9.add(platletTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 420, 40));

        bloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        bloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeActionPerformed(evt);
            }
        });
        jPanel9.add(bloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 420, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblAppDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAppDetailsMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblAppDetailsMouseClicked

    private void collectBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectBloodActionPerformed
        // TODO add your handling code here:
        collectBlood();
    }//GEN-LAST:event_collectBloodActionPerformed

    private void cancelAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAppActionPerformed
        // TODO add your handling code here:
        canelBloodDonaApp();
    }//GEN-LAST:event_cancelAppActionPerformed

    private void bloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bloodTypeActionPerformed

    private void wbcTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wbcTxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            wbcTxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
        } else {
            wbcTxt.setEditable(true);
        }
    }//GEN-LAST:event_wbcTxtKeyPressed

    private void rbcTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbcTxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            rbcTxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
        } else {
            rbcTxt.setEditable(true);
        }
    }//GEN-LAST:event_rbcTxtKeyPressed

    private void cholestrolTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cholestrolTxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            cholestrolTxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
        } else {
            cholestrolTxt.setEditable(true);
        }
    }//GEN-LAST:event_cholestrolTxtKeyPressed

    private void platletTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_platletTxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            platletTxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
        } else {
            platletTxt.setEditable(true);
        }
    }//GEN-LAST:event_platletTxtKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bloodType;
    private javax.swing.JButton cancelApp;
    private javax.swing.JTextField cholestrolTxt;
    private javax.swing.JButton collectBlood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField platletTxt;
    private javax.swing.JTextField rbcTxt;
    private javax.swing.JTable tblAppDetails;
    private javax.swing.JTextField wbcTxt;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        tblAppDetails.setModel(new DefaultTableModel(null, new String[]{"ID", "Center", "Status", "Date", "Time"}));
        DonateBlood_Dir donateB = system.getDonateBloodDir();
        ArrayList<DonateBlood> donList = donateB.getDonors();

        int l = donList.size();
        //System.out.println("size"+u);
        for (int i = 0; i < l; i++) {
            DonateBlood bloodDonor = donList.get(i);
            BloodWork bw = (BloodWork) (userAcc);

            if (bloodDonor.getBlood_bankName().matches(bw.getUserNames())) {

                DefaultTableModel table = (DefaultTableModel) tblAppDetails.getModel();
                String s1 = String.valueOf(bloodDonor.getId());

                String s2[] = {s1, bloodDonor.getFirstName(), bloodDonor.getStatus(), bloodDonor.getAppoinmentDate(), bloodDonor.getAppoinmentTime()};
                table.addRow(s2);

            }

        }

    }

    private void collectBlood() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (wbcTxt.getText().isEmpty() || rbcTxt.getText().isEmpty() || cholestrolTxt.getText().isEmpty() || platletTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter all the value!!");
        } else {
            DefaultTableModel table = (DefaultTableModel) tblAppDetails.getModel();
            int selectedRow = tblAppDetails.getSelectedRow();
            if (selectedRow >= 0) {
                int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

                DonateBlood_Dir donateDir = system.getDonateBloodDir();
                ArrayList<DonateBlood> listDonate = donateDir.getDonors();
                int l = listDonate.size();
                BloodWork bw = (BloodWork) (userAcc);
                for (int i = 0; i < l; i++) {
                    DonateBlood bloodDonate = listDonate.get(i);
                    if (sRow == bloodDonate.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                        if (bloodDonate.getStatus().matches("Appoinment Booked")) {
                            bloodDonate.setStatus("Blood Collected");
                            bloodDonate.setBloodGroup(bloodType.getSelectedItem().toString());
                            bloodDonate.setRBC(Integer.parseInt(rbcTxt.getText()));
                            bloodDonate.setWBC(Integer.parseInt(wbcTxt.getText()));
                            bloodDonate.setCholesterol(Integer.parseInt(cholestrolTxt.getText()));
                            bloodDonate.setPlatelets(Integer.parseInt(platletTxt.getText()));
                            JOptionPane.showMessageDialog(null, "Successfully added blood donation details!!");
                            rbcTxt.setText(" ");
                            wbcTxt.setText(" ");
                            platletTxt.setText(" ");
                            cholestrolTxt.setText(" ");

                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect Action!!");
                        }
                    }
                }
                tblAppDetails.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Date", "Time"}));
                displayTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a Row!!");
            }
        }

    }

    private void canelBloodDonaApp() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DefaultTableModel table = (DefaultTableModel) tblAppDetails.getModel();
        int selectedRow = tblAppDetails.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            DonateBlood_Dir donateBlood = system.getDonateBloodDir();
            ArrayList<DonateBlood> donateList = donateBlood.getDonors();
            int l = donateList.size();
            BloodWork bw = (BloodWork) (userAcc);
            for (int i = 0; i < l; i++) {
                DonateBlood dBlood = donateList.get(i);
                if (sRow == dBlood.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (dBlood.getStatus().matches("Appoinment Booked")) {
                        dBlood.setStatus("Cancelled");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect action!!");
                    }

                }
            }
            tblAppDetails.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Date", "Time"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }

    }
}
