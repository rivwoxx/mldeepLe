package com.rivwoxx.rito.moreTrTr;

public class WordCount {

  public static void main(String[] args) {
    String phrase = "Hello, how are you?";
    System.out.println(wordsInString(phrase));
  }

  public static int wordsInString(String phrase) {
    String[] words = phrase.toLowerCase().split(",|\\s+");
    return words.length - 1;
  }

}
