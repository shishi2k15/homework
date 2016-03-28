import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class SumLines {

    public static void main(String[] args) {
    //fix the file path before running
        String filePath = "/home/Projects/Java-Streams-and-Files/src/lines.txt";
        String readLine;

        try (BufferedReader bufferedReader = new BufferedReader(new    FileReader(filePath))) {
            while ((readLine = bufferedReader.readLine()) != null) {

                int sum = 0;
                for (int i = 0; i < readLine.length(); i++) {
                    sum += (int) readLine.charAt(i);
                }

                System.out.println(readLine + ": " + sum);
            }
        } catch (IOException e) {
            System.out.println("Error.\n Invalid or missing file.");
            e.printStackTrace();
        }
    }
}