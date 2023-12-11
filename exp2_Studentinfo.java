class Student {
    String name;
    int roll_no;
}

public class exp2_Studentinfo {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student studentObj = new Student();

        // Assigning values to the variables of the Student object
        studentObj.name = "John";
        studentObj.roll_no = 2;

        // Displaying the assigned values
        System.out.println("Student Name: " + studentObj.name);
        System.out.println("Student Roll No.: " + studentObj.roll_no);
    }
}
