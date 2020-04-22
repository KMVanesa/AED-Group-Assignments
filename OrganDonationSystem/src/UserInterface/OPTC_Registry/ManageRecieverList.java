/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OPTC_Registry;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OPTC_Enterprise;
import Business.Main.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.Reciever;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author chief_kmv
 */
public class ManageRecieverList extends javax.swing.JPanel {

    /**
     * Creates new form ManageRecieverList
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private OPTC_Enterprise enterprise;
    private EcoSystem business;

    public ManageRecieverList(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.account = account;
        this.enterprise = (OPTC_Enterprise) enterprise;
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        int k = 0;
        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
            // System.out.println(user.getRole().toString());
            if (user.getRole().toString().equals("Business.Role.RecieverRole")) {
                Object[] row = new Object[5];
                row[0] = k;
                row[1] = user;
                row[2] = ((Reciever) user).getInfo().getName();
                row[3] = ((Reciever) user).getInfo().getSsn();
                row[4] = user.getPassword();
                model.addRow(row);
                k++;
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Waiting Number", "User Name", "Patient Name", "SSN", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 550, 90));

        jButton1.setBackground(new java.awt.Color(255, 159, 28));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("See Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        backJButton.setBackground(new java.awt.Color(247, 23, 53));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Go-back-icon.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));

        jButton2.setText("Show Results on chart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Reciever user = (Reciever) workRequestJTable.getValueAt(selectedRow, 1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestLabTestJPanel", new SeeDetails(user, userProcessContainer));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Infected", new Integer(30));
        pieDataset.setValue("Not Infected", new Integer(50));

        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
        PiePlot p = (PiePlot) chart.getPlot();

        ChartFrame frame = new ChartFrame("pie chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
