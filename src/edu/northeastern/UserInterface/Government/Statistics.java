/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.Government;

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.Pharma.Pharma;
import edu.northeastern.Business.Pharma.PharmaDirectory;
import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.Business.Vac.VacDirectory;
import edu.northeastern.Business.Vac.Vaccinations;
import edu.northeastern.Business.WorkQueue.OutbreakTracer;
import edu.northeastern.Business.WorkQueue.OutbreakTracerDir;
import edu.northeastern.Business.WorkQueue.VacRequest_Dir;
import edu.northeastern.Business.WorkQueue.VacRequest;
import edu.northeastern.Utility.PieChart;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author satyajitdas
 */
public class Statistics extends javax.swing.JPanel {

    
    private UserAcc userAcc;
    private EcoSystem system;
//    private JPanel container;
    /**
     * Creates new form Statistics
     * @param userAcc
     * @param ecosystem
     */    
    public Statistics( UserAcc userAcc,EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.userAcc = userAcc;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        positivityStats = new javax.swing.JButton();
        vaccStats = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1110, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        positivityStats.setBackground(new java.awt.Color(10, 132, 255));
        positivityStats.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        positivityStats.setForeground(new java.awt.Color(255, 255, 255));
        positivityStats.setText("Approve Request");
        positivityStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivityStatsActionPerformed(evt);
            }
        });
        add(positivityStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 180, 39));

        vaccStats.setBackground(new java.awt.Color(10, 132, 255));
        vaccStats.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        vaccStats.setForeground(new java.awt.Color(255, 255, 255));
        vaccStats.setText("Vaccination Statistics");
        vaccStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccStatsActionPerformed(evt);
            }
        });
        add(vaccStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void positivityStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivityStatsActionPerformed
        // TODO add your handling code here:
        try {
            OutbreakTracerDir vaccinationDirectory = system.getOutbreakStatusDir();
            ArrayList<OutbreakTracer> c1= vaccinationDirectory.getOutbreakLog();

            int positiveCases=0;
            int negativeCases=0;
            for(int i=0;i<c1.size();i++)
            {

                OutbreakTracer c2 = c1.get(i);
                if(c2.getResult().matches("Positive"))
                {
                    positiveCases += 1;
                }
                else if(c2.getResult().matches("Negative"))
                {
                    negativeCases += 1;
                }

            }
            negativeCases = (negativeCases + 1) * 100000;
            positiveCases = (positiveCases + 1) * 100000;
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("Positive Case", positiveCases);
            pieDataset.setValue("Negative Case", negativeCases);

            PieChart pieChart = new PieChart("Positibity Statistics",pieDataset);
            ChartPanel test = pieChart.getChartPanel();
            JFrame frame = new JFrame();
            frame.add(test);
            frame.pack();
            frame.setVisible(true);
            
        } catch(Exception ex) {
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_positivityStatsActionPerformed

    private void vaccStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccStatsActionPerformed
        // TODO add your handling code here:
      try {
            VacRequest_Dir vacRequestDir = system.getVaccReqDir();
            ArrayList<VacRequest> requests = vacRequestDir.getRequests();

            int vaccinated = 0;
            int awaiting = 0;
            for(int i=0;i<requests.size();i++)
            {

                VacRequest vacReq = requests.get(i);
                if(vacReq.getStatus().matches("Done"))
                {
                    vaccinated++;
                }
                else
                {
                    awaiting++;
                }

            }
            vaccinated = (vaccinated + 1) * 100000;
            awaiting = (awaiting + 1) * 100000;
            int total = 60000000;
            int unvaccinated = total - (vaccinated + awaiting);
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("Vaccinated", vaccinated);
            pieDataset.setValue("Awaiting", awaiting);
            pieDataset.setValue("Unvaccinated", awaiting);

            PieChart pieChart = new PieChart("Vaccination Statistics",pieDataset);
            ChartPanel test = pieChart.getChartPanel();
            JFrame frame = new JFrame();
            frame.add(test);
            frame.pack();
            frame.setVisible(true);
            
        } catch(Exception ex) {
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_vaccStatsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton positivityStats;
    private javax.swing.JButton vaccStats;
    // End of variables declaration//GEN-END:variables
}