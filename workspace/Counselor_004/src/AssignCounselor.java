import javafx.beans.property.adapter.JavaBeanObjectProperty;

import javax.swing.*;

/**
 * Created by compsci on 9/2/16.
 */
public class AssignCounselor {

    public static void main(String[] args) {

    /*
    * 1. use JOP's - jar it up - for a grade
    * 2. Get student's last name
    * 3. Convert to Uppercase
    * 4. Pull out first letter of the last name
    * 5. Send initial to the method named getCounselor
    * 6. JOP shows the assigned counselor for that student
    */

        String lastName = " ";
        char initialName = ' ';
        String msg = " ";

        msg = "Hello, what is your last name?";
        lastName = JOptionPane.showInputDialog(msg);
        lastName = lastName.toUpperCase();
        JOptionPane.showMessageDialog(null, lastName);
        initialName = lastName.charAt(0);
        msg = "Your last initial is " + initialName;
        JOptionPane.showMessageDialog(null, initialName);
        getCounselor(initialName);
    }

    public static void getCounselor(char initialForLastName) {

        String msg = " ";


        switch (initialForLastName) {

            case 'A':
                msg = "Your counselor is Ms.Joblin";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'C':
                msg = "Your counselor is Ms.Joblin";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'B':
                msg = "Your counselor is Ms.Joblin";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'D':
                msg = "Your counselor is Ms.Joblin";
                JOptionPane.showMessageDialog(null, msg);
                break;
            case 'E':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'F':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'G':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'H':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'I':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'J':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'K':
                msg = "Your counselor is Ms. Hull";
                JOptionPane.showMessageDialog(null, msg);
                break;
            case 'L':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'M':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'N':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'O':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;
            case 'P':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'Q':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'R':
                msg = "Your counselor is Ms. Stafford";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'S':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;
            case 'T':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'U':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'V':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'X':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;
            case 'Y':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case 'Z':
                msg = "Your counselor is Mr. Langly";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case '1':
                msg = "ERROR! ERROR! ERROR!";
                JOptionPane.showMessageDialog(null, msg);
                break;

            case '2':
                msg = "ERROR! ERROR! ERROR!";
                JOptionPane.showMessageDialog(null, msg);
                default:;

        /*
        * A-D = Ms. Joblin
        * E-K = Ms. Hull
        * L-R = Ms. Stafford
        * S-Z = Mr. Langly
        * must use switch case, do not use if's
        */


        }
    }
}