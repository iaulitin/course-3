package tkhorzhevskiy;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[12];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = (int) Math.round((Math.random() * 10));

        }
        System.out.print("Исходный массив");
        System.out.println(Arrays.toString(arr));
        boolean j = false;
        int temp;
        while (!j) {
            j = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    j = false;

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
