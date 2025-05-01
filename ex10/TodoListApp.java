import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoListApp extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> taskList;
    private JTextField taskInput;

    public TodoListApp() {
        setTitle("To-Do List Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        taskList.setFont(new Font("Arial", Font.PLAIN, 16));

        taskInput = new JTextField(20);
        taskInput.setFont(new Font("Arial", Font.PLAIN, 16));

        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Selected");

        
        JPanel inputPanel = new JPanel();
        inputPanel.add(taskInput);
        inputPanel.add(addButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(removeButton);

        
        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskInput.setText("");
                } else {
                    JOptionPane.showMessageDialog(TodoListApp.this, 
                        "Please enter a task", 
                        "Error", 
                        JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(TodoListApp.this, 
                        "Please select a task to remove", 
                        "Error", 
                        JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        
        taskInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addButton.doClick(); 
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TodoListApp().setVisible(true);
            }
        });
    }
}
