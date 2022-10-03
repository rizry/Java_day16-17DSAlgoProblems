package com.java.day1617;

import java.util.ArrayList;

public class BinarySearch {

  static public void search() {
    ArrayList<String> foods = new ArrayList<>(
      Arrays.asList("sushi", "tofu", "lasagna", "ravioli", "ramen", "sashimi", "risotto", "yogurt", "tacos", "nachos"));
    Collections.sort(foods);
    System.out.println("list of foods: " + foods);
    System.out.print("Enter a food to search: ");
    Scanner sc = new Scanner(System.in);
    String enteredFood = "";
    do {
      enteredFood = sc.nextLine();
      if (enteredFood.length() < 1) System.out.print("can't be empty. enter again: ");
    } while (enteredFood.length() < 1);
    sc.close();

    int ind = binarySearch(foods, enteredFood);
    if (ind == -1) System.out.println("'" + enteredFood + "' is not found!");
    else System.out.println("'" + enteredFood + "' found at index " + ind);

  }

  private static int binarySearch(ArrayList<String> list, String str) {
    int first = 0;
    int last = list.size() - 1;
    int mid = (first + last) / 2;

    while (first <= last) {
      if (list.get(mid).equals(str)) return mid;
      else if (list.get(mid).compareTo(str) < 0) first = mid + 1;
      else last = mid - 1;
      mid = (first + last) / 2;
    }

    return -1;
  }
}
