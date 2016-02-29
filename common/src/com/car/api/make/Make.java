
package com.car.api.make;

import java.util.ArrayList;
import java.util.List;

public class Make {

    private Integer id;
    private String name;
    private String niceName;
    private Model[] models;

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
     *     The models
     */
    public Model[] getModels() {
        return models;
    }

    /**
     * 
     * @param models
     *     The models
     */
    public void setModels(Model[] models) {
        this.models = models;
    }

}
