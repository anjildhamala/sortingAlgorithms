package com.adhamala.sorting;

import com.adhamala.sorting.enums.SortOrder;
import com.adhamala.sorting.interfaces.SortingAlgorithm;

public class Selection<T extends Comparable<T>> implements SortingAlgorithm<T> {

    @Override
    public T[] sort(T[] collection, SortOrder order) {

        for (int i = 0; i < collection.length; i++) {
            T orderedElement = collection[i];

            for (int j = i; j < collection.length; j++) {
                if (order == SortOrder.ASC) {
                    if (collection[j].compareTo(orderedElement) < 0) {
                        orderedElement = collection[j];
                        T temp = collection[i];
                        collection[i] = collection[j];
                        collection[j] = temp;
                    }
                } else {
                    if (collection[j].compareTo(orderedElement) > 0) {
                        orderedElement = collection[j];
                        T temp = collection[i];
                        collection[i] = collection[j];
                        collection[j] = temp;
                    }
                }
            }
        }

        return collection;
    }
}
