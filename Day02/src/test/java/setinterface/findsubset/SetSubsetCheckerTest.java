package setinterface.findsubset;

import static org.junit.jupiter.api.Assertions.*;

import com.setinterface.findsubset.SetSubsetChecker;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SetSubsetCheckerTest {

    @Test
    public void testIsSubset_ValidSubset() {
        // Given two sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Create an instance of SetSubsetChecker
        SetSubsetChecker checker = new SetSubsetChecker();

        // Check if set1 is a subset of set2
        boolean result = checker.isSubset(set1, set2);

        // Assert that set1 is a subset of set2
        assertTrue(result, "set1 should be a subset of set2.");
    }

}

