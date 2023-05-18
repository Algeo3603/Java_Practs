class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class q8c {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
