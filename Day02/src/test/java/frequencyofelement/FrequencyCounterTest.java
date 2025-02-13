package frequencyofelement;

import com.frequencyofelement.FrequencyCounter;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class FrequencyCounterTest {

    // Test with sample input list of strings
    @Test
    public void testCountFrequency() {
        // Sample input
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

        // Expected output map
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        // Call the method
        Map<String, Integer> actual = FrequencyCounter.countFrequency(input);

        // Assert that the result matches the expected output
        assertEquals(expected, actual);
    }

}


