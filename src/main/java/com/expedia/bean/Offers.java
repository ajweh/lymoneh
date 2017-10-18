/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
/**
 *
 * @author M7
 */
public class Offers {

    @JsonProperty("Hotel")
    private ArrayList<Hotel> hotel;
    
    public ArrayList<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(ArrayList<Hotel> hotel) {
        this.hotel = hotel;
    }

     
}
