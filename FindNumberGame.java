package com.java.day1617;

import java.util.Scanner;

public class FindNumberGame {

  public static void find() {
    Scanner sc = new Scanner(System.in);

    int lower = 1;
    int upper = 100;
    System.out.println("Think a number between " + lower + " and " + upper + ".");

    while (lower <= upper) {
      int mid = (lower + upper) / 2;
      System.out.print("\nis your number " + mid + " (y/n): ");
      String res = sc.next();
      if (res.toLowerCase().equals("y")) {
        System.out.println("great. thanks for playing.");
        return;
      }

      System.out.print("is your number less than " + mid + ": ");
      res = sc.next();
      switch (res.toLowerCase()) {
      case "y":
        upper = mid - 1;
        break;
      case "n":
        lower = mid + 1;
        break;
      default:
        System.out.println("not valid");
      }
    }

  }
}
