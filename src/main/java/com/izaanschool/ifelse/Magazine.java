package com.izaanschool.ifelse;

public class Magazine {
    private String title;
    private String editor;
    private int articles;

    public Magazine(String title, String editor, int articles) {
        this.title = title;
        this.editor = editor;
        this.articles = articles;
    }

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

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public static void main(String[] args) {
        Magazine magazine = new Magazine("National Geographic", "Salman Butt", 9);

        System.out.println("Title: " + magazine.getTitle());
        System.out.println("Editor: " + magazine.getEditor());
        System.out.println("Articles: " + magazine.getArticles());

        if (magazine.getArticles() == 5) {
            System.out.println("You are right");
        } else {
            System.out.println("Enter correct amount");
        }
    }
}
