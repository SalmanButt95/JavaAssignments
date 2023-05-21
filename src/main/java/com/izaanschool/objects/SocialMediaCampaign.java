package com.izaanschool.objects;

class SocialMediaCampaign {
    // Class properties
    private String name;
    private String targetAudience;
    private String goals;

    // Constructor
    public SocialMediaCampaign(String name, String targetAudience, String goals) {
        this.name = name;
        this.targetAudience = targetAudience;
        this.goals = goals;
    }

    // Getters and setters
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

    public static void main(String[] args) {

        String name = "Salman Butt Java Class";
        String targetAudience = "Anybody who wants to learn!";
        String goals = "Help people learn new skills with Java";
        SocialMediaCampaign campaign = new SocialMediaCampaign(name, targetAudience, goals);


        System.out.println("Name: " + campaign.getName());
        System.out.println("Target Audience: " + campaign.getTargetAudience());
        System.out.println("Goals: " + campaign.getGoals());
    }
}
