package com.aa.promos.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PromoSearchRsp {
    @JsonProperty("Content")
    private Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public static class Content {
        @JsonProperty("PromotionOrChallengeCode")
        private String promotionOrChallengeCode;
        @JsonProperty("PromotionType")
        private String promotionType;
        @JsonProperty("PromotionName")
        private String promotionName;
        @JsonProperty("Description")
        private String description;
        @JsonProperty("HighResolutionImage")
        private String highResolutionImage;
        @JsonProperty("LowResolutionImage")
        private String lowResolutionImage;
        @JsonProperty("Goals")
        private List<Goal> goals = null;
        @JsonProperty("RulesRestrictions")
        private List<RulesRestriction> rulesRestrictions = null;
        @JsonProperty("TermsCondition")
        private List<TermsCondition> termsCondition = null;

        public String getPromotionOrChallengeCode() {
            return promotionOrChallengeCode;
        }

        public void setPromotionOrChallengeCode(String promotionOrChallengeCode) {
            this.promotionOrChallengeCode = promotionOrChallengeCode;
        }

        public String getPromotionType() {
            return promotionType;
        }

        public void setPromotionType(String promotionType) {
            this.promotionType = promotionType;
        }

        public String getPromotionName() {
            return promotionName;
        }

        public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getHighResolutionImage() {
            return highResolutionImage;
        }

        public void setHighResolutionImage(String highResolutionImage) {
            this.highResolutionImage = highResolutionImage;
        }

        public String getLowResolutionImage() {
            return lowResolutionImage;
        }

        public void setLowResolutionImage(String lowResolutionImage) {
            this.lowResolutionImage = lowResolutionImage;
        }

        public List<Goal> getGoals() {
            return goals;
        }

        public void setGoals(List<Goal> goals) {
            this.goals = goals;
        }

        public List<RulesRestriction> getRulesRestrictions() {
            return rulesRestrictions;
        }

        public void setRulesRestrictions(List<RulesRestriction> rulesRestrictions) {
            this.rulesRestrictions = rulesRestrictions;
        }

        public List<TermsCondition> getTermsCondition() {
            return termsCondition;
        }

        public void setTermsCondition(List<TermsCondition> termsCondition) {
            this.termsCondition = termsCondition;
        }
    }

    public static class Goal {
        @JsonProperty("GoalLabel")
        private String goalLabel;
        @JsonProperty("GoalDescription")
        private String goalDescription;
        @JsonProperty("TrackerType")
        private String trackerType;
        @JsonProperty("RewardSet")
        private List<RewardSet> rewardSet = null;
        @JsonProperty("Tracker")
        private List<Tracker> tracker = null;

        public String getGoalLabel() {
            return goalLabel;
        }

        public void setGoalLabel(String goalLabel) {
            this.goalLabel = goalLabel;
        }

        public String getGoalDescription() {
            return goalDescription;
        }

        public void setGoalDescription(String goalDescription) {
            this.goalDescription = goalDescription;
        }

        public String getTrackerType() {
            return trackerType;
        }

        public void setTrackerType(String trackerType) {
            this.trackerType = trackerType;
        }

        public List<RewardSet> getRewardSet() {
            return rewardSet;
        }

        public void setRewardSet(List<RewardSet> rewardSet) {
            this.rewardSet = rewardSet;
        }

        public List<Tracker> getTracker() {
            return tracker;
        }

        public void setTracker(List<Tracker> tracker) {
            this.tracker = tracker;
        }
    }

    public static class RewardSet {
        @JsonProperty("RewardType")
        private String rewardType;
        @JsonProperty("RewardFormat")
        private String rewardFormat;
        @JsonProperty("RewardDescription")
        private String rewardDescription;

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

        public String getRewardDescription() {
            return rewardDescription;
        }

        public void setRewardDescription(String rewardDescription) {
            this.rewardDescription = rewardDescription;
        }
    }

    public static class RulesRestriction {
        @JsonProperty("ParentChild")
        private String parentChild;
        @JsonProperty("Rules")
        private String rules;

        public String getParentChild() {
            return parentChild;
        }

        public void setParentChild(String parentChild) {
            this.parentChild = parentChild;
        }

        public String getRules() {
            return rules;
        }

        public void setRules(String rules) {
            this.rules = rules;
        }
    }

    public static class TermsCondition {
        @JsonProperty("TermsAndCondition")
        private String termsAndCondition;

        public String getTermsAndCondition() {
            return termsAndCondition;
        }

        public void setTermsAndCondition(String termsAndCondition) {
            this.termsAndCondition = termsAndCondition;
        }
    }

    public static class Tracker {
        @JsonProperty("TrackingElement")
        private String trackingElement;
        @JsonProperty("TrackingCode")
        private String trackingCode;
        @JsonProperty("TrackingElementPreview")
        private String trackingElementPreview;

        public String getTrackingElement() {
            return trackingElement;
        }

        public void setTrackingElement(String trackingElement) {
            this.trackingElement = trackingElement;
        }

        public String getTrackingCode() {
            return trackingCode;
        }

        public void setTrackingCode(String trackingCode) {
            this.trackingCode = trackingCode;
        }

        public String getTrackingElementPreview() {
            return trackingElementPreview;
        }

        public void setTrackingElementPreview(String trackingElementPreview) {
            this.trackingElementPreview = trackingElementPreview;
        }
    }
}
