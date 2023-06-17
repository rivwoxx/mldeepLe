package com.rivwoxx.rito;

public class BestStockDay {

  public static void main(String[] args) {
    int[] prices = {2,1,2,1,0,0,1};
    System.out.println(maxProfit(prices));
  }

  private static int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int minDay = 0;
    int maxProfit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] < minPrice && prices[i] != 0) {
        minPrice = prices[i];
        minDay = i;
      }
    }
    for (int j = minDay; j < prices.length; j++) {
      if ((prices[j] - minPrice) > maxProfit) {
        maxProfit = prices[j] - minPrice;
      }
    }
//    System.out.println(minDay);
    return maxProfit;
  }

}
