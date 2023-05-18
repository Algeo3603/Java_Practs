import java.util.Scanner;

public class q3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        return str.equals(reversedStr);
    }
}
