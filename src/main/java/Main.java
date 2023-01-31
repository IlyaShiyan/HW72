import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int c;

        try (FileReader fileReader = new FileReader("C:/Test/File1.txt")) {

            while ((c = fileReader.read()) != -1) {
                if ((char) c == 'a') {
                    count++;
                }
            }
            FileWriter fileWriter = new FileWriter("C:/Test/File1.txt");
            fileWriter.write(Integer.toString(count));
            fileWriter.close();

        }
    }
}
