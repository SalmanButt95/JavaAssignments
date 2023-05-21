package com.izaanschool.ifelse;

public class Prescription {
    private String patient;
    private String medication;
    private int dosage;
    private String date;

    public Prescription(String patient, String medication, int dosage, String date) {
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

    public int getDosage() {
        return dosage;
    }

    public String getDate() {
        return date;
    }

    public static void main(String[] args) {
        String patient = "Salman Butt";
        String medication = "Tynelol";
        int dosage = 2;
        String date = "2023-05-21";

        Prescription prescription = new Prescription(patient, medication, dosage, date);

        System.out.println("Patient: " + prescription.getPatient());
        System.out.println("Medication: " + prescription.getMedication());
        System.out.println("Dosage: " + prescription.getDosage());
        System.out.println("Date: " + prescription.getDate());

        if (dosage < 10) {
            System.out.println("It is normal");
        } else {
            System.out.println("Seems serious");
        }
    }
}
