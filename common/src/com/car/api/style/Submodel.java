
package com.car.api.style;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Submodel {

    private String body;
    private String modelName;
    private String niceName;

    /**
     * 
     * @return
     *     The body
     */
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 
     * @param modelName
     *     The modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
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
}
