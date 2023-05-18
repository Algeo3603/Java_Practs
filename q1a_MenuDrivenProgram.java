import java.util.Scanner;

public class q1a_MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num;

        do {
            System.out.println("Menu:");
            System.out.println("1. Find Factorial of a number");
            System.out.println("2. Find XY");
            System.out.println("3. Print n Fibonacci numbers");
            System.out.println("4. Find reverse of number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.println("Factorial of " + num + " is " + factorial(num));
                    break;

                case 2:
                    System.out.print("Enter X: ");
                    int x = sc.nextInt();
                    System.out.print("Enter Y: ");
                    int y = sc.nextInt();
                    System.out.println("Result of X^Y is " + power(x, y));
                    break;

                case 3:
                    System.out.print("Enter the number of Fibonacci numbers to print: ");
                    int n = sc.nextInt();
                    System.out.println("Fibonacci series of " + n + " numbers:");
                    printFibonacci(n);
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Reverse of " + num2 + " is " + reverse(num2));
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);
    }

    // Method to find factorial of a number
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Method to find X^Y
    public static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // Method to print n Fibonacci numbers
    public static void printFibonacci(int n) {
        int a = 0, b = 1, c = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println();
    }

    // Method to find reverse of a number
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}
