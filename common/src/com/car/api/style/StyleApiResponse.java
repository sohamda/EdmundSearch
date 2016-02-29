
package com.car.api.style;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class StyleApiResponse {

    private Style[] styles;
    private Integer stylesCount;

    /**
     * 
     * @return
     *     The styles
     */
    public Style[] getStyles() {
        return styles;
    }

    /**
     * 
     * @param styles
     *     The styles
     */
    public void setStyles(Style[] styles) {
        this.styles = styles;
    }

    /**
     * 
     * @return
     *     The stylesCount
     */
    public Integer getStylesCount() {
        return stylesCount;
    }

    /**
     * 
     * @param stylesCount
     *     The stylesCount
     */
    public void setStylesCount(Integer stylesCount) {
        this.stylesCount = stylesCount;
    }

}
