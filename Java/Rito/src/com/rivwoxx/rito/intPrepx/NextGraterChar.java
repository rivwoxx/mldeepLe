package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;

public class NextGraterChar {

  public static void main(String[] args) {
    char[] letters = {'c','f','j'};
//    System.out.println(Arrays.binarySearch(letters,'c'));
    System.out.println(nextGreatestLetter(letters,'k'));
  }

  public static char nextGreatestLetter(char[] letters, char target) {
    for(int i = 0; i < letters.length; i++){
      if(target < letters[i]){
        return letters[i];
      }
    }
    return letters[0];
  }

}
