import com.adhamala.sorting.Insertion;
import org.junit.Test;

public class InsertionTest extends IntegerTesting {
    private Insertion<Integer> insertion = new Insertion<>();

    @Test
    public void ascending() {
        this.testSortASC(insertion);
    }

    @Test
    public void descending() {
        this.testSortDESC(insertion);
    }
}
