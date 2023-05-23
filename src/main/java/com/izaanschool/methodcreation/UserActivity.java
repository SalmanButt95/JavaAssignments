package com.izaanschool.methodcreation;

import java.util.Date;

public class UserActivity {

    private Date date;
    private String action;
    private String result;


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

        UserActivity userActivity = new UserActivity();


        userActivity.setDate(new Date());
        userActivity.setAction("Signed in");
        userActivity.setResult("Successful");


        System.out.println("User Activity Date: " + userActivity.getDate());
        System.out.println("User Activity Action: " + userActivity.getAction());
        System.out.println("User Activity Result: " + userActivity.getResult());
    }
}
