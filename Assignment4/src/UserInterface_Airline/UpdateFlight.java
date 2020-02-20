/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_Airline;

import Business.Users.Admin;
import Business.Users.Airliner;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Abhi
 */
public class UpdateFlight extends javax.swing.JPanel {

    /**
     * Creates new form UpdateFlight
     */
    JPanel rightPanel;
    Admin travelAgency;
    Airliner airliner;
    public UpdateFlight(JPanel rightPanel,Admin travelAgency){
        this.rightPanel=rightPanel;
        this.travelAgency=travelAgency;
        initComponents();
    }
    public boolean checkString(String string){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(string);
        boolean b = m.matches();
        return b;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblHeadquarters = new javax.swing.JLabel();
        txtHeadquarters = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        lblHeading.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(78, 114, 175));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("VIEW AIRLINER DETAILS");

        btnBack.setBackground(new java.awt.Color(245, 245, 246));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(78, 114, 175));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(245, 245, 246));
        txtName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.setEnabled(false);

        lblName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(78, 114, 175));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name");

        lblHeadquarters.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblHeadquarters.setForeground(new java.awt.Color(78, 114, 175));
        lblHeadquarters.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeadquarters.setText("Headquarters");

        txtHeadquarters.setBackground(new java.awt.Color(245, 245, 246));
        txtHeadquarters.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtHeadquarters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHeadquarters.setEnabled(false);

        btnSave.setBackground(new java.awt.Color(245, 245, 246));
        btnSave.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(78, 114, 175));
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(245, 245, 246));
        btnUpdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(78, 114, 175));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of seats:");

        jLabel4.setText("From:");

        jLabel5.setText("To:");

        jLabel6.setText("Time:");

        UpdatejButton.setText("Update Flight");

        locFromjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mumbai", "Surat", "Ahmedabad", "Rajkot", "Hydrabad", "Delhi", "Banglore", "Goa", "" }));

        locTojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mumbai", "Surat", "Ahmedabad", "Rajkot", "Hydrabad", "Delhi", "Banglore", "Goa", "" }));

        timejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Evening", "Night" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdatejButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numofseatjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(flightnamejTextField)
                                .addComponent(pricejTextField))
                            .addComponent(locFromjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locTojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHeadquarters, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHeadquarters, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numofseatjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locFromjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(locTojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(timejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UpdatejButton)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
      rightPanel.remove(this);
       Component[] componentArray = rightPanel.getComponents();
       Component component = componentArray[componentArray.length-1];
       AirlinerScreen panel = (AirlinerScreen) component;
       panel.populateAirlinersTable();
       CardLayout layout = (CardLayout) rightPanel.getLayout();
       layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         String name = txtName.getText();
        String headquarters = txtHeadquarters.getText();
        if(!checkString(name)){
            JOptionPane.showMessageDialog(null, "Please enter valid airliner name");
        }
        else if(!checkString(headquarters)){
            JOptionPane.showMessageDialog(null, "Please enter valid airliner headquarter name");
        }
        else {
 
            airliner.setAirlinerName(name);
            airliner.setAirlinerHeadquaters(headquarters);
            JOptionPane.showMessageDialog(null, "Airliner updated Successfully");
            
        }
        txtName.setEnabled(false);
        txtHeadquarters.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(true);
        txtHeadquarters.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
       
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdatejButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField flightnamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox locFromjComboBox;
    private javax.swing.JComboBox locTojComboBox;
    private javax.swing.JButton logoutjButton;
    private javax.swing.JTextField numofseatjTextField;
    private javax.swing.JTextField pricejTextField;
    private javax.swing.JComboBox timejComboBox;
    // End of variables declaration//GEN-END:variables
}
