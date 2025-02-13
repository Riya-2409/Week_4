package removeduplicates;

import com.removeduplicates.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class RemoveDuplicatesTest {

    // Test with a list of integers containing duplicates
    @Test
    public void testRemoveDuplicatesWithIntegers() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);

        List<Integer> result = RemoveDuplicates.removeDuplicates(input);

        // Verify that the result matches the expected output
        assertEquals(expected, result);
    }


}

