package com.izaanschool.objects;

class BlogAuthor {
    private String name;
    private String bio;
    private int articles;

    public BlogAuthor(String name, String bio, int articles) {
        this.name = name;
        this.bio = bio;
        this.articles = articles;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getArticles() {
        return articles;
    }

    public static void main(String[] args) {
        BlogAuthor author = new BlogAuthor("Salman Butt", "The best Java Expert", 100);

        String name = author.getName();
        String bio = author.getBio();
        int articles = author.getArticles();

        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("Number of Articles: " + articles);
    }
}
