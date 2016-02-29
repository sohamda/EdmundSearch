package com.capgemini.edmund.search;

import com.car.api.search.SearchObject;
import com.car.api.style.Style;

import java.util.ArrayList;
import java.util.List;

public class SearchHelper {
    public SearchHelper() {
        super();
    }
    
    public List<Style> filter(SearchObject searchObject) {
        return filterOnTransmissionType(searchObject.getTransmissionType(), 
                            filterOnVehicleStyle(searchObject.getVehicleStyle(),
                                filterOnFuelType(searchObject.getFuelType(),
                                    filterOnMake(searchObject.getMake(), StoredStyles.getInstance().getStyles(searchObject.getMake())))));
    }
        
    public List<Style> filterOnMake(String makeName, List<Style> stylesToFilter) {
        
        List<Style> filteredStyles = new ArrayList<>();
        for(Style style : stylesToFilter) {
            if(style.getMake().getName().equalsIgnoreCase(makeName)) {
                filteredStyles.add(style);
            }
        }        
        return filteredStyles;
    }
    
    public List<Style> filterOnFuelType(String fuelType, List<Style> stylesToFilter) {
    
        List<Style> filteredStyles = new ArrayList<>();
        for(Style style : stylesToFilter) {
            if(style.getEngine().getFuelType().equalsIgnoreCase(fuelType)) {
                filteredStyles.add(style);
            }
        }        
        return filteredStyles;    
    }
    
    public List<Style> filterOnVehicleStyle(String vehicleStyle, List<Style> stylesToFilter) {
    
        List<Style> filteredStyles = new ArrayList<>();
        for(Style style : stylesToFilter) {
            if(style.getCategories().getVehicleStyle().equalsIgnoreCase(vehicleStyle)) {
                filteredStyles.add(style);
            }
        }        
        return filteredStyles;    
    }
    
    public List<Style> filterOnTransmissionType(String transmissionType, List<Style> stylesToFilter) {
    
        List<Style> filteredStyles = new ArrayList<>();
        for(Style style : stylesToFilter) {
            if(style.getTransmission().getTransmissionType().equalsIgnoreCase(transmissionType)) {
                filteredStyles.add(style);
            }
        }        
        return filteredStyles;    
    }
}
