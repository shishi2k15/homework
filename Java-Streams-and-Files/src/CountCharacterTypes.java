import java.io.*;
import java.lang.String;

public class CountCharacterTypes {

    public static void main(String[] args) {
        String readLine;

        String inFilePath = "/home/Projects/Java-Streams-and-Files/src/words.txt";//fix the file path before running
        String outFilePath = "/home/Projects/Java-Streams-and-Files/src/count-chars.txt";

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath))) {

            while ((readLine = bufferedReader.readLine()) != null) {
                consonantsCount = readLine.replaceAll("[^b|c|d|f|g|h|j|k|l|m|o|p|q|r|s|t|v|w|x|y|z]", "").length();
                vowelsCount = readLine.replaceAll("[^a|e|o|u|i]", "").length();
                punctuationCount = readLine.replaceAll("[^!|,|.|?]", "").length();

                try (Writer writer = new BufferedWriter(new OutputStreamWriter(     //saving in file count-chars.txt
                        new FileOutputStream(outFilePath), "utf-8"))) {
                    writer.write("Vowels: " + vowelsCount + "\n");
                    writer.write("Consonants: " + consonantsCount + "\n");
                    writer.write("Punctuation: " + punctuationCount);
                }
            }
        } catch (IOException e) {
            System.out.println("Error.\n Invalid or missing file.");
            e.printStackTrace();
        }
        System.out.println("Done.");
    }
}