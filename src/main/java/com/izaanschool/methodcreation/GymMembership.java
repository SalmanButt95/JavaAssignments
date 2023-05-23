package com.izaanschool.methodcreation;

import java.util.Date;

public class GymMembership {
    private String member;
    private String type;
    private Date startDate;
    private Date endDate;

    // Getters and setters methods for the properties
    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        GymMembership membership = new GymMembership();
        membership.setMember("Salman Butt");
        membership.setType("Paid-Member");


        Date startDate = new Date();
        membership.setStartDate(startDate);


        Date endDate = new Date();
        endDate.setTime(startDate.getTime() + 30L * 24L * 60L * 60L * 1000L); // Add 30 days
        membership.setEndDate(endDate);

        System.out.println("Member: " + membership.getMember());
        System.out.println("Type: " + membership.getType());
        System.out.println("Start Date: " + membership.getStartDate());
        System.out.println("End Date: " + membership.getEndDate());
    }
}
