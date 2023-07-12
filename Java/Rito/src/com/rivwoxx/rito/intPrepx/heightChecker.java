package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;

public class heightChecker {

  public static void main(String[] args) {
    int[] heights = {1,1,4,2,1,3};

    System.out.println(heightChecker(heights));
  }

  public static int heightChecker(int[] heights) {
    int cont = 0;

    int[] sortedHeights = Arrays.stream(heights).sorted().toArray();

    for(int i = 0; i < heights.length; i++){
      if(heights[i] != sortedHeights[i]){
        cont++;
      }
    }
    return cont;
  }
}
