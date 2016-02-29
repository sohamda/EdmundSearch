
package com.car.api.style;


public class StylePrice {

    private Double baseMSRP;
    private Double baseInvoice;
    private Double deliveryCharges;
    private Double usedTmvRetail;
    private Double usedPrivateParty;
    private Double usedTradeIn;
    private Boolean estimateTmv;
    private Double tmvRecommendedRating;

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
     *     The deliveryCharges
     */
    public Double getDeliveryCharges() {
        return deliveryCharges;
    }

    /**
     * 
     * @param deliveryCharges
     *     The deliveryCharges
     */
    public void setDeliveryCharges(Double deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    /**
     * 
     * @return
     *     The usedTmvRetail
     */
    public Double getUsedTmvRetail() {
        return usedTmvRetail;
    }

    /**
     * 
     * @param usedTmvRetail
     *     The usedTmvRetail
     */
    public void setUsedTmvRetail(Double usedTmvRetail) {
        this.usedTmvRetail = usedTmvRetail;
    }

    /**
     * 
     * @return
     *     The usedPrivateParty
     */
    public Double getUsedPrivateParty() {
        return usedPrivateParty;
    }

    /**
     * 
     * @param usedPrivateParty
     *     The usedPrivateParty
     */
    public void setUsedPrivateParty(Double usedPrivateParty) {
        this.usedPrivateParty = usedPrivateParty;
    }

    /**
     * 
     * @return
     *     The usedTradeIn
     */
    public Double getUsedTradeIn() {
        return usedTradeIn;
    }

    /**
     * 
     * @param usedTradeIn
     *     The usedTradeIn
     */
    public void setUsedTradeIn(Double usedTradeIn) {
        this.usedTradeIn = usedTradeIn;
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

    /**
     * 
     * @return
     *     The tmvRecommendedRating
     */
    public Double getTmvRecommendedRating() {
        return tmvRecommendedRating;
    }

    /**
     * 
     * @param tmvRecommendedRating
     *     The tmvRecommendedRating
     */
    public void setTmvRecommendedRating(Double tmvRecommendedRating) {
        this.tmvRecommendedRating = tmvRecommendedRating;
    }
}
