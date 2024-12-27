package com.yash.dataStructures.arrrays;

/**
 * Created by Yash on 1/29/2017.
 */
public class ArrayApp {

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,4,1,5,6,8,9,7,0};

        int i;

        //display

        System.out.println("Elements are : ");
        for(i=0;i<arr.length;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println("");

        //search
        int searchEle = 44;
        i=0;
        for (;i<arr.length;i++){
            if(searchEle == arr[i]){
                System.out.println("find at : "+(i+1));
                break;
            }
        }
        if(i == arr.length){
            System.out.println("Cant able to find.. !!");
        }

        //delete
        int delEle=4;
        for(i=0;i<arr.length;i++){
            if(delEle == arr[i]){
                break;
            }
        }

        for(int k=i;k<arr.length-1;k++){
            arr[k]=arr[k+1];
        }

        System.out.println("After Delete Elements are : ");
        for(i=0;i<arr.length;i++){
            System.out.print("|" + arr[i] + "|");
        }

    }
}
