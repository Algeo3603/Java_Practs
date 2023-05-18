import java.util.Scanner;

public class q1b2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            String pattern = "";
            for (int j = 1; j <= i; j++) {
                pattern += letter;
                letter++;
            }
            StringBuilder sb = new StringBuilder(pattern);
            System.out.println(sb.reverse().toString());
        }
    }
}
