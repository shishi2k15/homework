import java.util.*;

public class PrintCharacterTriangle {
    public static void main(String[] args) {

        int inputSize = new Scanner(System.in).nextInt();

        char inputChar = 'a';
        int i = 0;

        for (i = 0; i < inputSize; i++) {                         //upper half
            for (int j = 0; j < i; j++) {
                System.out.format("%c ", inputChar + j);
            }
            System.out.println();
        }
        i--;
        for (; i >= 0; i--) {                                    //bottom half
            for (int j = 0; j <= i; j++) {
                System.out.format("%c ", inputChar + j);
            }
            System.out.println();
        }
    }
}