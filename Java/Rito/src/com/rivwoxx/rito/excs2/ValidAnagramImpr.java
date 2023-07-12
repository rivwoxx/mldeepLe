package com.rivwoxx.rito.excs2;

import java.util.Arrays;

public class ValidAnagramImpr {

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";

    System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {
    char[] cS = s.toCharArray();
    char[] tS = s.toCharArray();

    Arrays.sort(cS);
    Arrays.sort(tS);

    return Arrays.equals(cS, tS);
  }

}
