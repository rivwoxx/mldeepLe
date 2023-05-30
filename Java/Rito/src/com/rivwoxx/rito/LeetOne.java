package com.rivwoxx.rito;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeetOne {

  public static void main(String[] args) {

    String str = "MCMXCIV";
    List<String> list = getCharOnString(str);

    System.out.println(romantoInt(list));

  }

  private static int romantoInt(List<String> list) {
    int col = 0;
    for (int i = 0; i < list.size(); i++) {

      int value = valueRomanVsInt(list.get(i));
      col += value;

    }
    return col;
  }

    private static List<String> getCharOnString(String s) {
      return Stream.of(s.split("(?!^)")).map(elem -> new String(elem)).collect(Collectors.toList());
    }

  private static int valueRomanVsInt(String list) {
    switch (list) {
      case "I":
        return 1;
      case "X":
        return 10;
      case "L":
        return 50;
      case "C":
        return 100;
      case "D":
        return 500;
      case "M":
        return 1000;
      default:
        return 0;
    }

  }
}
