package com.rivwoxx.rito;

import java.util.HashMap;
import java.util.Map;

public class LeetOneSecondSol {


  public static void main(String[] args) {
    String roman = "MCMXCIV";
    if (roman.length() > 15 || roman.length() < 1) {
      throw new RuntimeException("Invalid Number!");
    }

    romanToInt(roman);

  }

  private static void romanToInt(String roman) {

    int previousValue = 4000;

    Map<String, Integer> romanIntMap = new HashMap<>() {{
      put("I", 1);
      put("V", 5);
      put("X", 10);
      put("L", 50);
      put("C", 100);
      put("D", 500);
      put("M", 1000);
    }};
    int res = 0;

    for (char key : roman.toCharArray()) {
      String keyString = Character.toString(key);

      if (!romanIntMap.containsKey(keyString)) {
        System.out.println("Value " + keyString);
        throw new RuntimeException("Invalid Value in String");
      }

      int currentValue = romanIntMap.get(keyString);
      if (currentValue > previousValue && previousValue < currentValue ) {
        if (previousValue * 5 == currentValue || previousValue * 10 == currentValue) {
          res += previousValue;
        }else {
          throw new RuntimeException("******Invalid Value: " + previousValue);
        }

      }

      previousValue = currentValue;

    }
    int sum = roman.chars()
        .mapToObj(c -> String.valueOf((char) c))
        .filter(romanIntMap::containsKey)
        .mapToInt(romanIntMap::get)
        .sum();

    System.out.println(sum - (res * 2));


  }
}
