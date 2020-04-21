/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.LabTest.LabTest;
import Business.PatientInfo.PatientInfo;
import Business.UserAccount.UserAccount;

/**
 *
 * @author chief_kmv
 */
public class DoctorRequest extends WorkRequest{
    private PatientInfo patient;
    private LabTest labtest;

    public LabTest getLabtest() {
        return labtest;
    }

    public void setLabtest(LabTest labtest) {
        this.labtest = labtest;
    }

    public PatientInfo getPatient() {
        return patient;
    }

    public void setPatient(PatientInfo patient) {
        this.patient = patient;
    }
    private UserAccount LabAdmin;

    public UserAccount getLabAdmin() {
        return LabAdmin;
    }

    public void setLabAdmin(UserAccount LabAdmin) {
        this.LabAdmin = LabAdmin;
    }
    
}
