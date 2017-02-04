package com.yash.dataStructures.arrrays;

/**
 * Created by Yash on 2/5/2017.
 */
public class LowArrayApp {

    public static void main(String[] args) {
        int size = 5;
        LowerArray items = new LowerArray(size);

        items.setItems(0,1);
        items.setItems(1,2);
        items.setItems(2,3);
        items.setItems(3,4);
        items.setItems(4,5);
        int i=0;
        //display
        for(i=0;i<size;i++){
            System.out.print("|" + items.getItems(i) + "|");
        }
        System.out.println("");

        //search
        int searchItem = 2;
        for(i=0;i<size;i++){
            if(searchItem == items.getItems(i))
                break;
        }
        if(i==size)
            System.out.println("Not found !!!");
        else
            System.out.println("fount at : "+(i+1));

        //delete
        int delItem=3;
        for (i=0;i<size;i++){
            if(delItem == items.getItems(i))
                break;
        }
        for(int j = i;j<size-1;j++){
            items.setItems(j,items.getItems(j+1));
        }
        size--;
        //display
        for(i=0;i<size;i++){
            System.out.print("|" + items.getItems(i) + "|");
        }
        System.out.println("");
    }
}
