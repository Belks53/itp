public class Animal extends Creature{
    @Override
    public void bear(String newName) {
    }
    @Override
    public void die() {
    }
}

final class Dog extends Animal{
    @Override
    public void bear(String newName) {
        System.out.println("The dog " + name + " was burn at home");
        isAlive =  true;
    }
    @Override
    public void die() {
        System.out.println("The dog " + name + " has died at home");
        isAlive =  false;
    }
    public void bark() {
        System.out.println("GAV GAV GAV GAV GAV");
    }
}

final class Human extends Animal{
    @Override
    public void bear(String newName) {
        name = newName;
        System.out.println("The human " + name + " was burn at home");
        isAlive =  true;
    }
    @Override
    public void die() {
        System.out.println("The human " + name + " has died at home");
        isAlive =  false;
    }
}


final class Alien extends Animal{
    @Override
    public void bear(String newName) {
        name = newName;
        System.out.println("The alien " + name + " was burn at Pluton");
        isAlive =  true;
    }
    @Override
    public void die() {
        System.out.println("The alien " + name + " has died at home");
        isAlive =  false;
    }
}