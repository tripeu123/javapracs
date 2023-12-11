import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp6_button extends JFrame implements ActionListener {
    private JLabel label;

    public exp6_button() {
        setTitle("Button Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        label = new JLabel("Press a button");

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(label);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();
        label.setText("Button '" + buttonText + "' was pressed");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exp6_button());
    }
}
