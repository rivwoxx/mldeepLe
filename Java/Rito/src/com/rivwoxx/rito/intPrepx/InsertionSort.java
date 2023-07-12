package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

  public static void main(String[] args) {
    Random r = new Random();
    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = r.nextInt(100);
    }

    System.out.println("Before : " + Arrays.toString(nums));

    insertSort(nums);

    System.out.println("After : " + Arrays.toString(nums));
  }

  public static void insertSort(int[] input){
    for(int i = 1; i< input.length; i++){
      int currentValue = input[i];

      int j = i  - 1;
      while(j >= 0 && input[j] > currentValue){
        input[j+1] = input[j];
        j--;
      }
      input[j+1] = currentValue;
    }
  }

}
