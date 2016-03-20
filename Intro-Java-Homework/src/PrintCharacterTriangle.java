import java.util.*;

import static java.lang.System.in;

public class PrintCharacterTriangle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        int size = keyboard.nextInt();

        int alphaB = 97; //char 'a' onwards
        int[] abc = new int[26]; // storing a-z

        for (int i = 0; i < 26; i++) { //filling the abc array
            abc[i] = alphaB;
            alphaB++;
        }

        for (int i = 0; i < size; i++) { //upper half
            for (int j = 0; j <= i; j++) {
                System.out.print((char) abc[j] + " ");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) { //bottom half
            for (int j = 0; j < i; j++) {
                System.out.print((char) abc[j] + " ");
            }
            System.out.println();
        }
    }
}
