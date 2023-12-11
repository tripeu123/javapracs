// Interface Sports
interface Sports {
    int score(); // Method to calculate score
}

// Student class
class Student {
    int rollNo; // Member: Roll Number

    Student(int rollNo) {
        this.rollNo = rollNo;
    }
}

// Test class derived from Student
class Test extends Student {
    int sem1Marks; // Member: Semester 1 Marks
    int sem2Marks; // Member: Semester 2 Marks

    Test(int rollNo, int sem1Marks, int sem2Marks) {
        super(rollNo);
        this.sem1Marks = sem1Marks;
        this.sem2Marks = sem2Marks;
    }
}

// Result class with multiple inheritance from Test and Sports
class Result extends Test implements Sports {
    Result(int rollNo, int sem1Marks, int sem2Marks) {
        super(rollNo, sem1Marks, sem2Marks);
    }

    // Method to calculate total based on sem1Marks, sem2Marks, and score
    public int total() {
        return sem1Marks + sem2Marks + score();
    }

    // Implementation of the score() method from the Sports interface
    public int score() {
        // Consider a sample implementation for score calculation
        // You can modify this method based on the actual scoring logic
        return 50; // Sample score
    }
}

// Main class to demonstrate the classes
public class exp4_Score {
    public static void main(String[] args) {
        // Creating an object of Result class
        Result resultObj = new Result(101, 85, 90);

        // Calculating and displaying the total
        int totalMarks = resultObj.total();
        System.out.println("Total Marks: " + totalMarks);
    }
}
