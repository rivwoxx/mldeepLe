package com.rivwoxx.rito;

import java.util.ArrayList;
import java.util.List;

public class Tst1 {

  public static void main(String[] args) {
    int number = 23;

    System.out.println(separtedNumbers(number));
    List<Integer> sepnums = separtedNumbers(number);
    System.out.println(squaredSumed(sepnums));
    System.out.println(isHappy(number));
  }

  public static boolean isHappy(int number) {
    int cont = 0;
    while (number != 1) {
      number = squaredSumed(separtedNumbers(number));
      if (cont == 7) {
        return false;
      }
      cont++;
    }
    return true;
  }

  public static List<Integer> separtedNumbers(int number) {
    List<Integer> sepNums = new ArrayList<>();
    while (number > 0) {
      sepNums.add(number % 10);
      number /= 10;
    }

    return sepNums;
  }

  public static int squaredSumed(List<Integer> sepNums) {
    int comp = 0;
    for (int i = 0; i < sepNums.size(); i++) {
      comp += sepNums.get(i) * sepNums.get(i);
    }
    return comp;
  }

}