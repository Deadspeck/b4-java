/**
 * Created by compsci on 9/15/16.
 */
public class TheBeginning {
     /*
     The first known secret code
     it is an alphabet shift
     start with plain text, and a "key"
     let's say key = 2, and plain tex is abc
     then a + 2 --> c
     b + 2 --> d
     c + 2 --> e
     so secret code for abc is cde
     deciphering the code is just reversing the key


     GRADED REQUIREMENT
     PART ONE - THE FIRST GRADE

     1. Fix the spaces
     2. Fix the z warp (hint: if index + key > 26, then subtract 26
     example z + 2 is 25 + 2 = 27; 27 > 25 so crash; instead if > 25 subtract 25
     so from above 27 - 25 = 2 = b perfect!

     for this part syso will be fine

     PART 2
     add decoding knowing the key -- reverse the process

     PART 3
     crack a code where you do not know the key!
     JOP'd and jar's -- at the very end
      */

    public static void main(String[] args) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int key = 2;
        String plainText = "";
        String codecText = "";
        int indexPlaintext = 0;
        int indexShifted = 0;

        // one baby step at a time -- couple lines of code + test...



        plainText = plainText.toLowerCase();

        for (int i = 0; i < plainText.length(); i++) {
            indexPlaintext = alpha.indexOf(plainText.charAt(i));
            indexShifted = indexPlaintext + key;
            codecText = codecText + alpha.charAt(indexShifted);
        }

        System.out.println("Original: " + plainText);
        System.out.println("key: " + key);
        System.out.println("Secret Code Msg: " + codecText);

    }
}
