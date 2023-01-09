package Task8.FileWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileWriter {
    public static void writeStringToFile(Path filePath, String s) throws IOException {
        Files.write(filePath, Arrays.asList(s.split("\n")));
    }
}
