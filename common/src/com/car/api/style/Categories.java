
package com.car.api.style;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories {

    private String market;
    private String EPAClass;
    private String vehicleSize;
    private String primaryBodyType;
    private String vehicleStyle;
    private String vehicleType;

    /**
     * 
     * @return
     *     The market
     */
    public String getMarket() {
        return market;
    }

    /**
     * 
     * @param market
     *     The market
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * 
     * @return
     *     The EPAClass
     */
    public String getEPAClass() {
        return EPAClass;
    }

    /**
     * 
     * @param EPAClass
     *     The EPAClass
     */ 
    public void setEPAClass(String EPAClass) {
        this.EPAClass = EPAClass;
    }

    /**
     * 
     * @return
     *     The vehicleSize
     */
    public String getVehicleSize() {
        return vehicleSize;
    }

    /**
     * 
     * @param vehicleSize
     *     The vehicleSize
     */
    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    /**
     * 
     * @return
     *     The primaryBodyType
     */
    public String getPrimaryBodyType() {
        return primaryBodyType;
    }

    /**
     * 
     * @param primaryBodyType
     *     The primaryBodyType
     */
    public void setPrimaryBodyType(String primaryBodyType) {
        this.primaryBodyType = primaryBodyType;
    }

    /**
     * 
     * @return
     *     The vehicleStyle
     */
    public String getVehicleStyle() {
        return vehicleStyle;
    }

    /**
     * 
     * @param vehicleStyle
     *     The vehicleStyle
     */
    public void setVehicleStyle(String vehicleStyle) {
        this.vehicleStyle = vehicleStyle;
    }

    /**
     * 
     * @return
     *     The vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 
     * @param vehicleType
     *     The vehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
