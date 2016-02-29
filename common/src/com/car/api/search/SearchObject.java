package com.car.api.search;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SearchObject {
    
    private String grade;
    private Long salary;
    private Long leaseBudget;
    
    private Long bijtellingMin;
    private Long bijtellingMax;
    
    private Long budgetMin;
    private Long budgetMax;
    
    private String make;
    private String fuelType;
    private String vehicleStyle;
    private String transmissionType;
    
    public SearchObject() {
        super();
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    public void setLeaseBudget(Long leaseBudget) {
        this.leaseBudget = leaseBudget;
    }

    public Long getLeaseBudget() {
        return leaseBudget;
    }

    public void setBijtellingMin(Long bijtellingMin) {
        this.bijtellingMin = bijtellingMin;
    }

    public Long getBijtellingMin() {
        return bijtellingMin;
    }

    public void setBijtellingMax(Long bijtellingMax) {
        this.bijtellingMax = bijtellingMax;
    }

    public Long getBijtellingMax() {
        return bijtellingMax;
    }

    public void setBudgetMin(Long budgetMin) {
        this.budgetMin = budgetMin;
    }

    public Long getBudgetMin() {
        return budgetMin;
    }

    public void setBudgetMax(Long budgetMax) {
        this.budgetMax = budgetMax;
    }

    public Long getBudgetMax() {
        return budgetMax;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setVehicleStyle(String vehicleStyle) {
        this.vehicleStyle = vehicleStyle;
    }

    public String getVehicleStyle() {
        return vehicleStyle;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}
