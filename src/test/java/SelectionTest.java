import com.adhamala.sorting.Selection;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionTest extends IntegerTesting {
    private Selection<Integer> selection = new Selection<>();

    @Test
    public void ascending() {
        this.testSortASC(selection);
    }

    @Test
    public void descending() {
        this.testSortDESC(selection);
    }
}
