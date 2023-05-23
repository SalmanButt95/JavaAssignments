package com.izaanschool.methodcreation;

import java.util.Date;
import java.util.List;

public class Prescription {
    private String patient;
    private String medication;
    private String dosage;
    private Date date;
    private List<String> instructions;


    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public static void main(String[] args) {
        Prescription prescription = new Prescription();
        prescription.setPatient("Salman Butt");
        prescription.setMedication("Aspirin");
        prescription.setDosage("500mg");
        prescription.setDate(new Date());


        System.out.println("Patient: " + prescription.getPatient());
        System.out.println("Medication: " + prescription.getMedication());
        System.out.println("Dosage: " + prescription.getDosage());
        System.out.println("Date: " + prescription.getDate());

    }
}

