
package com.car.api.style;


public class DetailOption {

    private String id;
    private String name;
    private String equipmentType;
    private Price price;
    private String manufactureOptionName;
    private String manufactureOptionCode;
    private String description;

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
     *     The price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The manufactureOptionName
     */
    public String getManufactureOptionName() {
        return manufactureOptionName;
    }

    /**
     * 
     * @param manufactureOptionName
     *     The manufactureOptionName
     */
    public void setManufactureOptionName(String manufactureOptionName) {
        this.manufactureOptionName = manufactureOptionName;
    }

    /**
     * 
     * @return
     *     The manufactureOptionCode
     */
    public String getManufactureOptionCode() {
        return manufactureOptionCode;
    }

    /**
     * 
     * @param manufactureOptionCode
     *     The manufactureOptionCode
     */
    public void setManufactureOptionCode(String manufactureOptionCode) {
        this.manufactureOptionCode = manufactureOptionCode;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
