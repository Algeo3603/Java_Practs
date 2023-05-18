class Shape {
    double area;
    Shape() {
        this.area = 0;
    }
    Shape(double area) {
        this.area = area;
    }
    Shape(Shape s) {
        this.area = s.area;
    }
    void display() {
        System.out.println("Area: " + area);
    }
}
class Square extends Shape {
    Square(double side) {
        super(side * side);
    }
}
class Rectangle extends Shape {
    Rectangle(double length, double breadth) {
        super(length * breadth);
    }
}
public class q6b {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        square1.display();
        Rectangle rect1 = new Rectangle(4, 6);
        rect1.display();
        Shape shape1 = new Shape(10);
        Shape shape2 = new Shape(shape1);
        shape1.display();
        shape2.display();
    }
}
