package com.rivwoxx.rito.intPrepx;

import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args) {
    int[] nums = {1,0};

    System.out.println(missingNumber(nums));
//    System.out.println(missingNumber2(nums));
  }

  public static int missingNumber(int[] nums) {
    int missing = 0;

    Arrays.stream(nums).sorted().toArray();
    if(nums.length == 2){
      missing = 2;
    }else if (nums.length == 1){
      missing = 1;
    }
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != i){
        missing = i;
      }
    }

//    if(nums.length < )

    return missing;
  }

}
