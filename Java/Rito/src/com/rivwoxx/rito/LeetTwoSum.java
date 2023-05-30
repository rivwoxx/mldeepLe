package com.rivwoxx.rito;

import java.util.Arrays;

public class LeetTwoSum {

  public static void main(String[] args) {
    int[] nums = {3,2,4};
    int target = 7;

    int[] result = twoSum(nums, target);
    if(result[0] == result[1]){
      throw new RuntimeException("Error!");
    }
    System.out.println(Arrays.toString(twoSum(nums, target)));

  }

  public static int[] twoSum(int[] nums, int target) {
    int[] sum = {0,0};
    for (int i = 0; i < nums.length; i++) {
      for (int x = 1; x < nums.length; x++) {

        int m = nums[x] + nums[i];
        if (m == target) {
          sum[0] = i;
          sum[1] = x;
          return sum;
        }
      }
    }

    return sum;
  }
}
