package com.izaanschool.objects;

public class Magazine {
    private String title;
    private String editor;
    private String[] articles;

    public Magazine(String title, String editor, String[] articles) {
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

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public static void main(String[] args) {
        String[] magazineArticles = { "Hi", "I'm", "Salman" };

        Magazine magazine = new Magazine("Salman Edition", "Salman Butt", magazineArticles);

        String title = magazine.getTitle();
        String editor = magazine.getEditor();
        String[] articles = magazine.getArticles();

        System.out.println("Title: " + title);
        System.out.println("Editor: " + editor);
        System.out.println("Articles: ");
        for (String article : articles) {
            System.out.println("- " + article);
        }
    }
}
