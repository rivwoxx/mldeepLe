package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

  public static void main(String[] args) {
//    int[] values = {3,4,6,7,8,9,23,14,23,4343,23,12,1,43,54,232,5,23,234,2,3,4,1};
//
//    System.out.println("Before : " + Arrays.toString(values));
//
//    mergeSort(values);
//
//    System.out.println("After : " + Arrays.toString(values));

    Random r = new Random();
    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = r.nextInt(10);
    }

    System.out.println("Before : " + Arrays.toString(nums));

    mergeSort(nums);

    System.out.println("After : " + Arrays.toString(nums));
  }

  private static void mergeSort(int[] inputArray) {

    int inputLength = inputArray.length;
    /*
      If the lenght is less than one pretty much is already sorted.
      Or well you cannot sort something that has only one value.
     */
    if (inputLength < 2) {
      return;
    }

    int midIx = inputLength / 2;
    int[] leftHalf = new int[midIx];
    int[] rightHalf = new int[inputLength - midIx];

    for (int i = 0; i < midIx; i++) {
      leftHalf[i] = inputArray[i];
    }

    for (int i = midIx; i < inputLength; i++) {
      rightHalf[i - midIx] = inputArray[i];
    }

    mergeSort(leftHalf);
    mergeSort(rightHalf);

    merge(inputArray, leftHalf, rightHalf);
  }

  private static void merge(int[] inputArray, int[] left, int[] right) {
    int leftSize = left.length;
    int rightSize = right.length;

    int i = 0, j = 0, k = 0;

    while (i < leftSize && j < rightSize) {
      if (left[i] <= right[j]) {
        inputArray[k] = left[i];
        i++;
      } else {
        inputArray[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < leftSize) {
      inputArray[k] = left[i];
      i++;
      k++;
    }

    while (j < rightSize) {
      inputArray[k] = right[j];
      j++;
      k++;
    }
  }

}
