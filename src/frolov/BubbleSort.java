package frolov;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] initialArr = getArray();
        System.out.println("Массив до сортировки: " + Arrays.toString(initialArr));
        int[] sortedArr = sortingArr(initialArr);
        System.out.println("Массив после сортировки: " + Arrays.toString(sortedArr));
    }

    static int[] getArray() {
        Random randomNum = new Random();
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNum.nextInt(10);
        }
        return myArray;
    }

    static int[] sortingArr(int[] myArr) {
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
