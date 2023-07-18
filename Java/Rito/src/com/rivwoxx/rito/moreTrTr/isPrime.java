package com.rivwoxx.rito.moreTrTr;

public class isPrime {

  public static void main(String[] args) {
    System.out.println(isPrimeNumber(23456));

  }

  public static boolean isPrimeNumber(int number) {
    if (number == 2) {
      return true;
    }

    if (number % 2 == 0 || number < 2) {
      return false;
    }

    for(int i = 3; i <= Math.sqrt(number); i+=2){
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }

}
