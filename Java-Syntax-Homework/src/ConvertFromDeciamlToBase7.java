import java.util.Scanner;

public class ConvertFromDeciamlToBase7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numToConvert = input.nextInt();

        System.out.println(Integer.toString(numToConvert, 7));

    }
}
