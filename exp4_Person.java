// Person class
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}   

// Employee class derived from Person
class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters for Employee class
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Equals method overridden to compare employee records
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
                startYear == employee.startYear &&
                nationalInsuranceNumber.equals(employee.nationalInsuranceNumber);
    }
}

// Main class for testing Employee class
public class exp4_Person {
    public static void main(String[] args) {
        // Creating Employee objects and testing functionalities
        Employee employee1 = new Employee("John Doe", 50000, 2018, "ABC123");
        Employee employee2 = new Employee("Jane Smith", 60000, 2019, "DEF456");
        Employee employee3 = new Employee("John Doe", 50000, 2018, "ABC123");

        // Displaying employee details
        System.out.println("Employee 1 Details:");
        displayEmployeeDetails(employee1);
        System.out.println("\nEmployee 2 Details:");
        displayEmployeeDetails(employee2);

        // Testing equality between employee records
        System.out.println("\nEmployee 1 equals Employee 2: " + employee1.equals(employee2));
        System.out.println("Employee 1 equals Employee 3: " + employee1.equals(employee3));
    }

    // Method to display employee details
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Start Year: " + employee.getStartYear());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
