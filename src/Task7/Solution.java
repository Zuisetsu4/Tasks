package Task7;

public class Solution {
    int amountOfMax = 0;
    int amountOfMin = 0;
    public Solution(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++){
        if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
            amountOfMin = amountOfMin + 2;
            }
        else if (arr[i] < arr[i - 1] || arr[i] < arr[i + 1]) {
            amountOfMin = amountOfMin + 1;
            }
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                amountOfMax = amountOfMax + 2;
            }
        else if (arr[i] > arr[i - 1] || arr[i] > arr[i + 1]) {
                amountOfMax = amountOfMax + 1;
            }
        }
    }
    public int getAmountOfMax(){
        return amountOfMax;
    }
    public int getAmountOfMin(){
        return amountOfMin;
    }
}

