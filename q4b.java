import java.util.Scanner;
import java.util.Vector;

public class q4b {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            strings.add(str);
        }

        System.out.print("Enter a new string: ");
        String newStr = sc.next();

        if (strings.contains(newStr)) {
            strings.remove(newStr);
            System.out.println("String removed from vector.");
        } else {
            strings.add(newStr);
            System.out.println("String added to vector.");
        }

        System.out.println("Vector contents:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
