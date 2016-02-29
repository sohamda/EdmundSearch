package com.capgemini.edmund.search;

import com.capgemini.edmund.search.api.CallAPI;

import com.car.api.make.Make;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoredMakes {
    
    private static StoredMakes instance = null;
    
    private List<Make> makes = new ArrayList<>(); 
    
    protected StoredMakes() {
        super();
    }
    
    public static StoredMakes getInstance() {
      if(instance == null) {
         instance = new StoredMakes();
      }
      return instance;
    }

    public List<Make> getMakes() {
        if(makes.isEmpty()) {
            CallAPI callMakesAPI = CallAPI.getInstance();
            try {
                Collections.addAll(makes, callMakesAPI.callMakesApi().getMakes()); 
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            } 
        }
        return makes;
    }
    
    public Make getMake(String makeName) {
        Make makeToReturn = null;
        for(Make make : getMakes()) {
            if(make.getName().equalsIgnoreCase(makeName)) {
                makeToReturn = make;
            }
        }
        return makeToReturn;
    }
}
