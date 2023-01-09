package Task8.console;
import Task8.FileWork.FileReader;
import Task8.FileWork.FileWriter;
import Task8.Sort;
import util.ArrayUtils;

import java.util.Arrays;
import java.util.Locale;

public class ConsoleApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        try{
            InputArgs cmdArgs = InputArgs.fromCmdArgs(args);

            int rowIndex = Integer.parseInt(FileReader.readLineFromFile(cmdArgs.inFile, 0));

            String data = FileReader.readFromFile(cmdArgs.inFile);
            int[][] arr = ArrayUtils.getIntArray2FromString(data.substring(data.indexOf('\n') + 1).split("\n"),
                    true);
            Sort.sort(arr, rowIndex);
            FileWriter.writeStringToFile(cmdArgs.outFile, ArrayUtils.getStringFromIntArray2(arr));
        }
        catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
    }
}
