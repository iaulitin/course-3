package tkhorzhevskiy;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int arrLen = 12;
        int arrDia = 10;
        int[] arr = new int[arrLen];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = (int) Math.round((Math.random() * arrDia));

        }
        System.out.print("Исходный массив");
        System.out.println(Arrays.toString(arr));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив");
        System.out.println(Arrays.toString(arr));
    }
}
