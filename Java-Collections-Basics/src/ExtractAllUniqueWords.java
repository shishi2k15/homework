import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractAllUniqueWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase()
                                 .split("([().,!?:;'\"-]|\\s)+");
        Set<String> words = new TreeSet();
        for (String string : input) {
            words.add(string);
        }
        for (String string : words) {
            System.out.print(string + " ");
        }
    }

}