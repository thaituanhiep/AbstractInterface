package test;

import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

import java.util.Arrays;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
//
//            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
//            }
//        }
        Arrays.stream(animals).forEach(value -> {
            System.out.println(value.makeSound());

            if(value instanceof Chicken) {
                Edible edible = (Chicken) value;
                System.out.println(edible.howToEat());
            }
        });

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
//        for (Fruit fruit : fruits) {
//            System.out.println(fruit.howToEat());
//        }
        Arrays.stream(fruits).forEach(value -> System.out.println(value.howToEat()));
    }
}
