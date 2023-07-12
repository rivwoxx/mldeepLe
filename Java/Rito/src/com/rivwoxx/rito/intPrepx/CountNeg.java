package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;

public class CountNeg {

  public static void main(String[] args) {
    int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
    System.out.println(countNegatives(grid));
  }

  public static int countNegatives(int[][] grid) {
    int negNumsCount = 0;

    for (int[] values : grid) {
      for (int num : values) {
        if (num < 0) {
          negNumsCount++;
        }
      }
    }

    return negNumsCount;
  }
}
