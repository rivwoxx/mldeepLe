package com.rivwoxx.rito;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Last3 {

  public static void main(String[] args) {
    String input = "aaaabbbbcccccdddddddd";

    System.out.println(countCharacters(input));

  }

  public static Map<Character, Integer> countCharacters(String str) {
    Map<Character, Integer> charCounts = new HashMap<>();

    for (char c : str.toCharArray()) {
      charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
    }

    return charCounts;
  }

}
