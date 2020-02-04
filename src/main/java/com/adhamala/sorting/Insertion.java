package com.adhamala.sorting;

import com.adhamala.sorting.enums.SortOrder;
import com.adhamala.sorting.interfaces.SortingAlgorithm;

public class Insertion<T extends Comparable<T>> implements SortingAlgorithm<T> {

    @Override
    public T[] sort(T[] collection, SortOrder order) {

        for (int i = 1; i <= collection.length - 1; i++) {
            int j = i;

            while (j > 0) {
                if (order == SortOrder.ASC) {
                    if (collection[j].compareTo(collection[j - 1]) < 0) {
                        T temp = collection[j - 1];
                        collection[j - 1] = collection[j];
                        collection[j] = temp;
                    }
                } else {
                    if (collection[j].compareTo(collection[j - 1]) > 0) {
                        T temp = collection[j - 1];
                        collection[j - 1] = collection[j];
                        collection[j] = temp;
                    }
                }

                j--;
            }
        }

        return collection;
    }
}
