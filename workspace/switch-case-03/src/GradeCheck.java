/**
 * Created by compsci on 9/2/16.
 */
public class GradeCheck {

    public static void main(String[] args) {
        /*
        * 1. get a grade
        * 2. create a method called grading (new)
        * 3. using syso to show the grade result excellent, good...
        * 4. create a 2nd method called prediction, with a pass parm
        * 5. using syso show pass/fail prediction
        */

        grading('A');
        System.out.println();
        grading('B');
        System.out.println();
        grading('C');
        System.out.println();
        grading('D');
        System.out.println();
        grading('F');
        System.out.println();
        grading('a');
        System.out.println();
        grading('s');

        //end of main
    }

    public static void grading(char letterGrade) {

        int successPredictor = -10; // no meaning just an initializer

        switch (letterGrade) {

            case 'A':
                successPredictor = 5;
                System.out.println("Congrats, an A is Awesome!");
                break; // we found an answer so skip the remaining class

            case 'B':
                successPredictor = 4;
                System.out.println("Way to go, a B is berry berry good!");
                break; // we found an answer so skip the remaining class

            case 'C':
                successPredictor = 3;
                System.out.println("Alright! a C is Cool!");
                break; // we found an answer so skip the remaining class

            case 'D':
                successPredictor = 2;
                System.out.println("Okay, D is in Diploma, but watch yourself");
                break; // we found an answer so skip the remaining class

            case 'F':
                successPredictor = 1;
                System.out.println("Kevin...");
                break; // we found an answer so skip the remaining class

            default:
                successPredictor = 0;
                System.out.println("Whoa, nothing matched, ERROR!!!");
                break; // not needed, this is always the last statement

        }

        prediction(successPredictor);

    }

    public static void prediction(int successFactor) {

        switch (successFactor){

            case 5:
                System.out.println("Prediction is great for success in this course!");
                break;

            case 4:
                System.out.println("Prediction is for a lot of learning!");
                break;

            case 3:
                System.out.println("Prediction is for learning lots of new stuff!");
                break;

            case 2:
                System.out.println("Prediction is chance of trouble!");
                break;

            case 1:
                System.out.println("Prediction is chance of TROUBLE!");
                break;

            case 0:
                System.out.println("Something went wrong in method grading!");
                break;

            default:
        }

    }

}