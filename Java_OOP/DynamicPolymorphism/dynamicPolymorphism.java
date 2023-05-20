package Java_OOP.DynamicPolymorphism;

import java.util.Scanner;

import Java_OOP.Abstraction.Car;

public class dynamicPolymorphism {
    public static void main(String[] args) {
        
        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        //e.g. - A Mustang is a: mustang, and a car, and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("What animal you want?");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if (choice==1) {
            animal = new Dog();
            animal.speak();
        }

        else if (choice==2) {
            animal = new Cat();
            animal.speak();
        }

        else{
            animal = new Animal();
            System.out.println("The choice was invalid");
            animal.speak();
        }
    }
}
