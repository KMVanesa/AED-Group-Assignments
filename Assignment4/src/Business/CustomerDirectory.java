/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Users.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AEDSpring2019
 */
public class CustomerDirectory {
    
    private List<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> supplierList) {
        this.customerList = supplierList;
    }
     public Customer addCustomer(String customerName,long customerContact, String customerEmail,String flightNumber, String seatNumber) {
       Customer customer = new Customer(customerName , customerContact , customerEmail, flightNumber, seatNumber );
       customerList.add(customer);
       return customer;
   }
   
   public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
    }
    
}
