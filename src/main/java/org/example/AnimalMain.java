package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    public Animal(boolean isDog) {
        this.name = "Name";
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return "Animal Name: " + getName() + ", Is Dog: " + (getIsDog() ? "Yes" : "No");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter animal name (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = Boolean.parseBoolean(scanner.nextLine());

            animals.add(new Animal(name, isDog));
        }

        animals.add(new Animal("blue"));
        animals.add(new Animal(true));

        System.out.println("\nList of Animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}
