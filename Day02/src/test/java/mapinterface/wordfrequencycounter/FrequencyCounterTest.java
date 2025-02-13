package mapinterface.wordfrequencycounter;

import com.mapinterface.wordfrequencycounter.FrequencyCounter;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class FrequencyCounterTest {

        @Test
        public void testWordFrequency() {
            String testFilePath = "D:/calculator/file.txt";

            // Create test file
            try (PrintWriter writer = new PrintWriter(testFilePath)) {
                writer.println("Hello world, hello Java!");
                writer.println("Java is fun. Hello everyone.");
            } catch (Exception e) {
                fail("Failed to create test file");
            }

            // Call method and test output
            Map<String, Integer> wordCount = FrequencyCounter.countWordFrequency(testFilePath);

            assertEquals(3, wordCount.get("hello"));
            assertEquals(1, wordCount.get("world"));
            assertEquals(2, wordCount.get("java"));
            assertEquals(1, wordCount.get("is"));
            assertEquals(1, wordCount.get("fun"));
            assertEquals(1, wordCount.get("everyone"));
        }

}
