package com.epam.javase01.t03;

import static java.lang.Math.round;

/**
 * Created by kirillykk on 22.07.16.
 */
public class Main {

    private static void tgFunc(double start, double finish, double step, double[][] array) {
        while (start <= finish) {
            for (int i = 0; i < array.length; i++) {
                array[i][0] = start;
                array[i][1] = Math.tanh(2 * start)-3;
                start += step;
            }
        }
    }


    private static void printArrByRow(double[][] array) {
        System.out.printf("__X_|___F(X)=tg(2X)-3____\n");
        for (double[] anArray : array) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.printf("%.1f", anArray[j]);
                } else {
                    System.out.println(" | " + anArray[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        double step = 0.2;
        double start = 1.0;
        double finish = 2.0;

        double n = round((finish - start) / step) + 1;
        System.out.println("Number of rows = " + n + "\n");

        double[][] array = new double[(int) n][2];

        tgFunc(start, finish, step, array);

        printArrByRow(array);
    }
}
