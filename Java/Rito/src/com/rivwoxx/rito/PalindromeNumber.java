package com.rivwoxx.rito;

public class PalindromeNumber {

  public static void main(String[] args) {
    int x = 121;
    System.out.println(isPalindrome(x));
  }

  public static boolean isPalindrome(int x) {
    String value = Integer.toString(x);
    StringBuilder reverseString = new StringBuilder();
    for (int i = value.length() - 1; i >= 0; i--) {
      reverseString.append(value.charAt(i));
    }

    return value.contentEquals(reverseString);
  }
}
