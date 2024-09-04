package org.springboot.numaddwithspring.ui;


import org.springboot.numaddwithspring.NumaddwithspringApplication;
import org.springboot.numaddwithspring.numService.NumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class NumAdderFrame extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    private NumService numService;

    public NumAdderFrame(NumService numService) {
        this.numService = numService;
        setTitle("Number Adder");
        setSize(340, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel num1Label = new JLabel("Write Num1:");
        JLabel num2Label = new JLabel("Write Num2:");

        num1Field = new JTextField();
        num2Field = new JTextField();
        JButton addButton = new JButton("Add");
        resultLabel = new JLabel();

        num1Label.setBounds(30, 30, 140, 40);
        num1Field.setBounds(30, 75, 100, 30);
        num2Label.setBounds(180, 30, 140, 40);
        num2Field.setBounds(180, 75, 100, 30);
        addButton.setBounds(100, 170, 120, 40);
        resultLabel.setBounds(100, 120, 240, 40);

        addButton.addActionListener(e -> addNumbers());

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(addButton);
        add(resultLabel);
    }

    private void addNumbers() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int sum = numService.add(num1, num2);
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(NumaddwithspringApplication.class);
        NumService numService = context.getBean(NumService.class);

        SwingUtilities.invokeLater(() -> {
            NumAdderFrame frame = new NumAdderFrame(numService);
            frame.setVisible(true);
        });
    }
}
