/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AEDSpring2019
 */
public class FlightDirectory {
    
    private List<Flight> flightList;// = new ArrayList<Product>();
    
    public FlightDirectory(){
        flightList = new ArrayList<>();
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

   
    
    
    
}
