public class exp2_Student {
    private String name;

    // Constructor
    public exp2_Student() {
        this.name = "Unknown"; // If no name is provided, set it to "Unknown"
    }

    // Constructor with parameter
    public exp2_Student(String name) {
        this.name = name; // Set the name to the provided value
    }

    // Method to get the student's name
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        // Creating objects of Student class
        exp2_Student student1 = new exp2_Student(); // No name provided
        exp2_Student student2 = new exp2_Student("Alice"); // Name provided: "Alice"

        // Printing the names of students
        System.out.println("Student 1's name: " + student1.getName()); // Output: Unknown
        System.out.println("Student 2's name: " + student2.getName()); // Output: Alice
    }
}
