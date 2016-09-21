import javax.swing.*;

/**
 * Created by compsci on 9/9/16.
 */
public class TheBeginning {
    /*
    GRADED
    JOP's and jared up
    ask user for a number (int)
    test that number for odd or even
    JOP the result "Number is odd / even"
    ask user "Do you want to go again Y/N?"
    if No, "Thank you, Good Bye"
    if Yes, go again ask for a new number
     */
    public static void main(String[] args) {
        String numInput = " ";
        int num = 0;

        numInput = JOptionPane.showInputDialog("Input Your Number Here: ");
        num = Integer.parseInt(numInput);

        int count = 1;
        int remain = 1;
        while (count < num) {

            remain = count % 2;
            System.out.println("count = " + count + ", remainder = " + remain);
            count++;

            if (remain == 1){
                System.out.println("Your Number Is Odd");
            }
            else if (remain == 0){
                System.out.println("Your Number Is Even");

            }
            //count /= 3;
            //count *= 2;
            //count -= 2;
            //count += 2;
            //count = count + 2;
            //count++;
            //count = count + 1;
        }
    }
}