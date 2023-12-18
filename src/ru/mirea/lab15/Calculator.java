package ru.mirea.lab15;

import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    private JFrame frame;
    private JTextField displayField;
    private String currentInput = "";
    private String operator = "";
    private double firstNumber;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setLayout(null);

        displayField = new JTextField();
        displayField.setBounds(20, 20, 250, 50);
        displayField.setEditable(false);

        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        JButton[] buttons = new JButton[buttonLabels.length];

        int x = 20, y = 80, width = 50, height = 40;
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setBounds(x, y, width, height);
            x += width + 10;

            if (i % 4 == 3) {
                x = 20;
                y += height + 10;
            }

            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonText = e.getActionCommand();
                    if (buttonText.matches("[0-9]")) {
                        currentInput += buttonText;
                        displayField.setText(currentInput);
                    } else if (buttonText.matches("[+\\-*/]")) {
                        if (!currentInput.isEmpty()) {
                            firstNumber = Double.parseDouble(currentInput);
                            operator = buttonText;
                            currentInput = "";
                        }
                    } else if (buttonText.equals("=")) {
                        if (!currentInput.isEmpty()) {
                            double result = calculateResult(firstNumber, Double.parseDouble(currentInput), operator);
                            displayField.setText(String.valueOf(result));
                            currentInput = String.valueOf(result);
                            operator = "";
                        }
                    } else if (buttonText.equals("C")) {
                        currentInput = "";
                        operator = "";
                        displayField.setText("");
                    }
                }
            });

            frame.add(buttons[i]);
        }

        frame.add(displayField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private double calculateResult(double firstNumber, double secondNumber, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}