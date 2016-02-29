
package com.car.api.style;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColorOption {

    private String id;
    private String name;
    private String equipmentType;
    private String manufactureOptionName;
    private String manufactureOptionCode;
    @JsonIgnore
    private ColorChips colorChips;
    private OptionPrice price;

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
     *     The colorChips
     */
    public ColorChips getColorChips() {
        return colorChips;
    }

    /**
     * 
     * @param colorChips
     *     The colorChips
     */
    public void setColorChips(ColorChips colorChips) {
        this.colorChips = colorChips;
    }

    /**
     * 
     * @return
     *     The price
     */
    public OptionPrice getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(OptionPrice price) {
        this.price = price;
    }
}
