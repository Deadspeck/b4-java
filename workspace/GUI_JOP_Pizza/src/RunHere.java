import javax.swing.*;

/**
 * Created by compsci on 9/19/16.
 */
public class RunHere {

    /*
    GRADED - REQUIREMENTS

    1. add a drink dropdown JOP
    2. when both pizza and drink have been selected, JOP the result
    example
    "Thank you for ordering a combo pizza and root beer"
     */

    public static void main(String[] args) {

        Object[] possibilities = {"ham", "spam", "yam", "chicken", "watermelon", "Secret Flavor"};
        String s = (String) JOptionPane.showInputDialog(
                null,
                "Please select a pizza:\n"
                        + "Order a pizza",
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "ham");

//If a string was returned, say so.
        if ((s != null) && (s.length() > 0)) {
            setLabel(s);
            return;
        }

//If you're here, the return value was null/empty.
        setLabel("Come on, order a pizza!");

    }

    public static void setLabel(String setString) {

        JOptionPane.showMessageDialog(null, setString);

        Object[] possibilities = {"water", "cola", "A&W", "powerade", "watermelon", "Secret Flavor"};
        String s = (String) JOptionPane.showInputDialog(
                null,
                "Please select a drink:\n"
                        + "What drink would you like?",
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "ham");

//If a string was returned, say so.
        if ((s != null) && (s.length() > 0)) {
            finalOrder(s);
            return;
        }

//If you're here, the return value was null/empty.
        finalOrder("Come on, what is your drink!");

    }

    public static void finalOrder(String setFinal) {

        JOptionPane.showMessageDialog(null, "Thank you for ordering a combo pizza and a " + setFinal);

    }

}
