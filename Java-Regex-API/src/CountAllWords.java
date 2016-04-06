
import java.util.Scanner;

public class CountAllWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("([().,!?:;'\"-]|\\s)+");
        System.out.println();
        System.out.println(words.length);
    }
}