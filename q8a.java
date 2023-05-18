import java.util.Scanner;

interface Sports {
    int score();
}

class Student {
    int rollno;
    void read() {
        // read rollno from input
        Scanner sc = new Scanner(System.in);
        rollno = sc.nextInt();
    }
}

class Test extends Student {
    int sem1_marks, sem2_marks;
    void read() {
        super.read(); // call parent class method to read rollno
        // read sem1_marks and sem2_marks from input
        Scanner sc = new Scanner(System.in);
        sem1_marks = sc.nextInt();
        sem2_marks = sc.nextInt();
    }
}

class Result extends Test implements Sports {
    int total;
    public int score() {
        // read score from input
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        return score;
    }
    void calculateTotal() {
        total = sem1_marks + sem2_marks + score();
    }
}

public class q8a {
    public static void main(String[] args) {
        Result result = new Result();
        result.read();
        result.calculateTotal();
        // print total marks
        System.out.println("Total marks: " + result.total);
    }
}
