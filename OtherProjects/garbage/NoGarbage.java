package garbage;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line = reader.readLine();
        while(line != null) {
            content.append(line);
            line = reader.readLine();
        }
        reader.close();
    }
}