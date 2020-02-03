import com.adhamala.sorting.Bubble;
import org.junit.Test;

public class BubbleTest extends IntegerTesting {
    private Bubble<Integer> bubble = new Bubble();

    @Test
    public void ascending() {
        this.testSortASC(bubble);
    }

    @Test
    public void descending() {
        this.testSortDESC(bubble);
    }
}
