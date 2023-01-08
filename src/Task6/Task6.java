package Task6;
import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        Sequence sequence = new Sequence(x, n , e);
        System.out.println(sequence.getSum());
        System.out.println(sequence.getSum2());
        System.out.println(sequence.getSum3());
        System.out.println(sequence.getY());
    }
}
