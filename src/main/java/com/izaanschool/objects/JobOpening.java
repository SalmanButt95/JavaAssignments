package com.izaanschool.objects;

public class JobOpening {
    private String title;
    private String description;
    private String requirements;

    public JobOpening(String title, String description, String requirements) {
        this.title = title;
        this.description = description;
        this.requirements = requirements;
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

    public static void main(String[] args) {
        JobOpening jobOpening = new JobOpening("DevOps Engineer", "AWS certification", "Be a Genius");

        String title = jobOpening.getTitle();
        String description = jobOpening.getDescription();
        String requirements = jobOpening.getRequirements();

        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Requirements: " + requirements);
    }
}
