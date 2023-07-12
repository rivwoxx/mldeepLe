package com.rivwoxx.rito.excs2;

import java.util.Arrays;

public class ConvertTemp {

  public static void main(String[] args) {
    double celsius = 36.50;
    System.out.println(Arrays.toString(convertTemperature(celsius)));
  }
  public static double[] convertTemperature(double celsius) {

    double[] temps = new double[2];
    double kelvin = celsius + 273.15;
    double fahrenheit = celsius * 1.80 + 32.00;

    temps[0] = kelvin;
    temps[1] = fahrenheit;

    return temps;
  }
}
