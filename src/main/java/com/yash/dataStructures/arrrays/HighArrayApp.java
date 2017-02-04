package com.yash.dataStructures.arrrays;

/**
 * Created by Yash on 2/5/2017.
 */
public class HighArrayApp {

    public static void main(String[] args) {
        HighArray highArray = new HighArray(5);

        highArray.insert(1);
        highArray.insert(2);
        highArray.insert(3);
        highArray.insert(4);
        highArray.insert(5);

        highArray.display();

        highArray.search(8);

        highArray.delete(4);

        highArray.display();
    }
}
