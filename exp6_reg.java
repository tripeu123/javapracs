import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp6_reg extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JLabel nameLabel, emailLabel, passwordLabel;
    private JButton submitButton;

    public exp6_reg() {
        setTitle("Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        nameLabel = new JLabel("Name: ");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        emailLabel = new JLabel("Email: ");
        emailField = new JTextField();
        add(emailLabel);
        add(emailField);

        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        if (isValidEmail(email)) {
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isValidEmail(String email) {
        // Regex pattern for validating Gmail format
        String emailRegex = "^[a-zA-Z0-9_.+-]+@gmail\\.com$";
        return email.matches(emailRegex);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exp6_reg());
    }
}
