package com.rivwoxx.rito;

import java.util.Arrays;

public class aaa {

  public static void main(String[] args) {
    String inputString = "aab";

    System.out.println(isShorter(inputString));
  }

  public static boolean isShorter(String inputString) {
    char[] charInInput = inputString.toCharArray();
    String smashedString = "";
    int count = 0;
    int i = 0;
    while (i < charInInput.length - 1) {
        if (charInInput[i] == charInInput[count]) {
          count++;
      }
      i = count;
      smashedString = charInInput[i] + Integer.toString(count);
    }

    return inputString.length() > smashedString.length();

  }

}
