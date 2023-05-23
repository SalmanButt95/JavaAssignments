package com.izaanschool.methodcreation;

public class JobOpening {
    private String title;
    private String description;
    private String requirements;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public static void main(String[] args) {
        JobOpening jobOpening = new JobOpening();
        jobOpening.setTitle("DevOps Engineer");
        jobOpening.setDescription("We are seeking a skilled DevOps engineer to join our team");
        jobOpening.setRequirements("Someone who loves to learn!");

        System.out.println("Job Title: " + jobOpening.getTitle());
        System.out.println("Job Description: " + jobOpening.getDescription());
        System.out.println("Job Requirements:\n" + jobOpening.getRequirements());
    }
}
