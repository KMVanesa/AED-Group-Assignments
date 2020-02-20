/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;


import Business.AirlinerDirectory;
import Business.FlightDirectory;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KMV
 */
public class Customer {
     String customerName;
    long customerContact;
    String customerEmail;
    private String seatNumber;
    private String flightNumber;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public ArrayList<AirlinerDirectory> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<AirlinerDirectory> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    private ArrayList<AirlinerDirectory> airlinerDirectory;

    public Customer(String customerName,long customerContact, String customerEmail,String flightNumber, String seatNumber){
       // airlinerDirectory = new ArrayList<>(); 
        this.customerName =customerName ;
        this.customerEmail = customerEmail;
        this.customerContact = customerContact;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        
    }
     @Override
    public String toString() {
        return customerName;
    }

   
   
    
}
