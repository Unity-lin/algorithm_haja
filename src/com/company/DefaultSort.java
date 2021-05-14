package com.company;

import java.util.Arrays;

public class DefaultSort{
    public static void main(String[] args){
        int[] arr = {5, 6, 1, 2, 7, 6, 8, 10};
        System.out.println("before sort");

        Arrays.stream(arr).forEach(a ->{System.out.println(a);});

        System.out.println("after sort");

        Arrays.stream(arr).sorted().forEach(a ->{System.out.println(a);});
    }
}
