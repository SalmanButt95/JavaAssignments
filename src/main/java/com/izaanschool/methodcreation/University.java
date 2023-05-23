package com.izaanschool.methodcreation;

public class University {

    private String name;
    private String location;
    private String departments;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    // Main method
    public static void main(String[] args) {

        University university = new University();


        university.setName("Salman University");
        university.setLocation("Salman Town");
        university.setDepartments("Computer Science, Physics, History");


        System.out.println("University Name: " + university.getName());
        System.out.println("University Location: " + university.getLocation());
        System.out.println("University Departments: " + university.getDepartments());
    }
}
