package com.izaanschool.methodcreation;

public class Pet {
    private String name;
    private String species;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setName("Haan");
        pet.setSpecies("Siberian Husky");
        pet.setAge(5);

        System.out.println("Pet Name: " + pet.getName());
        System.out.println("Species: " + pet.getSpecies());
        System.out.println("Age: " + pet.getAge());
    }
}
