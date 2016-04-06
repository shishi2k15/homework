import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Matcher matcher = Pattern.compile("(?:[\\w\\d\\.-_])+@(?=.{4,64}$)(?:[\\w\\d]+[-]?[\\w\\d]+\\.|[\\w\\d]\\.)+(?:\\w{2,})").matcher(input);
        while (matcher.find()) {
                System.out.println(matcher.group());
        }
    }
}
