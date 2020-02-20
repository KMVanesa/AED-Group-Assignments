/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author AEDSpring2019
 */
public class Flight implements Comparable<Flight>{
    private String flight_name;
    private double price;
    private int num_of_seats;
    private String loc_from;
    private String des_to;
    private String time;

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public int getNum_of_seats() {
        return num_of_seats;
    }

    public void setNum_of_seats(int num_of_seats) {
        this.num_of_seats = num_of_seats;
    }

    public String getLoc_from() {
        return loc_from;
    }

    public void setLoc_from(String loc_from) {
        this.loc_from = loc_from;
    }

    public String getDes_to() {
        return des_to;
    }

    public void setDes_to(String des_to) {
        this.des_to = des_to;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    public Flight(String flight_name, double price) {
        this.flight_name = flight_name;
        this.price = price;
    }

    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Flight o) {
        return this.flight_name.compareTo(o.getFlight_name());
    }

    
}
