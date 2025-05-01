import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerButton;
    private JLabel messageLabel;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        
        registerButton = new JButton("Register");
        messageLabel = new JLabel("");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(registerButton);
        add(messageLabel);

        // Register button action
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateForm();
            }
        });

        setVisible(true);
    }

    private void validateForm() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        // Clear previous messages
        messageLabel.setText("");
        messageLabel.setForeground(Color.RED);

        // Validation checks
        if (name.isEmpty()) {
            messageLabel.setText("Name cannot be empty.");
            return;
        }
        if (email.isEmpty() || !email.contains("@")) {
            messageLabel.setText("Please enter a valid email.");
            return;
        }
        if (password.isEmpty()) {
            messageLabel.setText("Password cannot be empty.");
            return;
        }
        if (!password.equals(confirmPassword)) {
            messageLabel.setText("Passwords do not match.");
            return;
        }

        // If all validations pass
        messageLabel.setForeground(Color.GREEN);
        messageLabel.setText("Registration successful!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}
