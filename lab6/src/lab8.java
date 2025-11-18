class Animal {
    protected String name;
    protected int height;
    protected int weight;
    protected String color;
    public Animal(String name, int height, int weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void eat(int food) {
        this.weight += food;
    }

    public void sleep(int hours) {
        this.height += hours/2;
        this.weight -= hours/2;
    }

    public void say() {
    }
}

class Cow extends Animal {
    public Cow(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }
    @Override
    public void eat(int food) {
        this.weight += 2*food;
    }

    public void sleep(int hours) {
        this.weight -= hours;
    }

    public void say(){
        System.out.println("I am "+ this.name + " Muuuuu");
        System.out.println("My weight is "+ this.weight);
        System.out.println("My height is "+ this.height);
    }
}

class Cat extends Animal {
    public Cat(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat(int food) {
        this.weight += food/2;
    }

    public void sleep(int hours) {
        this.weight -= hours/5;
        this.height += hours/20;
    }

    public void say(){
        System.out.println("I am "+ this.name + " Maaaauu");
        System.out.println("My weight is "+ this.weight);
        System.out.println("My height is "+ this.height);
    }
}

class Dog extends Animal {
    public Dog(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat(int food) {
        this.weight += food/10;
    }

    public void sleep(int hours) {
        this.weight -= hours/2;
        this.height += hours/100;
    }

    public void say(){
        System.out.println("I am "+ this.name + " GAV GAV");
        System.out.println("My weight is "+ this.weight);
        System.out.println("My height is "+ this.height);
    }

    public void nam(){
        System.out.println("IA SDELAL CUS");
    }
}


