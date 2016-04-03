import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        int length = 3;

        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        List<String> myList = Arrays.asList(words);
        myList.stream()
                .filter(n -> n.length() > length)
                .forEach(System.out::println);
    }
}
