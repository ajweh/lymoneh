/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author M7
 */
public class HotelDealsParser {
    
    private OfferInfo offerInfo;
    private UserInfo userInfo;      
    private Offers offers; 
    
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

     @JsonProperty("offers")
    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

   
}
