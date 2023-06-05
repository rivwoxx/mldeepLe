package com.rivwoxx.rito;

import java.util.Arrays;

public class AbEx {

  public static void main(String[] args) {
    int x = 5;
    int y = 2;
    int[] arr1 = {1, 3, 4, 5, 2};

    int x2 = 4;
    int y2 = 7;
    int[] arr2 = {1, 3, 4, 2};
    System.out.println(
        "Input 1 " + x + " input 2 " + y + " array: " + Arrays.toString(arr1) + " is --> "
            + findToysTime(x, y, arr1));

    System.out.println(
        "Input 1 " + x2 + " input 2 " + y2 + " array: " + Arrays.toString(arr2) + " is --> "
            + findToysTime(x2, y2, arr2));
  }

  public static int findToysTime(int x, int y, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {

        if (arr[j] + arr[i] == y && j != i) {
          return j;
        }
      }
    }
    return -1;

    //throw exception here =P
  }
}
