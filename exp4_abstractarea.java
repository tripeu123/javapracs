// Abstract class Shape
abstract class Shape {
    abstract double area(); // Abstract method to calculate area
}

// Circle class derived from Shape
class Circle extends Shape {
    double radius; // Member: Radius of the circle

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the area() method for circle
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class derived from Shape
class Rectangle extends Shape {
    double length; // Member: Length of the rectangle
    double width;  // Member: Width of the rectangle

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the area() method for rectangle
    double area() {
        return length * width;
    }
}

// Triangle class derived from Shape
class Triangle extends Shape {
    double base;   // Member: Base of the triangle
    double height; // Member: Height of the triangle

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of the area() method for triangle
    double area() {
        return 0.5 * base * height;
    }
}

// Main class to demonstrate area calculation for different shapes
public class exp4_abstractarea {
    public static void main(String[] args) {
        // Creating objects of Circle, Rectangle, and Triangle classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8);

        // Calculating and displaying areas of the shapes
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
