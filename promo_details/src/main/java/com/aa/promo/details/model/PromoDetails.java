package com.aa.promo.details.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromoDetails {
    @JsonProperty("LSCS")
    private LSCS lSCS;
    @JsonProperty("Ventana")
    private Ventana ventana;

    public LSCS getLSCS() {
    return lSCS;
    }

    public void setLSCS(LSCS lSCS) {
    this.lSCS = lSCS;
    }

    public Ventana getVentana() {
    return ventana;
    }

    public void setVentana(Ventana ventana) {
    this.ventana = ventana;
    }

    public static class LSCS {
        @JsonProperty("rewardType")
        private String rewardType;
        @JsonProperty("rewardFormat")
        private String rewardFormat;
        @JsonProperty("promoCode")
        private String promoCode;

        public String getRewardType() {
            return rewardType;
        }

        public void setRewardType(String rewardType) {
            this.rewardType = rewardType;
        }

        public String getRewardFormat() {
            return rewardFormat;
        }

        public void setRewardFormat(String rewardFormat) {
            this.rewardFormat = rewardFormat;
        }

        public String getPromoCode() {
            return promoCode;
        }

        public void setPromoCode(String promoCode) {
            this.promoCode = promoCode;
        }
    }


    public class Ventana {
        @JsonProperty("trackerType")
        private String trackerType;
        @JsonProperty("goal")
        private String goal;
        @JsonProperty("promoCode")
        private String promoCode;

        public String getTrackerType() {
            return trackerType;
        }

        public void setTrackerType(String trackerType) {
            this.trackerType = trackerType;
        }

        public String getGoal() {
            return goal;
        }

        public void setGoal(String goal) {
            this.goal = goal;
        }

        public String getPromoCode() {
            return promoCode;
        }

        public void setPromoCode(String promoCode) {
            this.promoCode = promoCode;
        }
    }
}