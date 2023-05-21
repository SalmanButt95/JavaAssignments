package com.izaanschool.ifelse;

public class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        String name = "Zoey";
        String species = "Cat";
        int age = 3;

        Pet pet = new Pet(name, species, age);

        System.out.println("Name: " + pet.getName());
        System.out.println("Species: " + pet.getSpecies());
        System.out.println("Age: " + pet.getAge());

        if (age == 5) {
            System.out.println("You are right");
        } else {
            System.out.println("Enter age again");
        }
    }
}
