package setinterface.unionandintersectionoftwosets;

import static org.junit.jupiter.api.Assertions.*;

import com.setinterface.unionandintersectionoftwosets.SetOperations;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsTest {

    @Test
    public void testUnion() {
        SetOperations setOps = new SetOperations();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        // Test union
        Set<Integer> actualUnion = setOps.union(set1, set2);
        assertEquals(expectedUnion, actualUnion, "Union test failed!");
    }

    @Test
    public void testIntersection() {
        SetOperations setOps = new SetOperations();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        // Test intersection
        Set<Integer> actualIntersection = setOps.intersection(set1, set2);
        assertEquals(expectedIntersection, actualIntersection, "Intersection test failed!");
    }
}
