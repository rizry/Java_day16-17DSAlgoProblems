package com.java.day1617;

public class Permutations {

  public static void permutation(String input) {
    System.out.print("permutations for '" + input + "' using recursion are: ");
    permutationR("", input);
    System.out.println();

    System.out.print("permutations for '" + input + "' using iterations are: ");
    permutationI(input);
    System.out.println();

  }

  private static void permutationI(String str) {
    int n = str.length();
    int f = factorial(n);

    for (int i = 0; i < f; i++) {
      StringBuilder sb = new StringBuilder(str);
      int temp = i;

      for (int div = n; div >= 1; div--) {
        int q = temp / div;
        int r = temp % div;
        System.out.print(sb.charAt(r));
        sb.deleteCharAt(r);
        temp = q;
      }
      System.out.print(" ");
    }
  }

  private static int factorial(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++) fact *= i;
    return fact;
  }

  private static void permutationR(String perm, String word) {
    if (word.isEmpty()) {
      System.out.print(perm + word + " ");
    } else {
      for (int i = 0; i < word.length(); i++) {
        permutationR(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
      }
    }
  }

}
