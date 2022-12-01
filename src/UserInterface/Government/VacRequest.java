/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Government;

import Business.EcoSystem;
import Business.Pharma.Pharma;
import Business.Pharma.PharmaDirectory;
import Business.UserAcc.UserAcc;
import Business.Vac.VacDirectory;
import Business.Vac.Vaccinations;
import Business.WorkQueue.VacRequest_Dir;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author satyajitdas
 */
public class VacRequest extends javax.swing.JPanel {

    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    /**
     * Creates new form VacRequest
     * @param userProcessContainer
     * @param userAcc
     * @param ecosystem
     */
    public VacRequest(JPanel userProcessContainer, UserAcc userAcc,EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
//        Time();
        populate_table();
        PharmaDirectory pharmaDir = system.getPharmaDir();
        ArrayList<Pharma> pharmaList = pharmaDir.getPharmaArrayList();
        int size= pharmaList.size();
        for(int i=0;i<size;i++)
        {
            Pharma pharma= pharmaList.get(i);
            jComboBox1.addItem(pharma.getPharmaName());
        }
        
        
        VacDirectory vacDir = system.getVaccDir();
        ArrayList<Vaccinations> vaccineList = vacDir.getVaccinationList();
        int vacSize = vaccineList.size();
        for(int i=0;i<vacSize;i++)
        {
            Vaccinations vaccination = vaccineList.get(i);
            jComboBox2.addItem(vaccination.getName());
        }
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
        jPanel7 = new javax.swing.JPanel();
        approveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Request for Vaccination");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approveButton.setBackground(new java.awt.Color(10, 132, 255));
        approveButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        approveButton.setForeground(new java.awt.Color(255, 255, 255));
        approveButton.setText("Approve Request");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });
        jPanel7.add(approveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 180, 39));

        cancelButton.setBackground(new java.awt.Color(255, 55, 95));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel Request");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel7.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 200, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Pharmacy");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, -1));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Vaccination");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Date");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Time");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 220, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 420, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Astrazeneca", "Jhonson", "Pfizer", "GlaxoSmithKline", "Moderna" }));
        jPanel7.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 420, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00" }));
        jPanel7.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 420, 40));
        jPanel7.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 400, 36));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            if(jDateChooser1.getDate()!=null)
            {
        int s=Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
         VacRequest_Dir vacReqDir= system.getVaccReqDir();
        ArrayList<Business.WorkQueue.VacRequest> vaccines =vacReqDir.getRequests();
        int size = vaccines.size();
        for(int i=0;i<size;i++)
        {
            Business.WorkQueue.VacRequest vaccine = vaccines.get(i);
            if(s==vaccine.getVacId()/*&&vaccine.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(vaccine.getStatus().equals("Cancel")||vaccine.getStatus().equals("Done")||vaccine.getStatus().equals("Approved"))
                {
                    JOptionPane.showMessageDialog(null,"wrong move");
                }
                else
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String d1 = sdf.format(jDateChooser1.getDate());
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
                    LocalDateTime d2 = LocalDateTime.now();
                    if(d1.compareTo(d2.toString()) >= 0) {
                    vaccine.setPharmacy(jComboBox1.getSelectedItem().toString());
                vaccine.setVaccination(jComboBox2.getSelectedItem().toString());
                 
                vaccine.setDate(d1);
                vaccine.setTime(jComboBox3.getSelectedItem().toString());
                vaccine.setStatus("Approved");
                 JOptionPane.showMessageDialog(null, "Request Approved!!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Appointment Available from Tomorrow");
                    }
                }
                
            }
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Covid-19","Diabetese","Medication","Blood Thinner","Status"}));
        populate_table();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Pick A date");
            }
        
    }                                        
else
        {
            JOptionPane.showMessageDialog(null,"Select a Row");
        }
    }//GEN-LAST:event_approveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
         DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int rowId =Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        
        VacRequest_Dir vacReqDir = system.getVaccReqDir();
        ArrayList<Business.WorkQueue.VacRequest> requests= vacReqDir.getRequests();
        int size = requests.size();
        for(int i=0;i<size;i++)
        {
            Business.WorkQueue.VacRequest request = requests.get(i);
            if(rowId == request.getVacId())
            {
                if(request.getStatus().equals("Cancel")||request.getStatus().equals("Done"))
                {
                    JOptionPane.showMessageDialog(null,"Not Allowed");
                }
                else
                {                
                   request.setStatus("Cancel");
                }
                
            }
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Covid-19","Diabetese","Medication","Blood Thinner","Status"}));
        populate_table();
        
    }                                        
else
        {
            JOptionPane.showMessageDialog(null,"Select a Row");
        }

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void populate_table()
    {
        VacRequest_Dir vacReqDir= system.getVaccReqDir();
        ArrayList<Business.WorkQueue.VacRequest> vaccines =vacReqDir.getRequests();
        int size = vaccines.size();
        
        for(int i=0;i<size;i++)
        {
            Business.WorkQueue.VacRequest vaccine = vaccines.get(i);
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(vaccine.getVacId());    
                String s[]={s1,vaccine.getFirst_name(),vaccine.getDisease(),vaccine.getDiabetes(),vaccine.getMedication(),vaccine.getBloodThinner(),vaccine.getStatus()};
                table.addRow(s);
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
