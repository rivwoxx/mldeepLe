package com.rivwoxx.rito;

import javax.swing.plaf.IconUIResource;

public class PairOfSongs {

  public static void main(String[] args) {

    int[] time = {30,20,150,100,40,43,55,66,767};

    System.out.println(divBySixty(time));
  }

  private static int divBySixty(int[] time) {
    int cont = 0;

    for(int i = 0; i < time.length; i++){
      for(int k = 0; k < time.length; k++){
        if((time[i] + time[k]) % 60 == 0 && i != k){
          cont++;
        }
      }
    }
    return cont / 2;
  }


}
