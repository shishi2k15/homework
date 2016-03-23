import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String numToConvert = input.next();

        try {
            Integer decimalRep = Integer.valueOf(numToConvert, 7);
            System.out.println(decimalRep);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
    }
}
