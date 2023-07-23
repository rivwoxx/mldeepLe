package com.rivwoxx.rito.moreTrTr;

import java.util.Arrays;

public class CountString {

  public static void main(String[] args) {
    String userString = "This is a String and it is kinda long";
//    String userString = "aaabbbbcccddd";
    char[] stringChars = userString.toLowerCase().toCharArray();

    Arrays.sort(stringChars);
    System.out.println(Arrays.toString(stringChars));
  }

//  private static int[] frequencyofLetters(String userString){
//    char[] stringChars = userString.toLowerCase().toCharArray();
//    Arrays.sort(stringChars);
//    String[] response = new String[stringChars.length - 1 ];
//    int count = 0;
////    int i = 0;
//    while(count < stringChars.length - 1 ){
//      if (stringChars[count] == stringChars[count + 1]){
//        count++;
//      }
//      response[]
//
//    }
//
//    return count;
//  }


}
