public class q3a {
    public static void main(String[] args) {
        String str = "The quick brown fox 123 jumps over the lazy dog.";
        int numUpperCase = 0;
        int numLowerCase = 0;
        int numDigits = 0;
        int numSpaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                numUpperCase++;
            } else if (Character.isLowerCase(c)) {
                numLowerCase++;
            } else if (Character.isDigit(c)) {
                numDigits++;
            } else if (Character.isWhitespace(c)) {
                numSpaces++;
            }
        }

        System.out.println("Number of uppercase characters: " + numUpperCase);
        System.out.println("Number of lowercase characters: " + numLowerCase);
        System.out.println("Number of digits: " + numDigits);
        System.out.println("Number of blank spaces: " + numSpaces);
    }
}
