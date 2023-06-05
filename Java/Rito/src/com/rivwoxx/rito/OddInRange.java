package com.rivwoxx.rito;

public class OddInRange {

  public static void main(String[] args) {
    System.out.println((countOdds(327296043, 769434803)));
  }

  public static int countOdds(int low, int high) {
    int counter = 0;
    for (int i = low; i <= high; i++) {
      if (i % 2 != 0) {
        counter++;
      }

    }
    return counter;
  }
}
