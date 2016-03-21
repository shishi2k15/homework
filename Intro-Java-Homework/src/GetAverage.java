import java.util.Scanner;

public class GetAverage {
    public static double getAverage(double a, double b, double c) {
        double avg = (a + b + c) / 3.0;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        double average = getAverage(firstNum, secondNum, thirdNum);

        System.out.printf("%.2f", average);
    }
}
