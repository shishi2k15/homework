import java.util.Scanner;

public class CalculateN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = keyboard.nextInt();
        int number = calculatefactorial(n);
        System.out.println("Factorial: " +number);
    }
    public static int calculatefactorial(int n){
        int factorialnumbers=1;
        while(n>0){
            factorialnumbers=(int)(factorialnumbers*n--);
        }
        return factorialnumbers;
    }
}