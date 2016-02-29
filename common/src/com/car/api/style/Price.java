
package com.car.api.style;


public class Price {

    private Double baseMSRP;
    private Double baseInvoice;
    private Boolean estimateTmv;

    /**
     * 
     * @return
     *     The baseMSRP
     */
    public Double getBaseMSRP() {
        return baseMSRP;
    }

    /**
     * 
     * @param baseMSRP
     *     The baseMSRP
     */
    public void setBaseMSRP(Double baseMSRP) {
        this.baseMSRP = baseMSRP;
    }

    /**
     * 
     * @return
     *     The baseInvoice
     */
    public Double getBaseInvoice() {
        return baseInvoice;
    }

    /**
     * 
     * @param baseInvoice
     *     The baseInvoice
     */
    public void setBaseInvoice(Double baseInvoice) {
        this.baseInvoice = baseInvoice;
    }

    /**
     * 
     * @return
     *     The estimateTmv
     */
    public Boolean getEstimateTmv() {
        return estimateTmv;
    }

    /**
     * 
     * @param estimateTmv
     *     The estimateTmv
     */
    public void setEstimateTmv(Boolean estimateTmv) {
        this.estimateTmv = estimateTmv;
    }
}
