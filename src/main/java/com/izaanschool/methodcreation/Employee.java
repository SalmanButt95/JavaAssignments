package com.izaanschool.methodcreation;

public class Employee {
    private String name;
    private String designation;
    private double salary;


    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Salman Butt");
        employee.setDesignation("DevOps Engineer");
        employee.setSalary(5000000.0);

        System.out.println("Employee Details");
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: " + employee.getSalary());
    }
}
