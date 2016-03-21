import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine();
        String[] array = input.split("");

        for (int i = 0; i < input.length(); i++) {
            switch (array[i]) {
                case "0":
                    System.out.print("Gee");
                    break;
                case "1":
                    System.out.print("Bro");
                    break;
                case "2":
                    System.out.print("Zuz");
                    break;
                case "3":
                    System.out.print("Ma");
                    break;
                case "4":
                    System.out.print("Duh");
                    break;
                case "5":
                    System.out.print("Yo");
                    break;
                case "6":
                    System.out.print("Dis");
                    break;
                case "7":
                    System.out.print("Hood");
                    break;
                case "8":
                    System.out.print("Jam");
                    break;
                case "9":
                    System.out.print("Mack");
                    break;

                }
        }
    }
}