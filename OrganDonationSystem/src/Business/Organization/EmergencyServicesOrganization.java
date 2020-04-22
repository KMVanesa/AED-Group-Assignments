/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EmergencySeriveAdminRole;
import Business.Role.EmergencyServicesRole;
import Business.Role.HospitalAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chief_kmv
 */
public class EmergencyServicesOrganization extends Organization {

    public EmergencyServicesOrganization() {
        super(Organization.Type.EmergencyServices.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyServicesRole());
        roles.add(new EmergencySeriveAdminRole());
        return roles;
    }
    
}
