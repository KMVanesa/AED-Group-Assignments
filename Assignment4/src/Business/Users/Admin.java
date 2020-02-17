/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import Business.AirlinerDirectory;

/**
 *
 * @author AEDSpring2019
 */
public class Admin extends User {
    
    public AirlinerDirectory airDir;
    public CustomerDirectory custDir;
    
    public Admin() {
        super("", "", "Admin");
        airDir = new AirlinerDirectory();
        custDir = new CustomerDirectory();
    }

    public AirlinerDirectory getSuppDir() {
        return airDir;
    }

    public void setSuppDir(AirlinerDirectory suppDir) {
        this.airDir = suppDir;
    }

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }
    
    @Override
    public boolean verify(String password){
        return password.equals(getPassword());
    }
    
}
