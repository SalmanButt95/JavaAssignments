package com.izaanschool.methodcreation;

public class Magazine {
    private String title;
    private String editor;
    private String[] articles;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.setTitle("Learn Java with Us!");
        magazine.setEditor("Salman Butt");
        magazine.setArticles(new String[]{"Article 1", "Article 2", "Article 3"});

        System.out.println("Magazine Title: " + magazine.getTitle());
        System.out.println("Editor: " + magazine.getEditor());
        System.out.println("Articles: " + String.join(", ", magazine.getArticles()));
    }
}
