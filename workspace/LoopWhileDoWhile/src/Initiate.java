/**
 * Created by compsci on 9/9/16.
 */
public class Initiate {
    /*
    for loops -- are most used often when you know how many times you will loop

    while loop --  when you do NOT know how many times to loop

    2 kinds of while loops

    1. while
    2. do-while

    the do-while ALWAYS runs at least one time
    the while loop might NEVER run
     */
    public static void main(String[] args) {

        int count = 0;
        int remain = 0;
        while (count < 25) {

            remain = count % 2;
            System.out.println("count = " + count + ", remainder = " + remain);
            count++;
            //count /= 3;
            //count *= 2;
            //count -= 2;
            //count += 2;
            //count = count + 2;
            //count++;
            //count = count + 1;

            int num = 0;
            do {
                System.out.println("num = " + num);
                num++;

            }while (num < 12);

        }

    }
}
