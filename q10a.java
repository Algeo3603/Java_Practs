public class q10a {
    public static void main(String[] args) {
        // Default Exception Example
        try {
            int result = 10 / 0; // ArithmeticException - Division by zero
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        // NumberFormatException Example
        try {
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        }

        // ArithmeticException Example
        int numerator = 10;
        int denominator = 0;
        try {
            int quotient = numerator / denominator; // ArithmeticException - Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        }

        // ArrayIndexOutOfBoundsException Example
        try {
            int[] arr = {1, 2, 3};
            int element = arr[5]; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        }
    }
}