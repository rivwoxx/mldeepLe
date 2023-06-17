package com.rivwoxx.rito;


import java.util.ArrayList;
import java.util.List;

public class Candies {

  public static void main(String[] args) {
    int[] candies = {2,3,5,1,3};
    int extraCandies = 3;

    System.out.println(kidsWithCandies(candies,extraCandies));


  }
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> ret = new ArrayList<>();
    int candieHigh = 0;

    for (int can : candies){
      if(can > candieHigh){
        candieHigh = can;
      }
    }

    for(int currentCandie : candies){
      if(currentCandie + extraCandies >= candieHigh){
        ret.add(true);
      }else {
        ret.add(false);
      }
    }
    return ret;
  }
}
