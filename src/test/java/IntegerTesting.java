import com.adhamala.sorting.enums.SortOrder;
import com.adhamala.sorting.interfaces.SortingAlgorithm;

import static org.junit.Assert.assertArrayEquals;

public abstract class IntegerTesting {

    public void testSortASC(SortingAlgorithm<Integer> algorithm) {
        Integer[] integers = new Integer[] {111,32,12,35,34,22,787,353};

        Integer[] response = algorithm.sort(integers, SortOrder.ASC);

        assertArrayEquals(new Integer[]{12, 22, 32, 34, 35, 111, 353, 787}, response);
    }

    public void testSortDESC(SortingAlgorithm<Integer> algorithm) {
        Integer[] integers = new Integer[] {111,32,12,35,34,22,787,353};

        Integer[] response = algorithm.sort(integers, SortOrder.DESC);

        assertArrayEquals(new Integer[]{787, 353, 111, 35, 34, 32, 22, 12}, response);
    }
}
