/**
 * Created by compsci on 9/13/16.
 */
public class Runner {

    // Strings -- class notes with working examples
    // * toUpperCase - toLowerCase
    // * compareTo (alphabetical compare)
    // * indexOf -- find the position of a char in a string
    // endWith - startWith
    // * substring -- heavily used on AP / College tests
    // * equals -- must NOT ise math operators with string! do not use =
    // * chatAt
    // trim
    // valueOF

    // Strings are character arrays -- so what are arrays?

    public static void main(String[] args) {

        String name = "Mr.McClendon";
        System.out.println("name normal: " + name);
        name = name.toLowerCase();
        System.out.println("name lowercase: " + name);
        name = name.toUpperCase();
        System.out.println("name uppercase: " + name);

        System.out.println();

        int result;
        String s1 = "Abc";
        String s2 = "Abc";

        result = s1.compareTo(s2);

        if (result < 0) {
            System.out.println("s1 < s2");
            System.out.println(s1 + " alphabetically comes before " + s2);

        } else if (result == 0) {
            System.out.println("s1 == s2");
            System.out.println(s1 + " is the same alphabetically as " + s2);

        } else {
            System.out.println("s1 > s2");
            System.out.println(s1 + " alphabetically comes after " + s2);

        }

        // working examples of equals

        System.out.println();
        String seq1 = "mHS";
        String seq2 = "MHS";

        // WRONG way! Always tested!
        // if (seq1 == seq2) must NOT use math operators with Strings!
        // instead, you must ALWAYS use a String method, like .equals

        if (seq1.equalsIgnoreCase(seq2)){
            System.out.println(seq1 + " is equal to " + seq2);
        }

        else {
            System.out.println(seq1 + " is NOT equal to " + seq2);
        }

        // Strings as a char array -- what is an array?
        // an array is a group of similar things
        // [] means an array, a collection of simillar things

        String[] stringArray = new String[5];

        stringArray[0] = "Welcome ";
        stringArray[1] = "to ";
        stringArray[2] = "my ";
        stringArray[3] = "favorite ";
        stringArray[4] = "store.";

        for (int i = 0; i <= 4; i++){
            // System.out.println(stringArray[i]);
            System.out.print(stringArray[i]);
        }
        System.out.println();
        // start of examples THURS 15 SEPT
        String myWord = "Thursday";
        // use substring
        for (int i = 0; i < myWord.length(); i++){
            System.out.println("index " + i + " letter is " + myWord.substring(i, i+1));
        }

        String outputTxt = "";
        System.out.println();
        // use chatAt
        for (int i = 0; i < myWord.length(); i++) {

            System.out.println("index: " + i + " letter is: " + myWord.charAt(i));
            outputTxt = outputTxt + myWord.charAt(i);
        }

        // loop is done
        System.out.println();
        System.out.println("Output text is: " + outputTxt);

            // final intro notes
            // how to use indexOf()
            // myWord.indexOf(char)
            // Thursday -- let's find the index for d
            // myWord.indexOf('d'); -- return an int, a number for the index

            System.out.println();
            int indexPosn = 0;
            indexPosn = myWord.indexOf('d');
            System.out.println("index of d in Thursday is: " + indexPosn);

        }

    }

