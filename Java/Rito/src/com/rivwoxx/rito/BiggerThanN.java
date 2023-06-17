package com.rivwoxx.rito;

import java.util.Arrays;

public class BiggerThanN {

  public static void main(String[] args) {
    int[] nums = {8, 1, 2, 2, 3};
    System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
  }


  public static int[] smallerNumbersThanCurrent(int[] nums) {

    int[] retu = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int num : nums) {
        if (nums[i] > num) {
          count++;
        }
      }
      retu[i] = count;
    }
    return retu;
  }

}
