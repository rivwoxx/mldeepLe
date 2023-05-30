package com.rivwoxx.rito;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumSortArrays {

  public static void main(String[] args) {
    int[] array1 = {3,3,3,5,2,3,4,5,6,7,88,9,0,4};
    int[] array2 = {1,4,5,3,65,3,4};

    System.out.println(Arrays.toString(sumSortedList(array1,array2)));
  }

  public static int[] sumSortedList(int[] array1, int[] array2){

    return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();


  }
}
