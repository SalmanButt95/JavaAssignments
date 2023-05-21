package com.izaanschool.objects;

class University {
    private String name;
    private String location;
    private String[] departments;

    public University(String name, String location, String[] departments) {
        this.name = name;
        this.location = location;
        this.departments = departments;
    }

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

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public static void main(String[] args) {
        String name = "College of Staten Island";
        String location = "New York";
        String[] departments = { "Computer Science", "Physics", "Biology" };

        University university = new University(name, location, departments);

        System.out.println("Name: " + university.getName());
        System.out.println("Location: " + university.getLocation());
        System.out.println("Departments: " + String.join(", ", university.getDepartments()));
    }
}
