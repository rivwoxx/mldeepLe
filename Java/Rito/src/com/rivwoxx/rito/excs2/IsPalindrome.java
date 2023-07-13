package com.rivwoxx.rito.excs2;

public class IsPalindrome {

  public static void main(String[] args) {
    String Poop = "Metric";
    System.out.println(isPali(Poop));
  }

  public static boolean isPali(String str) {
    StringBuilder reversedString = new StringBuilder();

    for (int x = str.length() - 1; x >= 0; x--) {
      reversedString.append(str.toLowerCase().charAt(x));
    }

    return reversedString.toString().contentEquals(str.toLowerCase());
  }

}
