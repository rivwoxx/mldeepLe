package com.rivwoxx.rito;

import java.util.HashMap;
import java.util.Map;

public class Gorpilaxio {

  public static void main(String[] args) {

    Map<Character, String> charMap = new HashMap<>();

    charMap.put('a', "28");
    charMap.put('b', "57");
    charMap.put('c', "73");
    charMap.put('d', "35");
    charMap.put('e', "70");
    charMap.put('f', "45");
    charMap.put('g', "76");
    charMap.put('h', "52");
    charMap.put('i', "15");
    charMap.put('j', "17");
    charMap.put('k', "25");
    charMap.put('l', "54");
    charMap.put('m', "11");
    charMap.put('n', "40");
    charMap.put('o', "82");
    charMap.put('p', "21");
    charMap.put('q', "41");
    charMap.put('r', "46");
    charMap.put('s', "50");
    charMap.put('t', "51");
    charMap.put('u', "64");
    charMap.put('v', "19");
    charMap.put('w', "62");
    charMap.put('x', "53");
    charMap.put('y', "13");
    charMap.put('z', "67");
    charMap.put(' ', "92");
    charMap.put(',', "99");
    charMap.put('.', "91");

//    // Create a reverse mapping of the charMap
    Map<String, Character> reverseCharMap = new HashMap<>();
    reverseCharMap.put("28", 'a');
    reverseCharMap.put("57", 'b');
    reverseCharMap.put("73", 'c');
    reverseCharMap.put("35", 'd');
    reverseCharMap.put("70", 'e');
    reverseCharMap.put("45", 'f');
    reverseCharMap.put("76", 'g');
    reverseCharMap.put("52", 'h');
    reverseCharMap.put("15", 'i');
    reverseCharMap.put("17", 'j');
    reverseCharMap.put("25", 'k');
    reverseCharMap.put("54", 'l');
    reverseCharMap.put("11", 'm');
    reverseCharMap.put("40", 'n');
    reverseCharMap.put("82", 'o');
    reverseCharMap.put("21", 'p');
    reverseCharMap.put("41", 'q');
    reverseCharMap.put("46", 'r');
    reverseCharMap.put("50", 's');
    reverseCharMap.put("51", 't');
    reverseCharMap.put("64", 'u');
    reverseCharMap.put("19", 'v');
    reverseCharMap.put("62", 'w');
    reverseCharMap.put("53", 'x');
    reverseCharMap.put("13", 'y');
    reverseCharMap.put("67", 'z');
    reverseCharMap.put("92", ' ');
    reverseCharMap.put("99", ',');
    reverseCharMap.put("91", '.');

//    for (Map.Entry<Character, String> entry : charMap.entrySet()) {
//      reverseCharMap.put(entry.getValue(), entry.getKey());
//    }

    String input = "lenovo thinkpad";
    String inputTransformed = "50527092155092548282251540769276828235";
    System.out.println(transformString(input,charMap));

    System.out.println("Gola to spanish: " + gorpilaxioToString(inputTransformed, reverseCharMap));


  }

  public static String transformString(String input, Map<Character, String> charMap) {
    StringBuilder transformedString = new StringBuilder();

    for (char c : input.toLowerCase().toCharArray()) {
      // Check if the character exists in the map
      if (charMap.containsKey(c)) {
        // Append the mapped value to the transformedString
        transformedString.append(charMap.get(c));
      } else {
        // If the character is not found in the map, append the original character
        transformedString.append(c);
      }
    }

    return transformedString.toString();
  }


  //  public static String reverseTransformString(String input, Map<String, Character> reverseCharMap) {
//    StringBuilder originalString = new StringBuilder();
//    int i = 0;
//
//    while (i < input.length()) {
//      char c = input.toLowerCase().charAt(i);
//
//      // Check if the current character is part of a mapped value
//      if (reverseCharMap.containsKey(Character.toString(c))) {
//        // Get the mapped value from the input string
//        String mappedValue = Character.toString(c);
//        i++;
//
//        // Check if the next character is also part of the mapped value
//        while (i < input.length() && reverseCharMap.containsKey(mappedValue + input.charAt(i))) {
//          mappedValue += input.charAt(i);
//          i++;
//        }
//
//        // Convert the mapped value back to the original character and append it
//        originalString.append(reverseCharMap.get(mappedValue));
//      } else {
//        // Append the original character if not part of a mapped value
//        originalString.append(c);
//        i++;
//      }
//    }
//
//    return originalString.toString();
//  }
  public static String gorpilaxioToString(String input, Map<String, Character> reverseCharMap) {

    StringBuilder originalString = new StringBuilder();
    int i = 0;

    while (i < input.length()) {
      // Check if there are at least 2 characters left in the input string
      if (i + 1 < input.length()) {
        // Get the next two characters
        String currentTwoChars = input.substring(i, i + 2);

        // Check if the current two characters are part of a mapped value
        if (reverseCharMap.containsKey(currentTwoChars)) {
          // Convert the mapped value back to the original character and append it
          originalString.append(reverseCharMap.get(currentTwoChars));
          i += 2; // Move to the next two characters
        } else {
          // Append the original character if not part of a mapped value
          originalString.append(input.charAt(i));
          i++; // Move to the next character
        }
      } else {
        // If there's only one character left, append it and move to the end of the input
        originalString.append(input.charAt(i));
        i++;
      }
    }

    return originalString.toString();
  }

//  public static void main(String[] args) {
//    // Define the mapping in a HashMap (you can define your own mapping)
//    Map<Character, String> charMap = new HashMap<>();
//    charMap.put('a', "@");
//    charMap.put('b', "8");
//    charMap.put('e', "3");
//    charMap.put('l', "|");
//
//    String inputString = "hello world";
//    String transformedString = transformString(inputString, charMap);
//
//    System.out.println("Original string: " + inputString);
//    System.out.println("Transformed string: " + transformedString);
//  }

}
