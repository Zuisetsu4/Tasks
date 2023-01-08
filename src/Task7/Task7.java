package Task7;
import java.util.Locale;
import util.ArrayUtils;

public class Task7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        int[] arr1 = new int[]{1, 2, 6, 4, 3, 2, 1};
        int[] arr2 = new int[]{2, 4, 1, 1, 2, 3, 4, 5, 6, 1, 2, 2, 2, 3};
        int[] arr3 = new int[]{3, 4, 9, 9, 9, 8, 6, 9, 3, 1, 1, 2, 4, 1, 5};
        int[] arr4 = new int[]{1, 7, 3, 8, 4, 4, 8, 7, 9, 9, 9, 5, 3, 2, 3};
        int[] arr5 = new int[]{1, 8, 1, 8, 2, 6, 4, 9, 4, 10, 2};
        int[] arr6 = new int[]{2};
        int[] arr7 = new int[]{9, 9, 7, 8, 4, 3, 2, 2, 2, 1, 0, 2, 4, 3};
        int[] arr8 = new int[]{3, 5, 6, 4, 2, 3, 1, 1, 9, 6, 7, 8, 4, 3};
        int[] arr9 = new int[]{20, 24, 24, 132, 32, 32, 87, 543, 123, 643};
        int[] arr10 = new int[]{10, 2, 4, 4, 56, 43, 2, 2, 4, -17, 12, -21, -231, -432, 123};
        int[] arr11 = ArrayUtils.readIntArrayFromConsole();

        //tests
        Solution solution1 = new Solution(arr1);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr1) + "}" + " amountOfMax = " + solution1.getAmountOfMax() + "; " + "amountOfMin = " + solution1.getAmountOfMin());
        System.out.println();

        Solution solution2 = new Solution(arr2);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr2) + "}" + " amountOfMax = " + solution2.getAmountOfMax() + "; " + "amountOfMin = " + solution2.getAmountOfMin());
        System.out.println();

        Solution solution3 = new Solution(arr3);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr3) + "}" + " amountOfMax = " + solution3.getAmountOfMax() + "; " + "amountOfMin = " + solution3.getAmountOfMin());
        System.out.println();

        Solution solution4 = new Solution(arr4);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr4) + "}" + " amountOfMax = " + solution4.getAmountOfMax() + "; " + "amountOfMin = " + solution4.getAmountOfMin());
        System.out.println();

        Solution solution5 = new Solution(arr5);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr5) + "}" + " amountOfMax = " + solution5.getAmountOfMax() + "; " + "amountOfMin = " + solution5.getAmountOfMin());
        System.out.println();

        Solution solution6 = new Solution(arr6);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr6) + "}" + " amountOfMax = " + solution6.getAmountOfMax() + "; " + "amountOfMin = " + solution6.getAmountOfMin());
        System.out.println();

        Solution solution7 = new Solution(arr7);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr7) + "}" + " amountOfMax = " + solution7.getAmountOfMax() + "; " + "amountOfMin = " + solution7.getAmountOfMin());
        System.out.println();

        Solution solution8 = new Solution(arr8);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr8) + "}" + " amountOfMax = " + solution8.getAmountOfMax() + "; " + "amountOfMin = " + solution8.getAmountOfMin());
        System.out.println();

        Solution solution9 = new Solution(arr9);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr9) + "}" + " amountOfMax = " + solution9.getAmountOfMax() + "; " + "amountOfMin = " + solution9.getAmountOfMin());
        System.out.println();

        Solution solution10 = new Solution(arr10);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr10) + "}" + " amountOfMax = " + solution10.getAmountOfMax() + "; " + "amountOfMin = " + solution10.getAmountOfMin());
        System.out.println();

        Solution solution11 = new Solution(arr11);
        System.out.printf("Array1: {" + ArrayUtils.toString(arr11) + "}" + " amountOfMax = " + solution11.getAmountOfMax() + "; " + "amountOfMin = " + solution11.getAmountOfMin());
        System.out.println();
    }
}
