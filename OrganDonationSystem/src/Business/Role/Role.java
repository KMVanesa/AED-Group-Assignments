/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.Main.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author chief_kmv
 */
public abstract class Role {
    
     public enum RoleType{
        HospitalAdmin("Hospital Admin"),
        UNOSadmin("United Network of Organ Sharing Admin"),
        OPTCadmin("Organ Procurement and Transplant Center Admin"),
        Reciever("Reciever"),Donor("Donor"),EmergencyServices("Emergency Services"),
        LabAssitant("Lab Assistant"),Doctor("Doctor"),LabAdminRole("Lab Administrator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
