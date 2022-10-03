package com.java.day1617;

import java.util.ArrayList;

public class PrimeNumbers {

  public static void find() {
    generatePrimes();
  }

  private static void generatePrimes() {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int i = 1; i <= 1000; i++) {
      boolean isPrime = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }

      }
      if (isPrime) primes.add(i);
    }
    System.out.println(primes);
  }
}
