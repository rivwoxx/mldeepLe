package com.rivwoxx.rito.excs2;

import java.util.ArrayList;
import java.util.Arrays;

public class PairEqualsNum {

  public static void main(String[] args) {
    int[] numbers = {4,5,3,2,1,6,7,8,9};
    int target = 11;
    System.out.println(pairEquals(numbers, target).toString());
  }

  public static ArrayList<Integer> pairEquals(int[] numbers, int target){
    int[] numbersSorted = Arrays.stream(numbers).sorted().toArray();
    ArrayList<Integer> pairs = new ArrayList<>();
    for(int i = 0; i < numbersSorted.length; i++){
      for(int j = i + 1; j < numbersSorted.length; j++){
        if(numbersSorted[i] + numbersSorted[j] == target){
          pairs.add(numbersSorted[i]);
          pairs.add(numbersSorted[j]);
        }
      }
    } 
    return pairs;
  }

}
