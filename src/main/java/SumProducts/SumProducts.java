package SumProducts;

import javax.swing.*;
import java.awt.*;

public class SumProducts {
    public static void main(String[] args) {
        SumProducts sp = new SumProducts();
        int numVal = intInput("Enter a numeric value");
        String sumorP = input("Sum or Product?");
        if (sumorP.equals("Sum")) {
            int valToPrint = sp.sumOfN(numVal);
            output("" + valToPrint);
        }
        else {
            int prodToPrint = sp.prodN(numVal);
            output("" + prodToPrint);
        }
    }

    public int sumOfN(int n) {
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum + n;
    }

    public int prodN(int n) {
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum *=i;
        }
        return sum * n;
    }






    // displays frame requesting and returning user's input
    public static String input(String message) {
        return JOptionPane.showInputDialog(message);
    }

    // displays frame requesting and returning user's input & converts to integer
    public static int intInput(String message) {
        String userInput = input(message);
        int numericInput = Integer.parseInt(userInput);
        return numericInput;
    }


    // displays frame with specified output message
    public static void output(String message) {
        JOptionPane.showMessageDialog(new JFrame("Output"), message);
    }
}