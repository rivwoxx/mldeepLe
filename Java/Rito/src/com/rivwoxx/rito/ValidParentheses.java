package com.rivwoxx.rito;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid("{}()"));
  }

  public static boolean isValid(String s) {
    StringBuilder str = new StringBuilder(s);
    String[] parts = {"()", "{}", "[]"};
    for (int i = 0; i < s.length() - 1; i += 2) {
      str.append(i);
      str.append(i + 1);

      for (int x = 0; x < parts.length; i++) {
        if (parts[x] == str.toString()) {
          return true;
        }
      }

    }
    return false;

  }
}