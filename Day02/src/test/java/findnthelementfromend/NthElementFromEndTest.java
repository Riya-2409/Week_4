package findnthelementfromend;

import static org.junit.jupiter.api.Assertions.*;

import com.findnthelementfromend.NthElementFromEnd;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

public class NthElementFromEndTest {

    @Test
    public void testFindNthFromEnd() {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        NthElementFromEnd<String> finder = new NthElementFromEnd<>();

        // Test: Find 2nd element from the end (Expected: "D")
        String result = finder.findNthFromEnd(list, 2);
        assertEquals("D", result, "The 2nd element from the end should be 'D'.");
    }
}

