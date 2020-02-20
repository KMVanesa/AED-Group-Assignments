/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;


import Business.FlightDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer {
     private FlightDirectory directory;
    
    public Customer(String password, String userName) {
      
        directory = new FlightDirectory();
    }

    public FlightDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(FlightDirectory directory) {
        this.directory = directory;
    }

   
    
}
