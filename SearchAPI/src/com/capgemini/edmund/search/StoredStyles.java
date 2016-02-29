package com.capgemini.edmund.search;

import com.capgemini.edmund.search.api.CallAPI;

import com.car.api.make.Make;
import com.car.api.make.Model;
import com.car.api.make.Year;
import com.car.api.style.Style;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoredStyles {

    private static StoredStyles instance = null;

    private List<Style> styles = new ArrayList<>();

    protected StoredStyles() {
        super();
    }

    public static StoredStyles getInstance() {
        if (instance == null) {
            instance = new StoredStyles();
        }
        return instance;
    }

    public List<Style> getStyles(String makeName) {
        
        Make make = StoredMakes.getInstance().getMake(makeName);
        try {
            CallAPI callMakesAPI = CallAPI.getInstance();
            for (Model model : make.getModels()) {
                for (Year year : model.getYears()) {
                    Collections.addAll(styles, callMakesAPI.callStyleApi(make.getNiceName(), model.getNiceName(), year.getYear()).getStyles());
                }
            }
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return styles;
    }
}
