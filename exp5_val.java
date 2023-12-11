// Custom Exception class for InvalidCredentialsException
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

// Class to handle login validation
class LoginValidator {
    private String username = "user123";
    private String password = "pass123";

    public void validateCredentials(String enteredUsername, String enteredPassword) throws InvalidCredentialsException {
        if (!enteredUsername.equals(username) || !enteredPassword.equals(password)) {
            throw new InvalidCredentialsException("Invalid credentials! Please enter valid username and password.");
        } else {
            System.out.println("Login successful! Welcome, " + enteredUsername + "!");
        }
    }
}

// Main class to test login validation
public class exp5_val {
    public static void main(String[] args) {
        String inputUsername = "user123"; // Replace with user input
        String inputPassword = "pass123"; // Replace with user input

        LoginValidator loginValidator = new LoginValidator();

        try {
            loginValidator.validateCredentials(inputUsername, inputPassword);
        } catch (InvalidCredentialsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
