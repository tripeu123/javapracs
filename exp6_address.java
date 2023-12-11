import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp6_address extends JFrame implements ActionListener {
    private JTextField nameField, streetField, cityField, pinCodeField;
    private JButton myInfoButton;

    public exp6_address() {
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        JLabel streetLabel = new JLabel("Street: ");
        streetField = new JTextField();
        add(streetLabel);
        add(streetField);

        JLabel cityLabel = new JLabel("City: ");
        cityField = new JTextField();
        add(cityLabel);
        add(cityField);

        JLabel pinCodeLabel = new JLabel("Pin Code: ");
        pinCodeField = new JTextField();
        add(pinCodeLabel);
        add(pinCodeField);

        myInfoButton = new JButton("MyInfo");
        myInfoButton.addActionListener(this);
        add(myInfoButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String street = streetField.getText();
        String city = cityField.getText();
        String pinCode = pinCodeField.getText();

        JLabel infoLabel = new JLabel("<html>Name: " + name + "<br>Street: " + street + "<br>City: " + city +
                "<br>Pin Code: " + pinCode + "</html>");
        infoLabel.setFont(new Font("Arial", Font.ITALIC, 32));

        JFrame infoFrame = new JFrame("My Info");
        infoFrame.setSize(400, 300);
        infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        infoFrame.setLayout(new FlowLayout());
        infoFrame.add(infoLabel);
        infoFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new exp6_address();
    }
}
