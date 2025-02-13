package queueinterface.reversequeue;

import static org.junit.jupiter.api.Assertions.*;

import com.queueinterface.reversequeue.QueueReverse;
import org.junit.jupiter.api.Test;
import java.util.*;

public class QueueReverseTest {

    @Test
    public void testReverseQueue_NormalQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        QueueReverse reverser = new QueueReverse();
        reverser.reverseQueue(queue);

        // Expected output after reversal: [30, 20, 10]
        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(30);
        expectedQueue.add(20);
        expectedQueue.add(10);

        assertEquals(expectedQueue, queue, "Queue should be reversed correctly.");
    }
}