package com.java.day1617;

import java.util.ArrayList;

public class MergeSort {

  public static void sort() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(634, 235, 7, 25, 134, 21, 54, 241, 4));
    mergeSort(numbers);
    System.out.println(numbers);
  }

  private static void mergeSort(ArrayList<Integer> numbers) {
    int lenArr = numbers.size();
    if (lenArr < 2) return;
    int midIndex = lenArr / 2;

    ArrayList<Integer> leftArr = new ArrayList<>(midIndex);
    ArrayList<Integer> rightArr = new ArrayList<>(lenArr - midIndex);

    for (int i = 0; i < lenArr; i++) {
      if (i < midIndex) leftArr.add(numbers.get(i));
      else rightArr.add(numbers.get(i));
    }

    mergeSort(leftArr);
    mergeSort(rightArr);

    merge(numbers, leftArr, rightArr);

  }

  private static void merge(ArrayList<Integer> numbers, ArrayList<Integer> leftArr, ArrayList<Integer> rightArr) {
    int i = 0, j = 0, k = 0;
    while (i < leftArr.size() && j < rightArr.size()) {
      if (leftArr.get(i) <= rightArr.get(j)) {
        numbers.set(k, leftArr.get(i));
        i++;
      } else {
        numbers.set(k, rightArr.get(j));
        j++;
      }
      k++;
    }
    while (i < leftArr.size()) {
      numbers.set(k, leftArr.get(i));
      k++;
      i++;
    }
    while (j < rightArr.size()) {
      numbers.set(k, rightArr.get(j));
      k++;
      j++;
    }
  }

}
