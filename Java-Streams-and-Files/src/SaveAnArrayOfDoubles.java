import java.io.*;
import java.util.Arrays;
import java.util.List;

public class SaveAnArrayOfDoubles {
    public static void main(String[] args) {

        String outFilePath = "/home/Projects/Java-Streams-and-Files/src/doubles.lst";

        List<Double> arrList = Arrays.asList(1.38, 2.56, 4.3);


        try {
            File file = new File(outFilePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //set this to the string you are trying to write
            bw.write(String.valueOf(arrList));
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            FileOutputStream fos = new FileOutputStream(outFilePath);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(outFilePath);                                                                               // write MenuArray to ObjectOutputStream
//            oos.close();
//
//            try (Writer writer = new BufferedWriter(new OutputStreamWriter(                                             //saving in file count-chars.txt
//                new FileOutputStream(outFilePath)))) {
//                for (int i = 0; i < list.size() ; i++) {
//                    writer.write((double)list.toArray()[i] + "\n");
//                }
//            }
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        }
    }
}
