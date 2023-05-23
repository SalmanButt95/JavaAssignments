package com.izaanschool.methodcreation;

public class Doctor {
    private String name;
    private String specialization;
    private String contactInformation;


    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        doctor.setName("Dr. Salman Butt");
        doctor.setSpecialization("Java Medicine");
        doctor.setContactInformation("Phone: 123-456-7890, Email: dr.salmanbutt@example.com");

        System.out.println("Doctor Details");
        System.out.println("Name: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Contact Information: " + doctor.getContactInformation());
    }
}
