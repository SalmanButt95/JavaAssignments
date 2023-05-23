package com.izaanschool.methodcreation;

public class UserProfile {

    private String name;
    private String email;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void main(String[] args) {

        UserProfile userProfile = new UserProfile();


        userProfile.setName("Salman Butt");
        userProfile.setEmail("SalmanButt@example.com");
        userProfile.setPassword("Example123");


        System.out.println("User Profile Name: " + userProfile.getName());
        System.out.println("User Profile Email: " + userProfile.getEmail());
        System.out.println("User Profile Password: " + userProfile.getPassword());
    }
}
