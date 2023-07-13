package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;

public class binSearch {

  public static void main(String[] args) {
//    int[] arrayOfNumbers = {1,3,5,9,12,15,18,21,24,25};
    int[] arrayOfNumbers = {-1,0,3,3,4,5,9,12};
    System.out.println(Integer.toString(binarySearch(arrayOfNumbers, 12)));
//    System.out.println(Arrays.binarySearch(arrayOfNumbers,3));

  }

  private static int binarySearch(int[] nums, int valueToFind) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int midPoss = (low + high) / 2;
      int middleNum = nums[midPoss];

      if (valueToFind == middleNum) {
        return midPoss;
      }
      if (valueToFind < middleNum) {
        high = midPoss - 1;
      } else {
        low = midPoss + 1;
      }

    }
    return -1;
  }

}
