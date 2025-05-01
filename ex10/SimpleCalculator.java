import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField display;
    private String currentInput = "";
    private double firstOperand = 0;
    private String currentOperator = "";

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 24));

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                currentInput += command;
                display.setText(currentInput);
            } 
            else if (command.matches("[+\\-*/]")) {
                if (!currentInput.isEmpty()) {
                    firstOperand = Double.parseDouble(currentInput);
                    currentOperator = command;
                    currentInput = "";
                }
            } 
            else if (command.equals("=")) {
                if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
                    double secondOperand = Double.parseDouble(currentInput);
                    double result = calculate(firstOperand, secondOperand, currentOperator);
                    display.setText(String.valueOf(result));
                    currentInput = String.valueOf(result);
                    currentOperator = "";
                }
            } 
            else if (command.equals("C")) {
                currentInput = "";
                firstOperand = 0;
                currentOperator = "";
                display.setText("");
            }
        }

        private double calculate(double a, double b, String operator) {
            switch (operator) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": 
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        return 0;
                    }
                    return a / b;
                default: return 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}
