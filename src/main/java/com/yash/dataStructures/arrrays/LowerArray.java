package com.yash.dataStructures.arrrays;

/**
 * Created by Yash on 2/5/2017.
 */
public class LowerArray {
    int[] items;

    public LowerArray(int size) {
        this.items = new int[size];
    }

    public int getItems(int index) {
        return items[index];
    }

    public void setItems(int index,int value) {
        this.items[index] = value;
    }
}
