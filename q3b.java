import java.util.Scanner;

public class q3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                count++;
            }
        }
        System.out.printf("The character '%c' occurs %d times in the line \"%s\"%n", ch, count, line);
    }
}
