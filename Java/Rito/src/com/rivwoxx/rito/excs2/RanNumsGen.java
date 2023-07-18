package com.rivwoxx.rito.excs2;

import java.util.Arrays;
import java.util.Random;

public class RanNumsGen {

  public static void main(String[] args) {
    Random r = new Random();
    int[] nums = new int[20];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = r.nextInt(20);
    }

    System.out.println(Arrays.toString(nums));
  }

}
