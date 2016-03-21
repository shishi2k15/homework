import java.util.*;

public class SumOfN {
    public static void main(String[] args) {

        int times = new Scanner(System.in).nextInt();

        int num = 0;

        for (int i = 0; i <= times; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
