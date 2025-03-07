/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import Business.Enterprise.Enterprise;
import Business.LabTest.LabTest;
import Business.PatientInfo.PatientInfo;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author chief_kmv
 */
public class RegisterPatient extends javax.swing.JPanel {

    /**
     * Creates new form RegisterPatient
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private String path = new String();

    public RegisterPatient(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateType();
        populateGender();
    }

    public void populateType() {

        typeCombo.addItem("Reciever");
        typeCombo.addItem("Donor");
    }

    public void populateGender() {

        genderTxt.addItem("Male");
        genderTxt.addItem("Female");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        weightTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        typeCombo = new javax.swing.JComboBox<>();
        dobPicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ssnTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextArea();
        genderTxt = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Upload = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterBtn.setBackground(new java.awt.Color(255, 159, 28));
        RegisterBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        RegisterBtn.setText("Register Patient");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        jButton2.setBackground(new java.awt.Color(247, 23, 53));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Go-back-icon.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, 120, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Gender");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 50, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Weight");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        weightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTxtActionPerformed(evt);
            }
        });
        add(weightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 110, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 110, -1));

        add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 110, -1));
        add(dobPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 260, 170, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Date of Birth");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("SSN:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 50, -1));
        add(ssnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 110, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Email ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 110, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Address:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        addressTxt.setColumns(20);
        addressTxt.setRows(5);
        jScrollPane1.setViewportView(addressTxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 110, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Patient Image:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        Upload.setBackground(new java.awt.Color(65, 234, 212));
        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });
        add(Upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        imageLabel.setText("No Image Uploaded");
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void weightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        PatientInfo patient = new PatientInfo();
        DoctorRequest req = new DoctorRequest();
        LabTest labtest = new LabTest();

        try {
            String email = emailTxt.getText();
            if (email == null || email.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (Pattern.matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$", email) == false) {
                throw new Exception("Please enter valid email id");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Email is Empty");
            emailTxt.setBorder(new LineBorder(Color.RED, 2));
            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Email is invalid");
            emailTxt.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        try {
            String ssn = ssnTxt.getText();
            if (ssn == null || ssn.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (Pattern.matches("^\\d{3}-\\d{2}-\\d{4}$", ssn) == false) {
                throw new Exception("Please enter valid email id");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " ssn is Empty");
            ssnTxt.setBorder(new LineBorder(Color.RED, 2));
            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ssn is invalid");
            ssnTxt.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        try {
            String ssn = ssnTxt.getText();
            if (ssn == null || ssn.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (Pattern.matches("^\\d{3}-\\d{2}-\\d{4}$", ssn) == false) {
                throw new Exception("Please enter valid email id");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " ssn is Empty");
            ssnTxt.setBorder(new LineBorder(Color.RED, 2));
            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ssn is invalid");
            ssnTxt.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        try {
            if (nameTxt.getText() == null || nameTxt.getText().isEmpty()
                    || addressTxt.getText() == null || addressTxt.getText().isEmpty() || weightTxt.getText() == null || weightTxt.getText().isEmpty()) {
                throw new NullPointerException("User Name field is Empty");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Enter all credentials");
            return;
        }

        try {
            if (Integer.parseInt(weightTxt.getText()) > 200) {
                throw new Exception("Please enter valid weight");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            weightTxt.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        patient.setName(nameTxt.getText());
        patient.setSsn(ssnTxt.getText());
        patient.setDob(dobPicker.getDate());
        patient.setGender((String) genderTxt.getSelectedItem());
        patient.setWeight(weightTxt.getText());
        patient.setAddress(addressTxt.getText());
        patient.setEmail(emailTxt.getText());
        patient.setImage(path);
        patient.setType((String) typeCombo.getSelectedItem());
        labtest.setTestResult("Sent to Lab");
        req.setPatient(patient);
        req.setLabtest(labtest);
        req.setStatus("Awaiting");
        userAccount.getWorkQueue().addRequest(req);
        JOptionPane.showMessageDialog(null, "Patient Registered Successfully");
        nameTxt.setText("");
        nameTxt.setBorder(new LineBorder(Color.GREEN, 1));
        addressTxt.setText("");
        addressTxt.setBorder(new LineBorder(Color.GREEN, 1));
        weightTxt.setText("");
        weightTxt.setBorder(new LineBorder(Color.GREEN, 1));
        emailTxt.setText("");
        emailTxt.setBorder(new LineBorder(Color.GREEN, 1));
        ssnTxt.setText("");
        ssnTxt.setBorder(new LineBorder(Color.GREEN, 1));
        dobPicker.setDate(null);
        imageLabel.setText("No Image Uploaded");
        imageLabel.setIcon(null);
        
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorMainPanel dwjp = (DoctorMainPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = chooser.showOpenDialog(null);
        if (i == chooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getAbsolutePath();
            imageLabel.setText("Image Uploaded");
        } else {
            JOptionPane.showMessageDialog(null, "No file Selected");
        }
        ImageIcon image = new ImageIcon(path);
        image.setImage(image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        imageLabel.setIcon(image);
    }//GEN-LAST:event_UploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JButton Upload;
    private javax.swing.JTextArea addressTxt;
    private org.jdesktop.swingx.JXDatePicker dobPicker;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> genderTxt;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField ssnTxt;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
