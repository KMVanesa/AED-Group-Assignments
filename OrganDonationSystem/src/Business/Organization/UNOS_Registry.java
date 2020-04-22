/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UNOS_Employee;
import java.util.ArrayList;

/**
 *
 * @author chief_kmv
 */
public class UNOS_Registry extends Organization{
    public UNOS_Registry(){
        super(Organization.Type.OrganDonor.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new UNOS_Employee());
        
        return roles;
    }
}
