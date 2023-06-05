package com.rivwoxx.rito;

import java.util.Arrays;
import java.util.stream.Stream;

public class HCL {

  public static void main(String[] args) {
    //
    // H = +
    // C = -
    // L = 100
    //
    char[] hcl = {'H', 'C', 'L'};
//    String[] hcl = {"H", "C", "L"};
    String s = "HHCL";
    long count = 0;
    System.out.println(Arrays.toString(s.toCharArray()));
    for (char chain : hcl) {
//      count = Arrays.binarySearch(hcl, chain);
      count = s.chars().filter(c -> c == chain).count();
      System.out.println(chain +  " appears: " + count);
    }
  }
}
