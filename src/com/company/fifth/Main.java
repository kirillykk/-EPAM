package com.company.fifth;

/**
 * Created by kirillykk on 22.07.16.
 */
public class Main {

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println(" ");
        }
    }

    private static void loadArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (arr.length == i + j + 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];

        loadArr(array);
        printArr(array);
    }
}
