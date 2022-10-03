package com.java.day1617;

import java.util.Scanner;

public class Anagrams {

  public static void check() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter two strings ");
    String str1 = "";
    String str2 = "";
    do {
      str1 = sc.next();
      str2 = sc.next();
      if (str1.length() < 2 || str2.length() < 2) {
        System.out.print("Invalid strings. enter again: ");
      }
    } while (str1.length() < 2 || str2.length() < 2);
    sc.close();

    test(str1, str2);

  }

  private static void test(String str1, String str2) {
    int asciiSum = 0;
    if (str1.length() != str2.length()) {
      System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
      return;
    }
    for (int i = 0; i < str1.length(); i++) {
      asciiSum += str1.charAt(i);
      asciiSum -= str2.charAt(i);
    }
    if (asciiSum == 0) System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
    else System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
  }
}
