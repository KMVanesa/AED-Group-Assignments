/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.LabTest.LabTest;
import Business.PatientInfo.PatientInfo;

/**
 *
 * @author chief_kmv
 */
public class Donor extends UserAccount {
     private PatientInfo info;
    private LabTest labTest;
    private String message;
    private boolean status=true;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PatientInfo getInfo() {
        return info;
    }

    public void setInfo(PatientInfo info) {
        this.info = info;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

   
}
