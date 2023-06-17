package com.rivwoxx.rito;

public class SplitInt {

  public static void main(String[] args) {
    int num = 15776562;

    System.out.println(numberRe(num));
  }

  private static int numberRe(int num) {

    String stNumber = Integer.toString(num);
    StringBuilder newString = new StringBuilder();

    for(int i = stNumber.length() - 1; i >= 0; i--){
      newString.append(stNumber.charAt(i));
    }

    return Integer.parseInt(newString.toString());
  }

}


