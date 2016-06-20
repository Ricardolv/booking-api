package com.richard.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author richard
 */
@Entity
public class HotelBooking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    
    private String name;
    private double price;
    private int nbOfNights;

    
    public HotelBooking() {
        
    }
    
    public HotelBooking(String name, double price, int nbOfNights) {
        this.name = name;
        this.price = price;
        this.nbOfNights = nbOfNights;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public long getId() {
        return id;
    }
    
    public double getTotalPrice() {
        return price * nbOfNights;
    }
    
}
