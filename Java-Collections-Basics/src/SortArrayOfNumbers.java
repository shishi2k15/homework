import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        String nextLine = input.nextLine();
        int[]array=new int[n];

        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }

        Arrays.sort(array);

        for (int num : array) {
            System.out.printf("%d ",num);
        }
    }
}