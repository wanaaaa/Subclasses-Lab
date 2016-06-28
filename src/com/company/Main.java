package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animalOne = new Animal(4, 10, false, "oneAnimal" );
        Mammal mammalOne = new Mammal(true);
        Cow cowOne = new Cow(4);

        for (Animal animal: animalOne) {
            System.out.println(animal.getmName());
        }
        // write your code here

    }
}
