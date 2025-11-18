import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Animal a1 = new Dog();
        Animal a2 = new Human();
        Animal a3 = new Dog();
        a1.name = "Tom";
        a2.name = "Bella";
        animalList.adding(a1);
        animalList.displaying();
        animalList.adding(a2);
        animalList.adding(a2);
        animalList.displaying();
        animalList.remove(a1);
        animalList.displaying();
        animalList.update(a1);
        animalList.displaying();




//        Creature one = new Human();
//        Creature two = new Animal.Dog();
//        Creature three = new Alien();
//
//        ArrayList<Creature> creatures = new ArrayList<>();
//        creatures.add(one);
//        creatures.add(two);
//        creatures.add(three);
//
//        for (Creature creature : creatures) {
//            creature.bear("Bella");
//            creature.shoutName();
//            creature.die();
//        }
//        Animal.Dog dog = new Animal.Dog();
//        dog.bark();
//
//        Penguin p =  new Penguin();
//        p.live();
//        p.swim();
//        p.stopSwimming();
//
//        Duck duck = new Duck();
//        duck.live();
//        duck.swim();
//        duck.stopSwimming();
//        duck.fly();
//        duck.stopFlying();
    }
}