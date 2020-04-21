/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTest;

/**
 *
 * @author chief_kmv
 */
public class LabTest {

    private String testResult;
    private String bloodType;
    private String tissueType;
    private String bloodSugar;
    private String infectiousDiseases;

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getTissueType() {
        return tissueType;
    }

    public void setTissueType(String tissueType) {
        this.tissueType = tissueType;
    }

    public String getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(String bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getInfectiousDiseases() {
        return infectiousDiseases;
    }

    public void setInfectiousDiseases(String infectiousDiseases) {
        this.infectiousDiseases = infectiousDiseases;
    }

    public String getTestResult() {
        if(testResult == null){
            return null;
        }
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

}
