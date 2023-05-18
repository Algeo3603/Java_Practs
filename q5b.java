public class q5b {

    public static double calculateArea(double side) {
        return side * side; // calculate area of square
    }

    public static double calculateArea(double length, double width) {
        return length * width; // calculate area of rectangle
    }

    public static void main(String[] args) {
        double side = 5.0;
        double length = 8.0;
        double width = 3.0;

        double squareArea = calculateArea(side);
        double rectangleArea = calculateArea(length, width);

        System.out.println("Area of square with side " + side + " is " + squareArea);
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is " + rectangleArea);
    }
}
