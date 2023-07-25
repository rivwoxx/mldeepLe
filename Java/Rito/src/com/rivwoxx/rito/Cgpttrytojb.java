package com.rivwoxx.rito;

import java.util.Arrays;
import java.util.HashMap;

public class Cgpttrytojb {

  public static void main(String[] args) {

    String zqs = "aonxsfdpjmvhlryqkzwutiebcgqoaditxrbvkjnyfhlmwuspeczg";
    System.out.println(zqs.length());

    char[] zqsSorter = zqs.toCharArray();

    Arrays.sort(zqsSorter);
    System.out.println(Arrays.toString(zqsSorter));

    System.out.println(sumPositionsOfRepeatedChars(zqs).toString());

    int [] values={

        28,
        57,
        73,
        35,
        70,
        45,
        76,
        52,
        15,
        17,
        25,
        54,
        11,
        40,
        82,
        21,
        41,
        46,
        50,
        51,
        64,
        19,
        62,
        53,
        13,
        67
    };
    System.out.println(finddubplicates(values));
//    System.out.println(Arrays.stream(values).sorted().toArray());
    Arrays.sort(values);
    System.out.println(Arrays.toString(values));
  }

//  private static int[] getValues(String zqs){
//
//  }

  public static HashMap<Character, Integer> sumPositionsOfRepeatedChars(String inputString) {
    HashMap<Character, Integer> charSums = new HashMap<>();

    String[] words = inputString.split("\\s+");
    for (String word : words) {
      HashMap<Character, Integer> charPositions = new HashMap<>();

      for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);

        if (!charPositions.containsKey(c)) {
          charPositions.put(c, i);
        } else {
          charSums.put(c, charSums.getOrDefault(c, 0) + charPositions.get(c) + i);
        }
      }
    }

    return charSums;
  }

  public static boolean finddubplicates(int[] numbers){
    Arrays.sort(numbers);
    for(int i =0; i < numbers.length -1; i++){
      if(numbers[i] == numbers[i+1]){
        return true;
      }
    }
    return false;
  }

//  public static int findDuplicates(int[] numbers){
////    for(int number: numbers){
////      if(Arrays.binarySearch(numbers, number) == -1){
////
////      }
////    }
//  }
}

