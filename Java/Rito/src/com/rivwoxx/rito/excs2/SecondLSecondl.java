package com.rivwoxx.rito.excs2;

import java.util.Arrays;

//Find the second largest and second smallest numbers in an unsorted array with duplicate values.
public class SecondLSecondl {

  public static void main(String[] args) {
    int[] numbers = {1,2,3,3,3,1,6,3,4,5,6,7,8,8,8,8};
    System.out.println(Arrays.toString(secondLarSecondSmall(numbers)));
  }

  public static int[] secondLarSecondSmall(int[] numbers){
    int[] numbersSorted = Arrays.stream(numbers).sorted().toArray();
    return new int[]{secondSmallest(numbersSorted), secondLargest(numbersSorted)};
  }
  public static int secondLargest(int[] numbers){
    for(int i = numbers.length - 1; i > 0; i--){
      if(numbers[i] != numbers[i - 1]){
        return numbers[i - 1];
      }
    }
    return -1;
  }

  public static int secondSmallest(int[] numbers){

    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] != numbers[i + 1]){
        return numbers[i + 1];
      }
    }
    return -1;
  }

}
