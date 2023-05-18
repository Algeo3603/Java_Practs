import java.util.Scanner;

public class q2c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = j+1;
            }

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
