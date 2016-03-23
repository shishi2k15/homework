import java.util.Scanner;


public class FormatingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int intNum = input.nextInt();
        double doubleNum1 = input.nextDouble();
        double doubleNum2 = input.nextDouble();

        String numInHex = Integer.toHexString(intNum).toUpperCase();
        String numInBin = String.format("%10s", Integer.toBinaryString(intNum).replace(' ', '0'));

        if (doubleNum2 % 1 == 0) {
            System.out.printf("|%-10s|%10s|%10.2f|%-10.0f|", numInHex, numInBin, doubleNum1, doubleNum2);
        } else {
            System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", numInHex, numInBin, doubleNum1, doubleNum2);
        }
    }
}
