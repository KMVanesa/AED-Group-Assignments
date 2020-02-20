/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;


import Business.CustomerDirectory;
import Business.AirlinerDirectory;

/**
 *
 * @author KMV
 */
public class Admin  {
    
    public AirlinerDirectory airDir;
    public CustomerDirectory custDir;
    
    public Admin() {
       
        this.airDir = new AirlinerDirectory();
        this.custDir = new CustomerDirectory();
    }

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }

    

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }
    
   
}
