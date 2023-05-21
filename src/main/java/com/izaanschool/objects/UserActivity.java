package com.izaanschool.objects;

import java.util.Date;

class UserActivity {
    private Date date;
    private String action;
    private String result;

    public UserActivity(Date date, String action, String result) {
        this.date = date;
        this.action = action;
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static void main(String[] args) {
        Date currentDate = new Date();
        currentDate.setHours(12);
        currentDate.setMinutes(34);
        currentDate.setSeconds(47);

        String action = "Logged in";
        String result = "Success";

        UserActivity userActivity = new UserActivity(currentDate, action, result);

        System.out.println("Date: " + userActivity.getDate());
        System.out.println("Action: " + userActivity.getAction());
        System.out.println("Result: " + userActivity.getResult());
    }
}
