package garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String content = "";
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line = reader.readLine();
        while(line != null) {
            content += line;
            line = reader.readLine();
        }
        reader.close();
    }
}