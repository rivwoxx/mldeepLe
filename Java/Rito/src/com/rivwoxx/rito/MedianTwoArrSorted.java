package com.rivwoxx.rito;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianTwoArrSorted {

  public static void main(String[] args) {
    int[] arr1 = {4, 3, 2, 1};
    int[] arr2 = {7, 6};
    System.out.println(findMedianSortedArrays(arr2, arr1));
  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int[] sortedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted()
        .toArray();
    if (sortedArray.length % 2 != 0) {
      return sortedArray[sortedArray.length / 2];
    }
    return (double) (sortedArray[(sortedArray.length / 2) - 1] + sortedArray[sortedArray.length
        / 2]) / 2;

  }
}
