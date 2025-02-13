package queueinterface.circularbuffersimulation;

import com.queueinterface.circularbuffersimulation.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    @Test
    void testInsertAndDisplay() {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4); // Overwrites 1

        // Expected buffer content: [2, 3, 4]
        cb.display();
    }
}

