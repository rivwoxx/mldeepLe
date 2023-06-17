package com.rivwoxx.rito;

import java.util.Arrays;

public class thirdMaxNum {

  public static void main(String[] args) {
    int[] nums = {1,2};
    System.out.println(thirdMax(nums));
  }

  private static int thirdMax(int[] nums) {
    Arrays.sort(nums);
    int maxNumber = nums[nums.length - 1];
    if(nums.length < 3){
      return maxNumber;
    }
    for(int i = nums.length - 1; i > 0 ; i--){
      if(nums[i] != nums[i - 1]){
        maxNumber = i;
      }
    }
    return maxNumber;
  }

}
