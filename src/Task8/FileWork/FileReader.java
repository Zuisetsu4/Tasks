package Task8.FileWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader{
    public static String readFromFile(Path filePath) throws IOException {
        return String.join("\n", Files.readAllLines(filePath));
    }

    public static String readLineFromFile(Path filePath, int lineIndex) throws IOException {
        return Files.readAllLines(filePath).get(lineIndex);
    }
}
