/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.bean;

import java.util.LinkedList;

/**
 *
 * @author M7
 */
public class OfferDateRange {

    private LinkedList<String> travelStartDate;
    private LinkedList<String> travelEndDate;

    private String lengthOfStay;

    public String getTravelStartDate() {
//        return travelStartDate;
        return travelStartDate.get(0) + "-" + travelStartDate.get(1) + "-" + travelStartDate.get(2);
    }

    public void setTravelStartDate(LinkedList<String> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public String getTravelEndDate() {
//        return travelEndDate;
        return travelEndDate.get(0) + "-" + travelEndDate.get(1) + "-" + travelEndDate.get(2);
    }

    public void setTravelEndDate(LinkedList<String> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

}
