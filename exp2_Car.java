class Car {
    private String brand;

    // Constructor to initialize the brand field with "Ford"
    public Car() {
        this.brand = "Ford";
    }

    public String getBrand() {
        return this.brand;
    }
}

public class exp2_Car {
    public static void main(String[] args) {
        Car car = new Car(); // Create an instance of the Car class
        String carBrand = car.getBrand(); // Retrieve the brand value
        System.out.println("Brand of the car is: " + carBrand); // Print the brand value
    }
}
