package com.rivwoxx.rito.excs2;

import java.util.Arrays;

public class PrimePrinter {

  public static void main(String[] args) {
    int range = 10;
//    System.out.println(Arrays.toString(primePrinter(range)));
    System.out.println(isPrime(17));
  }

  private static int[] primePrinter(int range) {
    int[] primes = new int[range];
    int length = primes.length;
    int num = 3;
    primes[0] = 2;
    int a = 1;

    while (primes[length - 1] == 0) {
      if (isPrime(num)) {
        primes[a] = num;
        a++;
        num++;
      }
      num++;
    }

    return primes;
  }


  public static boolean isPrime(int x) {
    if (x < 2 || x % 2 == 0) {
      return false;
    }
    double sq = Math.sqrt(x);
    for (int i = 3; i <= sq; i += 2) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }


}
