/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Main.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OPTC_AdminArea.OPTC_WorkArea;
import javax.swing.JPanel;

/**
 *
 * @author chief_kmv
 */
public class OPTC_Admin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new OPTC_WorkArea(userProcessContainer, enterprise);
    }
    
}
