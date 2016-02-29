
package com.car.api.make;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private String id;
    private String name;
    private String niceName;
    private Year[] years;
    private String[] states;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The niceName
     */
    public String getNiceName() {
        return niceName;
    }

    /**
     * 
     * @param niceName
     *     The niceName
     */
    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    /**
     * 
     * @return
     *     The years
     */
    public Year[] getYears() {
        return years;
    }

    /**
     * 
     * @param years
     *     The years
     */
    public void setYears(Year[] years) {
        this.years = years;
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
