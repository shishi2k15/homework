import java.util.*;

import static java.lang.System.in;

public class SumOfN {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        int times = keyboard.nextInt();

        int firstNum = 1, secNum = 1;

        for (int i = 0; i < times; i++) {
            System.out.println(secNum);
            firstNum++;
            secNum += firstNum;
        }
    }
}
