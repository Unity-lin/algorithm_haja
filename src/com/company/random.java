package com.company;

public class random {

    public static void main(String[] args){

        int[] a = new int[500001];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }

        randoms(a, 500001);

        for(int i=0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
    public static void randoms(int[] array, int count){
        int t1, t2, r1, r2;

        for(int i=0; i<count; i++) {
            r1 = (int)(Math.random() * array.length);
            t1 = array[r1];
            r2 = (int)(Math.random() * array.length);
            t2 = array[r2];
            array[r1]= t2;
            array[r2] = t1;
        }
    }
}
