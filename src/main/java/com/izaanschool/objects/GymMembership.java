package com.izaanschool.objects;

import java.util.Date;
import java.util.Calendar;

public class GymMembership {
    private String member;
    private String type;
    private Date startDate;
    private Date endDate;

    public GymMembership(String member, String type, Date startDate, Date endDate) {
        this.member = member;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

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
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.YEAR, 1);
        Date nextYear = calendar.getTime();

        GymMembership gymMembership = new GymMembership("Salman Butt", "Top Member", today, nextYear);

        String member = gymMembership.getMember();
        String type = gymMembership.getType();
        Date startDate = gymMembership.getStartDate();
        Date endDate = gymMembership.getEndDate();

        System.out.println("Member: " + member);
        System.out.println("Type: " + type);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}
