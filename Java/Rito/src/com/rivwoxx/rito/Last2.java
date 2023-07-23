package com.rivwoxx.rito;

import java.util.Arrays;

public class Last2 {

  public static void main(String[] args) {
    String str= "fasdg";
    System.out.println(isPal(str));
  }

  private static boolean isPal(String str){
    char[] arr = str.toLowerCase().toCharArray();
    char[] reversedArr = new char[arr.length];

    int n = arr.length - 1;

    for(int i = 0; i < arr.length; i++){
      reversedArr[i] = arr[n];
      n--;
    }

    for(int x = 0; x < arr.length; x++){
      if(reversedArr[x] != arr[x]){
        return false;
      }
    }
    return true;
  }

}
