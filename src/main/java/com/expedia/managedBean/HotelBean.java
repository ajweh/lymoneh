/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.managedBean;

import com.expedia.bean.HotelDealsParser;
import com.expedia.url.HotelDealReader;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author M7
 */
@ManagedBean(name="hotelBean")
@ViewScoped
public class HotelBean implements Serializable{
    
    
    private HotelDealsParser deals;

    public HotelDealsParser getDeals() {
        return deals;
    }

    public void setDeals(HotelDealsParser deals) {
        this.deals = deals;
    }

    
      @PostConstruct
    public void init() {
        deals = readHotelDeal();
    } 


    private HotelDealsParser readHotelDeal() {
         return new HotelDealReader().getHotelDeals();
    }
    
    
}
