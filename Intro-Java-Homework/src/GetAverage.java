import java.text.DecimalFormat;
import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] arr = new double[3];

        for (int i = 0; i < 3; i++) {
            double input = scan.nextDouble();
            arr[i] = input;
        }

        double sum = arr[0] + arr[1] + arr[2];
        double average = sum / 3;

        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(average));
    }
}
