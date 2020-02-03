package com.adhamala.sorting;

import com.adhamala.sorting.enums.SortOrder;
import com.adhamala.sorting.interfaces.SortingAlgorithm;

public class Bubble<T extends Comparable<T>> implements SortingAlgorithm<T> {

    @Override
    public T[] sort(T[] collection, SortOrder order) {
        boolean sortHappened = false;
        int i = 0;

        while (i < collection.length - 1) {
            if (order == SortOrder.ASC) {
                if (collection[i + 1].compareTo(collection[i]) < 0) {
                    T temp = collection[i];
                    collection[i] = collection[i + 1];
                    collection[i + 1] = temp;
                    sortHappened = true;
                }
            } else {
                if (collection[i + 1].compareTo(collection[i]) > 0) {
                    T temp = collection[i];
                    collection[i] = collection[i + 1];
                    collection[i + 1] = temp;
                    sortHappened = true;
                }
            }

            i++;
        }

        if (sortHappened) {
            sort(collection, order);
        }

        return collection;
    }
}
