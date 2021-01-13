package com.company;

/*
* @author Daniel Andrés
* @version 1.0
* */
public class Main {
    /*
     * show menseege in the display
     * @param msg, is the messeger of dispplay
     * @param repeat, number of repeast in the display
     * @author Daniel Andrés
     * */
    public static void print(String msg, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(msg);
        }
    }

    /*
    * method contructor
    * @author Daniel Andrés
    * */
    public static void main(String[] args) {
        print("Whatsaaaaa !!", 4);
    }
}