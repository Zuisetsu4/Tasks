package Task8;

public class Sort {

    private static void swapColumns(int[][] arr, int columnIndex1, int columnIndex2) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][columnIndex1];
            arr[i][columnIndex1] = arr[i][columnIndex2];
            arr[i][columnIndex2] = temp;
        }
    }

    public static void sort (int[][] arr, int rowIndex) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[rowIndex][i] > arr[rowIndex][j]) {
                minIndex = j;
                }
            }
            if (minIndex != i) {
                swapColumns(arr, i, minIndex);
            }
        }
    }
}

