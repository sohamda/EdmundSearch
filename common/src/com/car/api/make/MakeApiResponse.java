
package com.car.api.make;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MakeApiResponse {

    private Make[] makes; 
    private Integer makesCount;

    /**
     * 
     * @return
     *     The makes
     */
    public Make[] getMakes() {
        return makes;
    }

    /**
     * 
     * @param makes
     *     The makes
     */
    public void setMakes(Make[] makes) {
        this.makes = makes;
    }

    /**
     * 
     * @return
     *     The makesCount
     */
    public Integer getMakesCount() {
        return makesCount;
    }

    /**
     * 
     * @param makesCount
     *     The makesCount
     */
    public void setMakesCount(Integer makesCount) {
        this.makesCount = makesCount;
    }

}
