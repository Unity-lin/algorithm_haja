package com.company;

import java.util.Random;

public class SelectionSort {

    private static int[] sort(){

        int data[] = RandomNumbers.getNumbersArray();

        int i, j;
        int min;
        int index=0;
        int temp;
        for(i = 0; i < data.length; i++){
            min = Integer.MAX_VALUE;
            for(j=i; j< data.length; j++){
                if(min > data[j]){
                    min = data[j];
                    index = j;
                }
            }
            temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        System.out.println(data);
        return data;
    }

    public static void main(String[] args){
        long start, end;
        start = System.currentTimeMillis();
        int results[] = sort();
        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

//        for(int a:results){
//            System.out.println(a);
//        }
    }
}
