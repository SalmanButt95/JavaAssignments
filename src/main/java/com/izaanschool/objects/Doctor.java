package com.izaanschool.objects;

public class Doctor {
    private String name;
    private String specialization;
    private String contactInformation;

    public Doctor(String name, String specialization, String contactInformation) {
        this.name = name;
        this.specialization = specialization;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Java", "Java Specialist", "123-456-7890");

        String name = doctor.getName();
        String specialization = doctor.getSpecialization();
        String contactInformation = doctor.getContactInformation();

        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Information: " + contactInformation);
    }
}
