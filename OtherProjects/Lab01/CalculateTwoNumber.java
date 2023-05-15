package lab01;

import javax.swing.JOptionPane;

public class CalculateTwoNumber {
    public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog(null, "Enter first number:", "Calculator", JOptionPane.QUESTION_MESSAGE);
        double num1 = Double.parseDouble(num1String);

        String num2String = JOptionPane.showInputDialog(null, "Enter second number:", "Calculator", JOptionPane.QUESTION_MESSAGE);
        double num2 = Double.parseDouble(num2String);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;

        String result = String.format("Sum = %.2f\nDifference = %.2f\nProduct = %.2f\nQuotient = %.2f", sum, diff, prod, quot);

        JOptionPane.showMessageDialog(null, result, "Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}
