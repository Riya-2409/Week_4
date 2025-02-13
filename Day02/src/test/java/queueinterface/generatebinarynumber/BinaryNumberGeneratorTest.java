package queueinterface.generatebinarynumber;

import static org.junit.jupiter.api.Assertions.*;

import com.queueinterface.generatebinarynumber.BinaryNumberGenerator;
import org.junit.jupiter.api.Test;

public class BinaryNumberGeneratorTest {

    @Test
    public void testGenerateBinaryNumbers_N5() {
        BinaryNumberGenerator generator = new BinaryNumberGenerator();
        String[] expected = {"1", "10", "11", "100", "101"};
        assertArrayEquals(expected, generator.generateBinaryNumbers(5), "Binary sequence should match expected output.");
    }

}

