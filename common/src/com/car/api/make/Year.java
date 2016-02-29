
package com.car.api.make;

import java.util.ArrayList;
import java.util.List;

public class Year {

    private Integer id;
    private Integer year;
    private String[] states;
    
    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The states
     */
    public String[] getStates() {
        return states;
    }

    /**
     * 
     * @param states
     *     The states
     */
    public void setStates(String[] states) {
        this.states = states;
    }

}
