/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expedia.url;

import com.expedia.bean.HotelDealsParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author M7
 */
public class HotelDealReader {
    
    
    public HotelDealsParser getHotelDeals() {
        HotelDealsParser parser = null;
        try {
            String url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
            ObjectMapper objectMapper = new ObjectMapper();
            parser = objectMapper.readValue(new URL(url), HotelDealsParser.class);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(HotelDealReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HotelDealReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parser;
    }
    
}
