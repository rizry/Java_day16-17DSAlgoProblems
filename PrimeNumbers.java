package com.java.day1617;

import java.util.ArrayList;

public class PrimeNumbers {

  public static void find() {
    ArrayList<Integer> primes = new ArrayList<>();
    generatePrimes(primes);
    System.out.println("primes: " + primes);

    System.out.print("Primes that are palindrome: ");
    for (int i : primes) {
      if (i > 10 && i == getReverseNum(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.print("\nPrimes that are anagrams: ");
    for (int i : primes) {
      int rev = getReverseNum(i);
      if (i > 11 && checkPrime(rev)) {
        System.out.print(i + " and " + rev + "; ");
      }
    }
    System.out.print("\nPrimes that are both palindrome and anagrams: ");
    for (int i : primes) {
      int rev = getReverseNum(i);
      if (i > 11 && i == getReverseNum(i) && checkPrime(rev)) {
        System.out.print(i + " ");
      }
    }

  }

  private static void generatePrimes(ArrayList<Integer> primes) {
    for (int i = 1; i <= 1000; i++) {
      if (checkPrime(i)) primes.add(i);
    }
  }

  private static int getReverseNum(int num) {
    int rev = 0, r = 0;
    while (num > 0) {
      r = num % 10;
      rev = rev * 10 + r;
      num /= 10;
    }
    return rev;
  }

  private static boolean checkPrime(int num) {
    boolean isPrime = true;
    for (int j = 2; j <= Math.sqrt(num); j++) {
      if (num % j == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}