package com.izaanschool.ifelse;

public class Employee {

    public static void main(String[] args) {
        String name = "Salman Butt";
        String designation = "Java Expert";
        double salary = 50000.00;


        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);

        if (name.equals("Salman Butt")) {
            System.out.println("Salman Butt is a Java Expert");
        }
    }
}
