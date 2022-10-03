package com.java.day1617;

import java.util.ArrayList;

public class BubbleSort {

  public static void sort() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(634, 235, 7, 25, 134, 21, 54, 241, 4));
    System.out.println("before sort " + numbers);
    boolean swapped = false;
    do {
      swapped = false;
      for (int i = 0; i < numbers.size() - 1; i++) {
        if (numbers.get(i) > numbers.get(i + 1)) {
          int temp = numbers.get(i);
          numbers.set(i, numbers.get(i + 1));
          numbers.set(i + 1, temp);
          swapped = true;
        }
      }
    } while (swapped);

    System.out.println("after sort " + numbers);

  }
}
