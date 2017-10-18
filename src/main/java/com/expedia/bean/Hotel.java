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
public class Hotel {

  
private OfferDateRange offerDateRange;
private Destination destination;
private HotelInfo hotelInfo;
@JsonProperty("hotelUrgencyInfo")
private HotelUrgencyInfo hotelUrgencyInfo;
private HotelPricingInfo hotelPricingInfo;
private HotelUrls hotelUrls;

    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelUrgencyInfo getUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    public void setUrgencyInfo(HotelUrgencyInfo urgencyInfo) {
        this.hotelUrgencyInfo = urgencyInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

}
