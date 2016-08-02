package com.epam.javase01.t04;

import java.util.Random;

/**
 * Created by kirillykk on 22.07.16.
 */
public class Main {

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("A[" + i + "]= " + arr[i]);
        }
    }

    private static void loadArr(int[] arr) {

        final Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    private static void chekMaxSum(int[] arr) {
        if (arr.length == 0) {
            System.out.printf("Array is empty!");
            return;
        }
        int maxSum = arr[0] + arr[arr.length - 1];
        int numFirst = 0;
        int numSecond = arr.length - 1;
        for (int i = 1; i < arr.length / 2; i++) {
            if (arr[i] + arr[arr.length - i - 1] > maxSum) {
                maxSum = (arr[i] + arr[arr.length - i - 1]);
                numFirst = i;
                numSecond = arr.length - i - 1;
            }
        }
        System.out.println("Max Sum of pair elem[" + numFirst + ", " + numSecond + "] = "
                + arr[numFirst] + " + " + arr[numSecond] + " = " + maxSum);
    }

    public static void main(String[] args) {

        int n = 6;
        int[] Array = new int[n];

        loadArr(Array);
        printArr(Array);
        chekMaxSum(Array);
    }
}
