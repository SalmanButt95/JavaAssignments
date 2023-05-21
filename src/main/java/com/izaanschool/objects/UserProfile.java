package com.izaanschool.objects;

class UserProfile {
    private String name;
    private String email;
    private String password;

    public UserProfile(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

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
        String name = "Salman Butt";
        String email = "SalmanButt@example.com";
        String password = "example123";

        UserProfile userProfile = new UserProfile(name, email, password);

        System.out.println("Name: " + userProfile.getName());
        System.out.println("Email: " + userProfile.getEmail());
        System.out.println("Password: " + userProfile.getPassword());
    }
}
