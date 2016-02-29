
package com.car.api.style;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Style {

    private Make make;
    private Model model;
    private Engine engine;
    private Transmission transmission;
    private String drivenWheels;
    private String numOfDoors;
    private Option[] options;
    private Color[] colors;
    private String manufacturerCode;
    private StylePrice price;
    private Categories categories;
    private Integer id;
    private String name;
    private Year year;
    private Submodel submodel;
    private String trim;
    private String[] states;
    private String[] squishVins;
    private MPG MPG;

    /**
     * 
     * @return
     *     The make
     */
    public Make getMake() {
        return make;
    }

    /**
     * 
     * @param make
     *     The make
     */
    public void setMake(Make make) {
        this.make = make;
    }

    /**
     * 
     * @return
     *     The model
     */
    public Model getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * 
     * @return
     *     The engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * 
     * @param engine
     *     The engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * 
     * @return
     *     The transmission
     */
    public Transmission getTransmission() {
        return transmission;
    }

    /**
     * 
     * @param transmission
     *     The transmission
     */
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    /**
     * 
     * @return
     *     The drivenWheels
     */
    public String getDrivenWheels() {
        return drivenWheels;
    }

    /**
     * 
     * @param drivenWheels
     *     The drivenWheels
     */
    public void setDrivenWheels(String drivenWheels) {
        this.drivenWheels = drivenWheels;
    }

    /**
     * 
     * @return
     *     The numOfDoors
     */
    public String getNumOfDoors() {
        return numOfDoors;
    }

    /**
     * 
     * @param numOfDoors
     *     The numOfDoors
     */
    public void setNumOfDoors(String numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    /**
     * 
     * @return
     *     The options
     */
    public Option[] getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(Option[] options) {
        this.options = options;
    }

    /**
     * 
     * @return
     *     The colors
     */
    public Color[] getColors() {
        return colors;
    }

    /**
     * 
     * @param colors
     *     The colors
     */
    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    /**
     * 
     * @return
     *     The manufacturerCode
     */
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * 
     * @param manufacturerCode
     *     The manufacturerCode
     */
    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    /**
     * 
     * @return
     *     The price
     */
    public StylePrice getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(StylePrice price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

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
     *     The year
     */
    public Year getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(Year year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The submodel
     */
    public Submodel getSubmodel() {
        return submodel;
    }

    /**
     * 
     * @param submodel
     *     The submodel
     */
    public void setSubmodel(Submodel submodel) {
        this.submodel = submodel;
    }

    /**
     * 
     * @return
     *     The trim
     */
    public String getTrim() {
        return trim;
    }

    /**
     * 
     * @param trim
     *     The trim
     */
    public void setTrim(String trim) {
        this.trim = trim;
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

    /**
     * 
     * @return
     *     The squishVins
     */
    public String[] getSquishVins() {
        return squishVins;
    }

    /**
     * 
     * @param squishVins
     *     The squishVins
     */
    public void setSquishVins(String[] squishVins) {
        this.squishVins = squishVins;
    }

    /**
     * 
     * @return
     *     The MPG
     */
    public MPG getMPG() {
        return MPG;
    }

    /**
     * 
     * @param MPG
     *     The MPG
     */
    public void setMPG(MPG MPG) {
        this.MPG = MPG;
    }

}
