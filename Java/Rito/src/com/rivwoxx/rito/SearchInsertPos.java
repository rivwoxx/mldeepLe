package com.rivwoxx.rito;

import java.util.Arrays;

public class SearchInsertPos {

  public static void main(String[] args) {
    int[] nums = {1, 3, 5, 6};
    int target = 2;

    System.out.println(searchInsert(nums,target));
  }

  public static int searchInsert(int[] nums, int target) {
    int tem = 0;
    for(int i =0; i < nums.length; i++){
      if(nums[i] == target){
        return i;
      } else if (target < nums[i]) {
        return i;
      }
    }
    return nums.length;
  }


}
