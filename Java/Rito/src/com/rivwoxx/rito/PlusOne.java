package com.rivwoxx.rito;

import java.util.Arrays;

public class PlusOne {

  public static void main(String[] args) {
    int[] digits = {9,9};
    System.out.println(Arrays.toString(plusOne(digits)));
  }

  public static int[] plusOne(int[] digits) {
    digits[digits.length - 1] += 1;
    if((digits[digits.length - 1] + 1) == 10){
      return new int[] {1,0};
    }
    return digits;
  }
}
