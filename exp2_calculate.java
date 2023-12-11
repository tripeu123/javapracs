
package letmecalculate;

public class exp2_calculate {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not-a-Number for division by zero
        }
        return (double) a / b;
    }
}
