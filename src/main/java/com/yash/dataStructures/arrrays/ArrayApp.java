package com.yash.dataStructures.arrrays;

/**
 * Created by Raj on 1/29/2017.
 */
public class ArrayApp {

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,4,1,5,6,8,9,7,0};

        //search

        int searchEle = 4;
        int i=0;
        for (;i<arr.length;i++){
            if(searchEle == arr[i]){
                System.out.println("find at : "+(i+1));
                break;
            }
        }
        if(i == arr.length){
            System.out.println("Cant able to find.. !!");
        }

        System.out.println(arr.length);

    }
}
