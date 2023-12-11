// User-defined Exception
class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

// Result class to calculate and store the result
class Result {
    private String name;
    private int seatNo;
    private String date;
    private int centerNumber;
    private int[] marks;

    // Constructor to initialize result details
    public Result(String name, int seatNo, String date, int centerNumber, int[] marks) {
        this.name = name;
        this.seatNo = seatNo;
        this.date = date;
        this.centerNumber = centerNumber;
        this.marks = marks;
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    // Method to check if marks are within the range
    public void checkMarksValidity() throws MarksOutOfBoundsException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new MarksOutOfBoundsException("MarksOutOfBoundsException: Marks should be between 0 and 100");
            }
        }
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Seat Number: " + seatNo);
        System.out.println("Date: " + date);
        System.out.println("Center Number: " + centerNumber);
        System.out.println("Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        int totalMarks = calculateTotalMarks();
        System.out.println("Total Marks: " + totalMarks);
    }
}

// Main class to test the Result class
public class exp5_result {
    public static void main(String[] args) {
        String name = "John Doe";
        int seatNo = 12345;
        String date = "2023-12-31";
        int centerNumber = 7890;
        int[] marks = {90, 85, 75, 92}; // Modify marks here

        try {
            Result result = new Result(name, seatNo, date, centerNumber, marks);
            result.checkMarksValidity(); // Check if marks are valid

            System.out.println("Result Details:");
            result.displayResult();
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
