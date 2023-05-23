package com.izaanschool.methodcreation;

public class BlogAuthor {

private String Name;
private String Bio;
private String Articles;

public String getName() { return Name; }
public void setName (String Name) {this.Name = Name;}

public String getBio () {return Bio;}
public void setBio (String Bio) {this.Bio = Bio;}

public String getArticles() { return Articles; }
public void setArticles (String Articles) {this.Articles = Articles;}

    public static void main(String[] args) {

        BlogAuthor ba = new BlogAuthor();
        ba.setName("Salman Butt");
        ba.setBio("Welcome to my Blog!");
        ba.setArticles("Select an Article");

        System.out.println("Blog Details");
        System.out.println("Name : " + ba.getName());
        System.out.println("Bio : " + ba.getBio());
        System.out.println("Articles : " + ba.getArticles());
    }


}
