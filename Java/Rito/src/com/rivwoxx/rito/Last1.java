package com.rivwoxx.rito;

import java.util.Arrays;

public class Last1 {

  public static void main(String[] args) {
    int[] numbers = getPrimeNumbers(10);

    for (int number : numbers) {
      System.out.println(number);
    }
  }

  private static int[] getPrimeNumbers(int limit) {
    int[] primeNumbers = new int[limit];
    primeNumbers[0] = 2;
    int numbers = 3;
    int i = 1;
    while (i < limit) {
      if (isPrimeNumber(numbers)) {
        primeNumbers[i] = numbers;
        i++;
      }
      numbers++;
    }
    return primeNumbers;
  }
  private static boolean isPrimeNumber(int number){
    if (number % 2 == 0 || number < 2){
      return false;
    }

    for(int i = 0; number < Math.sqrt(number); i+=2){
      if(number % i ==0){
        return false;
      }
    }
    return true;
  }


}
