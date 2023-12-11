import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp6_calc extends JFrame implements ActionListener {

    private JTextField displayField;

    public exp6_calc() {
        setTitle("Scientific Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "sin", "cos", "tan", "sqrt"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("=".equals(command)) {
            evaluateExpression();
        } else {
            displayField.setText(displayField.getText() + command);
        }
    }

    private void evaluateExpression() {
        String expression = displayField.getText();
        try {
            if (expression.contains("sin")) {
                int index = expression.indexOf("sin");
                double value = Double.parseDouble(expression.substring(0, index));
                value = Math.sin(Math.toRadians(value));
                displayField.setText(String.valueOf(value));
            } else if (expression.contains("cos")) {
                int index = expression.indexOf("cos");
                double value = Double.parseDouble(expression.substring(0, index));
                value = Math.cos(Math.toRadians(value));
                displayField.setText(String.valueOf(value));
            } else if (expression.contains("tan")) {
                int index = expression.indexOf("tan");
                double value = Double.parseDouble(expression.substring(0, index));
                value = Math.tan(Math.toRadians(value));
                displayField.setText(String.valueOf(value));
            } else if (expression.contains("sqrt")) {
                int index = expression.indexOf("sqrt");
                double value = Double.parseDouble(expression.substring(0, index));
                value = Math.sqrt(value);
                displayField.setText(String.valueOf(value));
            } else {
                // Evaluate normal arithmetic expression
                double result = evaluateArithmeticExpression(expression);
                displayField.setText(String.valueOf(result));
            }
        } catch (NumberFormatException ex) {
            displayField.setText("Error");
        }
    }

    private double evaluateArithmeticExpression(String expression) {
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        char operator = ' ';

        for (String token : tokens) {
            if (token.matches("[+*/-]")) {
                operator = token.charAt(0);
            } else {
                double value = Double.parseDouble(token);
                switch (operator) {
                    case '+':
                        result += value;
                        break;
                    case '-':
                        result -= value;
                        break;
                    case '*':
                        result *= value;
                        break;
                    case '/':
                        if (value != 0) {
                            result /= value;
                        } else {
                            displayField.setText("Error: Division by zero");
                            return 0;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            exp6_calc calculator = new exp6_calc();
            calculator.setVisible(true);
        });
    }
}
