package com.rivwoxx.rito;

import java.util.Arrays;

public class LeetTwoSum {

  public static void main(String[] args) {
    int[] nums = {2,5,5,11};
    int target = 10;

    System.out.println(Arrays.toString(twoSum(nums, target)));

  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int x = 1; x < nums.length; x++) {

        if (nums[x] + nums[i] == target && x != i) {
          return new int[] {i,x} ;
        }
      }
    }

    return null;
  }
}
