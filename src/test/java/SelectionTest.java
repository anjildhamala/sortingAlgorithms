import com.adhamala.sorting.Selection;
import com.adhamala.sorting.enums.SortOrder;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionTest {

    @Test
    public void testSortASC() {
        Integer[] integers = new Integer[] {111,32,12,35,34,22,787,353};

        Selection<Integer> selection = new Selection<>();

        Integer[] response = selection.sort(integers, SortOrder.ASC);

        assertArrayEquals(new Integer[]{12, 22, 32, 34, 35, 111, 353, 787}, response);
    }

    @Test
    public void testSortDESC() {
        Integer[] integers = new Integer[] {111,32,12,35,34,22,787,353};

        Selection<Integer> selection = new Selection<>();

        Integer[] response = selection.sort(integers, SortOrder.DESC);

        assertArrayEquals(new Integer[]{787, 353, 111, 35, 34, 32, 22, 12}, response);
    }
}
