
import letmecalculate.exp2_calculate;

class exp2_caluculateimport {
    public static void main(String[] args) {
        exp2_calculate calc = new exp2_calculate();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + calc.addition(num1, num2));
        System.out.println("Subtraction: " + calc.subtraction(num1, num2));
        System.out.println("Multiplication: " + calc.multiplication(num1, num2));
        System.out.println("Division: " + calc.division(num1, num2));
    }
}
