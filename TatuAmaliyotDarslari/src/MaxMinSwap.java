public class MaxMinSwap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        arr[maxIndex] = min;
        arr[minIndex] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
