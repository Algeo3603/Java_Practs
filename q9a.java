abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

public class q9a {
    public static void main(String[] args) {
        Shape s;
        
        s = new Circle(1);
        System.out.println(s.getArea());

        s = new Rectangle(2, 3);
        System.out.println(s.getArea());

        s = new Triangle(3, 6);
        System.out.println(s.getArea());
    }
}
