package com.epam.javase01.t06;


/**
 * Created by kirillykk on 02.08.16.
 */

/**
 * Блокнот, который умеет хранить, добавлять, удалять и выводить записи из массива.
 * @author Kirillykk
 * @version 1.0
 */

public class Notebook {

    /**
     * Определение суммы слагаемых
     * @param arr массив String[]
     * @param dimension количестов элементов массива
     */

    private String[] arr;

    /**
     *  При создании нового объекта массив заполняется
     *  элементами с названием Elem и его индексом
     */
    Notebook() {
        int dimension = 5;
        arr = new String[dimension];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Elem" + i;
        }
    }

    /**
     *  Добавляем элемент в массив */
    void addToArr(int n, String newString) {
        for (int i = 0; i < arr.length; i++){
            arr[n] = newString;
        }
    }

    /** Выводим весь массив */
    void showArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " №" + i);
        }
        System.out.printf("\n");
    }

    /** Удаляем элемент массива по номеру */
    void removeFromArr(int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[n] = "del ";
        }
    }
}

