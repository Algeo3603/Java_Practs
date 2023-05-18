class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

public class q10b {
    public static void validateMarks(int marks) throws MarksOutOfBoundsException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundsException("Marks " + 120 + " are out of bounds");
        }
        System.out.println("Marks are valid: " + marks);
    }

    public static void main(String[] args) {
        int marks = 120;
        try {
            validateMarks(marks);
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


