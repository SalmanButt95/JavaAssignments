package com.izaanschool.methodcreation;

public class SecuritySystem {
    private String sensors;
    private String alarms;
    private String notifications;


    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public String getAlarms() {
        return alarms;
    }

    public void setAlarms(String alarms) {
        this.alarms = alarms;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.setSensors("Motion sensors");
        securitySystem.setAlarms("Burglar alarms");
        securitySystem.setNotifications("Call notifications");

        System.out.println("Sensors: " + securitySystem.getSensors());
        System.out.println("Alarms: " + securitySystem.getAlarms());
        System.out.println("Notifications: " + securitySystem.getNotifications());
    }
}
