import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by compsci on 9/7/16.
 */
public class Loops {

    public static void main(String[] args) {
        /*
        Graded
        Hybrid - use JOP for user input, but use syso's for the output
        goal: ask the user for a number, then make a times table
        like this -- let's say the number was 6
        show (formatted)
        1 x 6 = 6
        2 x 6 = 12
        3 x 6 = 18
        4 x 6 = 24
        5 x 6 = 30
        6 x 6 = 36
        end the times table when the number multiplies itself

        ex: 9
        end 9 x 9 = 81
        */
        String numInput = " ";
        int num = 0;
        int sum = 0;

        numInput = JOptionPane.showInputDialog("input a number: ");
        num = Integer.parseInt(numInput);

        for (int i = 1; i <= num; i++){
            sum = sum + num;
            System.out.println("i sum: " + i + " x " + num + " = " + sum);
        }
    }
}
