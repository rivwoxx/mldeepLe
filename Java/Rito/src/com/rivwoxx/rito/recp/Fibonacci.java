package com.rivwoxx.rito.recp;

import java.util.Arrays;

public class Fibonacci {

  public static void main(String[] args) {
    int[] fibonacci = new int[1000];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    int i = 2;
    while (i < 1000){
      fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
      i++;
    }
    System.out.println(Arrays.toString(fibonacci));

  }

}
