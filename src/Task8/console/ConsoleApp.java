package Task8.console;
import Task8.FileWork.FileReader;
import Task8.Sort;
import util.ArrayUtils;
import java.util.Locale;

public class ConsoleApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        try{
            InputArgs cmdArgs = InputArgs.fromCmdArgs(args);
           int[][] arr = ArrayUtils.getIntArray2FromString(FileReader.readFromFile(cmdArgs.inFile), true);
           Sort.sort(arr, )
        }
        catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
    }
}
