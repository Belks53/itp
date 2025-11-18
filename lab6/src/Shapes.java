public class Shapes {
    protected int angle;

    Shapes(int angle) {
        this.angle = angle;
    }

    public void Perimeter() {
    }

    public void Area() {}
}

class Circle extends Shapes {
    public Circle(int angle) {
        super(angle);
    }
    int radius;

    public void Perimeter() {
        System.out.println(radius * 3.14 * 2);
    }
    public void Area() {
        System.out.println(radius* radius * 3.14);
    }
}

class Rectangle extends Shapes {
    public Rectangle(int angle) {
        super(angle);
    }
    protected int width;
    protected int height;
    public void Perimeter() {
        System.out.println((width + height) * 2);
    }
    public void Area() {
        System.out.println((width * height));
    }
}

class Triangle extends Shapes {
    public Triangle(int angle) {
        super(angle);
    }
    int height;
    int a;
    int b;
    int c;
    public void Perimeter() {
        System.out.println((a + b + c));
    }

    public void Area() {
        System.out.println(a * height);
    }
}

class Square extends Rectangle {
    public Square(int angle) {
        super(angle);
    }
    int width;

    public void  Perimeter() {
        System.out.println(width * 4);
    }
    public void Area() {
        System.out.println(width * width);
    }

}