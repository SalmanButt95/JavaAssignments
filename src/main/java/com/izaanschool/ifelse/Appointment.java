package com.izaanschool.ifelse;
public class Appointment {
    String doctorName = "Dr.Bob";
    String date = "2023-01-01";
    String time = "04:30 PM";
    String location = "Medical Main Office";

    public void info() {
        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctorName);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);

        if (doctorName.equals("Dr.Bob")) {
            System.out.println("My doctor's name is Dr.Bob!");
        }
    }

    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        appointment.info();
    }
}
