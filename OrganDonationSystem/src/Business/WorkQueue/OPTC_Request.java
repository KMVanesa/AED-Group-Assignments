/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.LabTest.LabTest;
import Business.PatientInfo.PatientInfo;

/**
 *
 * @author chief_kmv
 */
public class OPTC_Request extends WorkRequest {
    private String organ;

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }
    private PatientInfo patient;
    private LabTest labtest;

    public PatientInfo getPatient() {
        return patient;
    }

    public void setPatient(PatientInfo patient) {
        this.patient = patient;
    }

    public LabTest getLabtest() {
        return labtest;
    }

    public void setLabtest(LabTest labtest) {
        this.labtest = labtest;
    }
    
}
