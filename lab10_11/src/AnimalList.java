import java.util.ArrayList;

public class AnimalList {
    int l = 0;
    private ArrayList<Animal> animals;
    public AnimalList() {
        animals = new ArrayList<>();
    }

    public void adding(Animal animal) {
        animals.add(animal);
        l += 1;
    }
    public void remove(Animal animal) {
        animals.remove(animal);
        l -= 1;
    }

    public void update(Animal newAnimal) {
        animals.remove(l - 1);
        animals.add(newAnimal);
    }

    public void displaying() {
        System.out.println(animals);
    }
}
