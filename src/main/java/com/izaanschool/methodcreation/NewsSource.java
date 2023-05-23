package com.izaanschool.methodcreation;

public class NewsSource {
    private String name;
    private String url;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        NewsSource source = new NewsSource();
        source.setName("Java is Easy as ABC");
        source.setUrl("https://JavaAsABC.com");
        source.setDescription("Come and learn Java made easy");

        System.out.println("Name: " + source.getName());
        System.out.println("URL: " + source.getUrl());
        System.out.println("Description: " + source.getDescription());
    }
}
