package com.epam.javase01.t06;


/**
 * Created by kirillykk on 22.07.16.
 */
public class Main {

    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.showArr();
        nb.addToArr(0, "Cat");
        nb.removeFromArr(3);
        nb.showArr();
    }
}
