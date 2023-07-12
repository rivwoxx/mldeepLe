package com.rivwoxx.rito.excs2;

import java.util.Arrays;
import java.util.Objects;

public class ValidAnagram {

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";

    String[] ss = s.split("");
    System.out.println(Arrays.toString(ss));
    System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {

    if(s.length() != t.length()){
      return false;
    }
    String[] ss = s.split("");
    String[] tt = t.split("");

    Arrays.sort(ss);
    Arrays.sort(tt);

    for (int i = 0; i < ss.length; i++) {
      if (!Objects.equals(ss[i], tt[i])) {
        return false;
      }
    }
    return true;
  }

}
