import javax.swing.*;

/**
 * Created by compsci on 8/31/16.
 */
public class StartHere {

    public static void main(String[] args) {
        //local or method variables, work only inside of this method
        String ageInput = " ";
        int age = 0;
        String msg = " ";
        String genderInput = " ";
        int grade = 0;
        String gradeInput = " ";
        char gender = ' ';

        ageInput = JOptionPane.showInputDialog("Hello, what is your age?");
        age = Integer.parseInt(ageInput);

        /* next task is to get gender, M, F
        * 1. create vars - String input, convert to upper case and char
        * 2. add to if block as booleans
        * 3. test, test, test, test, test, test, test, test, test, yeah
        */

        genderInput = JOptionPane.showInputDialog("Please input your gender, as M or F");
        genderInput = genderInput.toUpperCase();

        gender = genderInput.charAt(0);
        msg = "Your gender is " + genderInput + " gender char is " + gender;
        JOptionPane.showMessageDialog(null, msg);

        gradeInput = JOptionPane.showInputDialog("What is your grade?");
        grade = Integer.parseInt(gradeInput);


        // just one if
        /*
        * 1. minor female -- if
        * 2. minor male -- else if
        * 3. adult female -- else if
        * 4. adult male -- else if
        * 5. input error -- else
         */

        /*
        *
        *
        * DECISION: AGE, GENDER & GRADE IN SCHOOL
        * GRADE IN SCHOOL MUST BE PRINTED AS
        * FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
        * MUST -NOT-BE PRINTED AS 9, 10, 11, 12
        *
        * EXAMPLE
        *
        * "You are a minor/adult female senior"
        *
        *
         */

        // Boolean math use && for "AND" use || for "OR"
        if (age < 18 && grade == 9 && gender == 'F'){
            msg = "You are a minor female freshman";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 9 && gender == 'M'){
            msg = "you are a minor male freshman";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 10 && gender == 'F'){
            msg = "you are a minor female sophomore";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 10 && gender == 'M'){
            msg = "you are a minor male sophomore";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 11 && gender == 'F'){
            msg = "you are a minor female junior";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 11 && gender == 'M'){
            msg = "you are a minor male junior";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 12 && gender == 'F'){
            msg = "you are a minor female senior";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age < 18 && grade == 12 && gender == 'M'){
            msg = "you are a minor male senior";
            JOptionPane.showMessageDialog(null, msg);
            ////////////////////////////////////////////////
        }else if (age >= 18 && grade == 9 && gender == 'M'){
            msg = "you are an adult male freshman";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age >= 18 && grade == 10 && gender == 'F'){
            msg = "you are an adult female sophomore";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age >= 18 && grade == 10 && gender == 'M'){
            msg = "you are an adult male sophomore";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age >= 18 && grade == 11 && gender == 'F'){
            msg = "you are an adult female junior";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age >= 18 && grade == 11 && gender == 'M'){
            msg = "you are an adult male junior";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age >= 18 && grade == 12 && gender == 'F'){
            msg = "you are an adult female senior";
            JOptionPane.showMessageDialog(null, msg);

        }else if (age >= 18 && grade == 12 && gender == 'M'){
            msg = "you are an adult male senior";
            JOptionPane.showMessageDialog(null, msg);

        }else {
            msg = "Sorry, input error";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}

