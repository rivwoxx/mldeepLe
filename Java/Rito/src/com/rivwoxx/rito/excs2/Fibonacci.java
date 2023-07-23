package com.rivwoxx.rito.excs2;

import java.util.Arrays;

public class Fibonacci {

  public static void main(String[] args) {
//    System.out.println(Arrays.toString(fibonacciSequence(10)));
    printNumbers(fibonacciSequence(10));
  }

  public static int[] fibonacciSequence(int limit) {
    int[] numbers = new int[limit];

    numbers[0] = 0;
    numbers[1] = 1;

    for (int i = 2; i < numbers.length; i++) {
      numbers[i] = numbers[i - 1] + numbers[i - 2];
    }

    return numbers;
  }

  public static void printNumbers(int[] numbers){
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
