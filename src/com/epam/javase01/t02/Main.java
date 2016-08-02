package com.epam.javase01.t02;

/**
 * Created by kirillykk on 22.07.16.
 */
public class Main {

    private static void loadArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (1.0 / ((i + 1) * (i + 1)));
        }
    }

    private static void printArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("A[" + i + "] = " + arr[i]);
        }
        System.out.println("__________________\n");
    }

    private static void сheck(double e, double[] arr) {
        if (arr.length == 0) {
            System.out.printf("Array is empty!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < e) {
                    System.out.println("A[" + i + "] < E " + arr[i]);
                    break;
                }
                if(arr[i] == arr[arr.length-1]){
                    System.out.println("There are no satisfying elements");
                }

            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        double e = 2.0;
        double[] array = new double[n];

        System.out.println("E = " + e + "\n");

        loadArr(array);
        printArr(array);
        сheck(e, array);
    }
}
