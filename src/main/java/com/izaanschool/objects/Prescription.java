package com.izaanschool.objects;

import java.time.LocalDate;

public class Prescription {
    private String patient;
    private String medication;
    private String dosage;
    private LocalDate date;

    public Prescription(String patient, String medication, String dosage, LocalDate date) {
        this.patient = patient;
        this.medication = medication;
        this.dosage = dosage;
        this.date = date;
    }

    public String getPatient() {
        return patient;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }

    public LocalDate getDate() {
        return date;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now().minusWeeks(1);
        Prescription prescription = new Prescription("Salman Butt", "Java Medicine", "1 pill per day", date);
        System.out.println("Patient: " + prescription.getPatient());
        System.out.println("Medication: " + prescription.getMedication());
        System.out.println("Dosage: " + prescription.getDosage());
        System.out.println("Date: " + prescription.getDate());
    }
}
