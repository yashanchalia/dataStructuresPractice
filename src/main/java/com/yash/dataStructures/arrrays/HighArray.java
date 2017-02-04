package com.yash.dataStructures.arrrays;

/**
 * Created by Yash on 2/5/2017.
 */
public class HighArray {
    int[] items;
    int nItems;

    public HighArray(int size) {
        this.items = new int[size];
    }

    public void insert(int value){
        this.items[nItems++]=value;
    }

    public void display(){
        int i=0;
        for(;i<nItems;i++){
            System.out.print("|" + items[i] + "|");
        }
        System.out.println("");
    }

    public void search(int element){
        int i=0;
        for(;i<nItems;i++){
            if(element == items[i]){
                break;
            }
        }

        if(i == nItems) {
            System.out.println("NOT FOUND");
        }else{
            System.out.println("found at "+(i+1));
        }
    }

    public void delete(int element){
        int i=0;
        for(;i<nItems;i++){
            if(element == items[i]){
                break;
            }
        }

        if(i == nItems) {
            System.out.println("NOT FOUND");
        }else{
            for(int j=i; j<nItems-1;j++){
                items[j]=items[j+1];
            }
            nItems--;
        }

    }
}
