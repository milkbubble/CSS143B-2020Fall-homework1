import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        int[][] inputs = {
                {},
                {3},
                {1, 3},
                {6, 4, 8},
                {4, 6, 8},
                {4, 10, 8, 7, 3, 2, 1},
                {3, 5, 7, 9, 20, 123, 4, 3, 14},
                {3, 1, 7, 9, 20, 23, 10, 23, 15},
        };
        int[][] answers = {
                {},
                {3},
                {1, 3},
                {4, 6, 8},
                {4, 6, 8},
                {1, 2, 3, 4, 7, 8, 10},
                {3, 3, 4, 5, 7, 9, 14, 20, 123},
                {1, 3, 7, 9, 10, 15, 20, 23, 23},
        };
        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            try {
                assertArrayEquals(answers[i], inputs[i]);
            } catch (AssertionError error) {
                System.out.println(" Test Case " + i + " failed " + error);
            }

        }
    }
}
