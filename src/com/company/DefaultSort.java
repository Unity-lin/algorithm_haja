package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultSort{
    public static void main(String[] args){
        int[] arr = RandomNumbers.getNumbersArray();

        long start, end;
        start = System.currentTimeMillis();
        List<Integer> result = Arrays.stream(arr)
                .boxed().sorted().collect(Collectors.toList());
        end = System.currentTimeMillis();
        System.out .println((end - start) / 1000.0 + "초 걸림.");
    }
}
