/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.bean;

/**
 *
 * @author M7
 */
public class HotelPricingInfo {

    private String averagePriceValue;
    private String totalPriceValue;
    private String crossOutPriceValue;
    private String originalPricePerNight;
    private String percentSavings;
    private boolean drr;

    public String getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(String averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public String getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(String totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public String getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    public void setCrossOutPriceValue(String crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public String getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(String percentSavings) {
        this.percentSavings = percentSavings;
    }

    public boolean isDrr() {
        return drr;
    }

    public void setDrr(boolean drr) {
        this.drr = drr;
    }

}
