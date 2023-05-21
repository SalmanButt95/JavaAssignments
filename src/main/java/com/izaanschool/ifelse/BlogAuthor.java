package com.izaanschool.ifelse;

public class BlogAuthor {

    String name = "Salman Butt";
    String bio = "The Java Expert!";
    int articles = 50;

    public void info() {
        System.out.println("Author Details:");
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("Number of Articles: " + articles);

        if (name.equals("Salman Butt")) {
            System.out.println(name + " is the author.");
        }
    }

    public static void main(String[] args) {
        BlogAuthor blogAuthor = new BlogAuthor();
        blogAuthor.info();
    }
}
