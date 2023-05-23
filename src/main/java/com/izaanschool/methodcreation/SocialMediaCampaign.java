package com.izaanschool.methodcreation;

import java.util.Date;

public class SocialMediaCampaign {
    private String name;
    private String targetAudience;
    private String goals;
    private Date startDate;
    private Date endDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public static void main(String[] args) {
        SocialMediaCampaign campaign = new SocialMediaCampaign();
        campaign.setName("Come Join to Learn Java");
        campaign.setTargetAudience("Anyone who wants to learn!");
        campaign.setGoals("Have people learn their interest in IT field");
        campaign.setStartDate(new Date());


        System.out.println("Campaign Name: " + campaign.getName());
        System.out.println("Target Audience: " + campaign.getTargetAudience());
        System.out.println("Campaign Goals: " + campaign.getGoals());
        System.out.println("Start Date: " + campaign.getStartDate());
        System.out.println("End Date: " + campaign.getEndDate());
    }
}
