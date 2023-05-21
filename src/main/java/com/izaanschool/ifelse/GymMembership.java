package com.izaanschool.ifelse;

public class GymMembership {

    public static void main(String[] args) {
        String member = "Salman Butt";
        String type = "Member";
        String startDate = "2023-05-01";
        String endDate = "2023-05-31";

        System.out.println("Member: " + member);
        System.out.println("Type: " + type);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);

        if (type.equals("Member")) {
            System.out.println("This is a Member");
        }
    }
}
