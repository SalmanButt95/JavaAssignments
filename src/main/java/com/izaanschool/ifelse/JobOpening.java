package com.izaanschool.ifelse;

public class JobOpening {
    private String title;
    private String description;
    private String requirements;
    private int number_of_JobOpening;

    public JobOpening(String title, String description, String requirements, int number_of_JobOpening) {
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.number_of_JobOpening = number_of_JobOpening;
    }

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

    public int getNumber_of_JobOpening() {
        return number_of_JobOpening;
    }

    public void setNumber_of_JobOpening(int number_of_JobOpening) {
        this.number_of_JobOpening = number_of_JobOpening;
    }

    public static void main(String[] args) {

        JobOpening jobOpening = new JobOpening("DevOps", "AWS DevOps Specialist", "3 years of experience", 5);
        System.out.println("Title: " + jobOpening.getTitle());
        System.out.println("Description: " + jobOpening.getDescription());
        System.out.println("Requirements: " + jobOpening.getRequirements());
        System.out.println("Number of Job Openings: " + jobOpening.getNumber_of_JobOpening());

        if (jobOpening.getRequirements().equals("10")) {
            System.out.println("You are right");
        } else {
            System.out.println("Enter correct amount");
        }
    }
}
