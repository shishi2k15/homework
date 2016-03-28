import java.util.Scanner;
import java.io.*;


public class AllCapitals {
    public static void main(String[] args) {
        String readLine;

        String inFilePath = "/home/roy/Projects/GitHub/homework.git/Java-Streams-and-Files/src/lines.txt";              //fix the file path before running
        String outFilePath = "/home/roy/Projects/GitHub/homework.git/Java-Streams-and-Files/src/all-capitals.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath));
             Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFilePath), "utf-8"))) {
            while ((readLine = bufferedReader.readLine()) != null) {

                String upperC = readLine.toUpperCase();

                System.out.println(upperC);

                writer.write(upperC);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

    }
}