package com.izaanschool.objects;

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
        Pet pet = new Pet("Zoey", "Tabby", 3);
        System.out.println("Pet Name: " + pet.getName());
        System.out.println("Species: " + pet.getSpecies());
        System.out.println("Age: " + pet.getAge());
    }
}
