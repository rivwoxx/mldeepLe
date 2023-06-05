package com.rivwoxx.rito;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ott {

  public static void main(String[] args) {
    IntStream st = IntStream.range(1, 100);

    for(int i = 1; i < 100; i++){
      if (i == 50 || i == 85){
        System.out.println("Perestroika");
      }
      System.out.println(i);
    }
  }



}
