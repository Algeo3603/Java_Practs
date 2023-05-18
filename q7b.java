import java.util.Scanner;

class Staff {
    String code, name;
}

class Typist extends Staff {
    int speed, exp;
}

class Regular extends Typist {
    int sal;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Regular:");
        System.out.print("Enter code: ");
        code = sc.next();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter speed: ");
        speed = sc.nextInt();
        System.out.print("Enter exp: ");
        exp = sc.nextInt();
        System.out.print("Enter sal: ");
        sal = sc.nextInt();
    }

    public void display() {
        System.out.println("Info of Regular is:");
        System.out.println("Code is " + code);
        System.out.println("Name is " + name);
        System.out.println("Speed is " + speed);
        System.out.println("Exp is " + exp);
        System.out.println("Sal is " + sal);
    }
}

class Casual extends Typist {
    int daily_wages;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Casual:");
        System.out.print("Enter code: ");
        code = sc.next();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter speed: ");
        speed = sc.nextInt();
        System.out.print("Enter exp: ");
        exp = sc.nextInt();
        System.out.print("Enter wages: ");
        daily_wages = sc.nextInt();
    }

    public void display() {
        System.out.println("Info of Regular is:");
        System.out.println("Code is " + code);
        System.out.println("Name is " + name);
        System.out.println("Speed is " + speed);
        System.out.println("Exp is " + exp);
        System.out.println("Wage is " + daily_wages);
    }
}

public class q7b {
    public static void main(String args[]) {

        Regular r = new Regular();
        r.read();
        
        Casual c = new Casual();
        c.read();

        r.display();
        System.out.println();
        c.display();
    }
}
