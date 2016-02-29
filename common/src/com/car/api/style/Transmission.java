
package com.car.api.style;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transmission {

    private String id;
    private String name;
    private String equipmentType;
    private String transmissionType;
    private String numberOfSpeeds;

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
     *     The equipmentType
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * 
     * @param equipmentType
     *     The equipmentType
     */
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * 
     * @return
     *     The transmissionType
     */
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * 
     * @param transmissionType
     *     The transmissionType
     */
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    /**
     * 
     * @return
     *     The numberOfSpeeds
     */
    public String getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    /**
     * 
     * @param numberOfSpeeds
     *     The numberOfSpeeds
     */
    public void setNumberOfSpeeds(String numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

}
