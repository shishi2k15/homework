import java.util.Scanner;

import static java.lang.System.in;

public class GhettoNumeralSystem {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        String input = keyboard.next();

        char firstChar = input.charAt(0);
        System.out.println(firstChar);

        int num = Integer.parseInt(input);
        if (input.contains("0")) {
            input = input.replaceAll("0", "Gee");
        }
        if (input.contains("1")) {
            input = input.replaceAll("1", "Bro");
        }
        if (input.contains("2")) {
            input = input.replaceAll("2", "Zuz");
        }
        if (input.contains("3")) {
            input = input.replaceAll("3", "Ma");
        }
        if (input.contains("4")) {
            input = input.replaceAll("4", "Duh");
        }
        if (input.contains("5")) {
            input = input.replaceAll("5", "Yo");
        }
        if (input.contains("6")) {
            input = input.replaceAll("6", "Dis");
        }
        if (input.contains("7")) {
            input = input.replaceAll("7", "Hood");
        }
        if (input.contains("8")) {
            input = input.replaceAll("8", "Jam");
        }
        if (input.contains("9")) {
            input = input.replaceAll("9", "Mack");
        }

        System.out.println(input);
    }
}