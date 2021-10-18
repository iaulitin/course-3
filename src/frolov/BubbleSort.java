package frolov;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] initialArr = generateArray();
        System.out.println("Массив до сортировки: " + Arrays.toString(initialArr));
        int[] sortedArr = sortArr(initialArr);
        System.out.println("Массив после сортировки: " + Arrays.toString(sortedArr));
    }

    static int[] generateArray() {
        Random randomNum = new Random();
        int arrayLen = 10;
        int[] myArr = new int[arrayLen];
        int randomRange = 10;

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = randomNum.nextInt(randomRange);
        }
        return myArr;
    }

    static int[] sortArr(int[] myArr) {
        int arrLen = myArr.length;
        for (int i = 0; i < arrLen; i++) {
            for (int j = i + 1; j < arrLen; j++) {
                if (myArr[i] > myArr[j]) {
                    swap(myArr, i, j);
                }
            }
        }
        return myArr;
    }

    static void swap(int[] myArr, int i, int j) {
        int tmp = myArr[i];
        myArr[i] = myArr[j];
        myArr[j] = tmp;
    }

}
