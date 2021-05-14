package com.company;

public class SelectionSort {
    private static int data[] = {5, 10, 1, 7, 8, 6, 4, 2, 3, 9};

    private static int[] sort(int[] data){
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
        int results[] = sort(data);
        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

        for(int a:results){
            System.out.println(a);
        }
    }
}
