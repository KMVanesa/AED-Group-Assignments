/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chief_kmv
 */
public class UNOS_Enterprise extends Enterprise {

    public UNOS_Enterprise(String name) {
        super(name, EnterpriseType.UNOS);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
