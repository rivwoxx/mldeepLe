package com.rivwoxx.rito.intPrepx;


import java.util.Arrays;

public class SearchRange {

  public static void main(String[] args) {
    int[] arrayOfNumbers = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
//    int[] arrayOfNumbers = {};
    System.out.println(Arrays.toString(searchRange(arrayOfNumbers, 5)));
  }

  public static int[] searchRange(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    int lenght = nums.length;

//    if (nums[low] == target && nums[high] == target) {
//      return new int[]{0, 0};
//    }

    while (low <= high) {
      int midPosition = (high + low) / 2;

      if (target == nums[midPosition]) {
        if (nums.length == 1) {
          return new int[]{0, 0};
        }
        int nHigh = midPosition;
        int nLow = midPosition;

          while (nums[nHigh + 1] == nums[midPosition] && nHigh < nums.length - 2) {
            nHigh++;
          }
          if(nums[nHigh+1] == target){
            nHigh++;
          }
          while (nums[nLow - 1] == nums[midPosition] && nLow > 1) {
            nLow--;
          }
          if(nums[0] == target){
            nLow--;
          }

        return new int[]{nLow, nHigh};
      } else if (target < nums[midPosition]) {
        high = midPosition - 1;
      } else {
        low = midPosition + 1;
      }
    }

    return new int[]{-1, 1};
  }

}
