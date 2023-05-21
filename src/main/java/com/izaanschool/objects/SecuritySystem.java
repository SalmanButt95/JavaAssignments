package com.izaanschool.objects;

class SecuritySystem {
    private String[] sensors;
    private String alarms;
    private String notifications;

    public SecuritySystem(String[] sensors, String alarms, String notifications) {
        this.sensors = sensors;
        this.alarms = alarms;
        this.notifications = notifications;
    }

    public String[] getSensors() {
        return sensors;
    }

    public void setSensors(String[] sensors) {
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
        String[] sensors = {"Motion Sensor", "Door Sensor", "Window Sensor"};
        String alarms = "Enabled";
        String notifications = "SMS, Phone call, Email";
        SecuritySystem securitySystem = new SecuritySystem(sensors, alarms, notifications);

        System.out.println("Sensors: " + String.join(", ", securitySystem.getSensors()));
        System.out.println("Alarms: " + securitySystem.getAlarms());
        System.out.println("Notifications: " + securitySystem.getNotifications());
    }
}
