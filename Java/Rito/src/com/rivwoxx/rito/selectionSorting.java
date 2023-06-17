package com.rivwoxx.rito;

import java.util.Arrays;
import java.util.Random;

public class selectionSorting {

  public static void main(String[] args) {
    int[] numbers = new int[10];
    Random randomNumbers = new Random();

    //Fill the array with random nubmers
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = randomNumbers.nextInt(100000);
    }

    System.out.println(Arrays.toString(numbers));

    selectionSort(numbers);

    System.out.println(Arrays.toString(numbers));
  }

  private static void selectionSort(int[] numbers) {

    for(int i = 0; i < numbers.length - 1; i++){
       int lowestNumber = numbers[i];
       int indexOfMinNumber = i;


       for(int j = i + 1; j < numbers.length; j++){
         if(numbers[j] < lowestNumber){
           lowestNumber = numbers[j];
           indexOfMinNumber = j;
         }
       }

      int temp = numbers[i];
       numbers[i] = numbers[indexOfMinNumber];
       numbers[indexOfMinNumber] = temp;

    }

  }

}
