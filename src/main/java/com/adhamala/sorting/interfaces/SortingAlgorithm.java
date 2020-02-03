package com.adhamala.sorting.interfaces;

import com.adhamala.sorting.enums.SortOrder;

public interface SortingAlgorithm<T> {
    public T[] sort(T[] collection, SortOrder order);
}
