class Complex {
    private int real, imagianry;
    public Complex(int real, int imagianry) {
        this.real = real;
        this.imagianry = imagianry;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imagianry + c.imagianry);
    }

    public void display() {
        System.out.println("Value is " + real + "real and " + imagianry + "imaginary");
    }
}


public class q5c {
    public static void main(String args[]) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex c = a.add(b);

        c.display();
    }
}
