package com.izaanschool.objects;

public class Employee {
    private String name;
    private String designation;
    private double salary;

    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Salman Butt", "DevOps Specialist", 55000.0);

        String name = employee.getName();
        String designation = employee.getDesignation();
        double salary = employee.getSalary();

        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
