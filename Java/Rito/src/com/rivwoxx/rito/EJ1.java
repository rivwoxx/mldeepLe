package com.rivwoxx.rito;

import java.util.Arrays;
import java.util.Map;

public class EJ1 {

  public static void main(String[] args) {
    int[] values = {4, 54, 2, 5, 43, 23, 6, 34, 23, 6, 32, 42};
    String stringy = "Portanet";
    String stringy2 = "Portanet fdfsf ; rerer.d";
//    System.out.println(findMaximum(values));
//    System.out.println(reverseString(stringy));
//    System.out.println(isPalindrome("anna"));

//    System.out.println(stringy2.replaceAll("[, .;]", ""));
//    System.out.println(Arrays.toString(countVowelsAndConsonants("Programming is fun")));
//    System.out.println(Arrays.binarySearch(values,7));
    int[] arr = {1,2,7,3,5,6,8};
    System.out.println(findMissingNumber(arr));

    System.out.println(sumOfEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    System.out.println(sumOfEvenNumbers(new int[]{10, 15, 20, 25, 30}));
    System.out.println(sumOfEvenNumbers(new int[]{3, 7, 9}));



  }


  public static int findMaximum(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  public static String reverseString(String input) {
    StringBuilder reversedStringg = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      reversedStringg.append(input.charAt(i));
    }
    return reversedStringg.toString();
  }

  public static boolean isPalindrome(String input) {
    return input.equals(reverseString(input));
  }

  public static int[] countVowelsAndConsonants(String input) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    char[] inputArray = input.replaceAll("[, .;!]", "").toLowerCase().toCharArray();

    int vowelCount = 0;
    int consonantCount = 0;

    int[] count = new int[2];

    for (char c : inputArray) {

      if (Arrays.binarySearch(vowels, c) >= 0) {
        vowelCount++;
      } else {
        consonantCount++;
      }

    }

    count[0] = vowelCount;
    count[1] = consonantCount;

    return count;
  }

  public static int findMissingNumber(int[] arr) {
    Arrays.sort(arr);
    int missing = 0;
    for (int i = 0; i < arr.length-1; i++) {
      if(arr[i]+1 != arr[i+1]){
        return i+2;
      }
    }
    missing = arr.length;
    return missing;
  }

  public static int sumOfEvenNumbers(int[] arr){
    int sum = 0;

    for(int number : arr){
      if(number % 2 == 0){
        sum+=number;
      }
    }
    return sum;
  }

}
