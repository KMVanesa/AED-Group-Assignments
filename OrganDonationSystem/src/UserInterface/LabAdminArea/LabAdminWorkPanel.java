/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAdminArea;

import Business.Enterprise.Enterprise;
import Business.Main.EcoSystem;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.DoctorWorkArea.RequestLabTestJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chief_kmv
 */
public class LabAdminWorkPanel extends javax.swing.JPanel {

    /**
     * Creates new form Lab
     */
    private JPanel userProcessContainer;
    private LabOrganization organization;

    private UserAccount userAccount;
    private EcoSystem business;

    public LabAdminWorkPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = (LabOrganization) organization;

        populateRequestTable();
        populateCombo();
    }

    public void populateCombo() {

//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            //System.out.println(organization.toString().equals("Lab Organization"));
//            if (organization instanceof LabOrganization) {
        for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
            System.out.println(user.getRole());
            if (user.getRole().toString().equals("Business.Role.LabAssistantRole")) {
                labJComboBox.addItem(user);
            }
        }
//            }
//        }
    }

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
//            System.out.println(((DoctorRequest) request).getLabAdmin().getUsername());
            if (((DoctorRequest) request).getLabAdmin().getUsername().equals(userAccount.getUsername())) {
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[3] = request.getMessage();
                row[2] = request.getReceiver();
                row[4] = request.getStatus();
                model.addRow(row);
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
        assignWork = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labJComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Doctor", "Lab Assistant", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 610, 100));

        assignWork.setText("Assign Work");
        assignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignWorkActionPerformed(evt);
            }
        });
        add(assignWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel1.setText("Assign Lab Assistant");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, 20));

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        add(labJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignWorkActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            request.setReceiver((UserAccount) labJComboBox.getSelectedItem());
        }
        populateRequestTable();

    }//GEN-LAST:event_assignWorkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignWork;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox labJComboBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
