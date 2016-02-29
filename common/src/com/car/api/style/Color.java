
package com.car.api.style;


public class Color {

    private String category;
    private ColorOption[] options;

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The options
     */
    public ColorOption[] getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(ColorOption[] options) {
        this.options = options;
    }
}
