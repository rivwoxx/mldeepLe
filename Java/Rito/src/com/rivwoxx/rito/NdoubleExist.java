package com.rivwoxx.rito;

import java.util.Arrays;

public class NdoubleExist {

  public static void main(String[] args) {
    int[] arr = {-2,0,10,-19,4,6,-8};
    System.out.println(checkIfExist(arr));
  }

  public static boolean checkIfExist(int[] arr) {
    for(int value = 0; value < arr.length; value++){
      for(int ev = 0; ev < arr.length; ev++){
        if(value != ev && arr[ev] == arr[value] * 2){
          return true;
        }
      }
    }

    return false;
  }

}
