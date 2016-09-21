import javax.swing.*;

/**
 * Created by compsci on 8/25/16.
 */
public class Runner {

    // class variables or field variables

    public static void main(String[] args) {

        // local or method variables
        String firstName = " ";
        String lastName = " ";
        String showMSG = " ";
        String length_string = " ";
        String height_string = " ";
        String width_string = " ";
        float length = 0;
        float width = 0;
        float height = 0;
        float volume = 0;

        firstName = JOptionPane.showInputDialog("Yo! What is your first name?");
        showMSG = "So cool to meet you, " + firstName;
        JOptionPane.showMessageDialog(null, showMSG);
        lastName = JOptionPane.showInputDialog("And now what is your last name, " + firstName + "?");
        showMSG = "Great! Now we can be better friends. " + firstName + " " + lastName;
        JOptionPane.showMessageDialog(null, showMSG);


        //convert string to int
        //1. define an int variable (at the top)
        int age = 0;
        //2. if you don't already have a string variable, make one as well
        String age_string = "16";
        //3 use built in converter
        age = Integer.parseInt(age_string);

        age_string = JOptionPane.showInputDialog("How young are you, what is your age?");
        age = Integer.parseInt(age_string); //this is math, add, subtract...
        age = age + 5;
        JOptionPane.showMessageDialog(null, "Your age in 5 years will be " + age);


        length_string = JOptionPane.showInputDialog("How long is the box");
        width_string = JOptionPane.showInputDialog("How wide is the box");
        height_string = JOptionPane.showInputDialog("How high is the box");
        //JOptionPane.showMessageDialog(null, volume_result);
        //volume = length * width * height

        length = Float.parseFloat(length_string);

        width = Float.parseFloat(width_string);

        height = Float.parseFloat(height_string);

        volume = length * width * height;
        JOptionPane.showMessageDialog(null, volume);

        //convert string to float


        System.exit(0);


    }


}