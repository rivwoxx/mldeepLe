package com.rivwoxx.rito.recp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ExentR {

  public static void main(String[] args) {
    String papa = "La papa es la Papa";
    System.out.println(wordsInString(papa));
  }

  private static ArrayList<String> wordsInString(String papa) {
    String[] wordsArray = papa.toLowerCase().split(" ");
    String[] words = {"es", "papa"};
    ArrayList<String> wordsnString = new ArrayList<>();

    for (String word : wordsArray) {
      for (String value : words) {
        if (Objects.equals(word, value)) {
          wordsnString.add(word);
        }
      }
    }
    return wordsnString;

  }

}
