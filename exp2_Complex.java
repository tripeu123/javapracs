class Complex {
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    // Constructor with parameters
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Method to set the real part of the complex number
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    // Method to set the imaginary part of the complex number
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Method to get the real part of the complex number
    public double getRealPart() {
        return this.realPart;
    }

    // Method to get the imaginary part of the complex number
    public double getImaginaryPart() {
        return this.imaginaryPart;
    }
}

public class exp2_Complex {
    public static void main(String[] args) {
        // Creating objects of Complex class
        Complex complex1 = new Complex(); // Using default constructor
        Complex complex2 = new Complex(3.5, 2.0); // Using parameterized constructor

        // Testing methods of the Complex class
        System.out.println("Complex 1 - Real Part: " + complex1.getRealPart() +
                ", Imaginary Part: " + complex1.getImaginaryPart());
        System.out.println("Complex 2 - Real Part: " + complex2.getRealPart() +
                ", Imaginary Part: " + complex2.getImaginaryPart());

        // Setting new values using setter methods
        complex1.setRealPart(1.0);
        complex1.setImaginaryPart(4.5);

        // Getting updated values using getter methods
        System.out.println("Updated Complex 1 - Real Part: " + complex1.getRealPart() +
                ", Imaginary Part: " + complex1.getImaginaryPart());
    }
}
