/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_ManageCustomer;


import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Yash
 */
public class CustomersMngArea extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    public CustomersMngArea(JPanel cardSequenceJPanel,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
 
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageCustomers = new javax.swing.JLabel();
        btnBookFlights = new javax.swing.JButton();
        btnViewPastBookings = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1111, 765));

        lblManageCustomers.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(78, 114, 175));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("MANAGE CUSTOMERS");

        btnBookFlights.setBackground(new java.awt.Color(245, 245, 246));
        btnBookFlights.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBookFlights.setForeground(new java.awt.Color(78, 114, 175));
        btnBookFlights.setText("Book Flights");
        btnBookFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightsActionPerformed(evt);
            }
        });

        btnViewPastBookings.setBackground(new java.awt.Color(245, 245, 246));
        btnViewPastBookings.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnViewPastBookings.setForeground(new java.awt.Color(78, 114, 175));
        btnViewPastBookings.setText("View Past Bookings");
        btnViewPastBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPastBookingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblManageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(btnViewPastBookings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBookFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblManageCustomers)
                .addGap(116, 116, 116)
                .addComponent(btnViewPastBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btnBookFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightsActionPerformed
        // TODO add your handling code here:
        FlightSearchArea panel = new FlightSearchArea(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("BookFlightWorkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);

    }//GEN-LAST:event_btnBookFlightsActionPerformed

    private void btnViewPastBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPastBookingsActionPerformed
        // TODO add your handling code here:
        ManageBookings panel = new ManageBookings(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("ManagePastBookingsJPanel" , panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnViewPastBookingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookFlights;
    private javax.swing.JButton btnViewPastBookings;
    private javax.swing.JLabel lblManageCustomers;
    // End of variables declaration//GEN-END:variables
}
