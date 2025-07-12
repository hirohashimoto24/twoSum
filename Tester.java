import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class Tester {
    @Test
    public void testSomething() {
        // assertEquals(2, 1 + 1);
        int[] result = TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(result,new int[]{0,1});
    }
    @Test
    public void testSomething2() {
        // assertEquals(2, 1 + 1);
        int[] result = TwoSum.twoSum(new int[]{3,2,4,5}, 6);
        assertArrayEquals(result,new int[]{1,2});
    }
    @Test
    public void testSomething3() {
        // assertEquals(2, 1 + 1);
        int[] result = TwoSum.twoSum(new int[]{2,3,6,6}, 20);
        assertArrayEquals(result,null);
    }
}


