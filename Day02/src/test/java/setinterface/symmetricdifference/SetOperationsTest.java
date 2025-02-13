package setinterface.symmetricdifference;

import static org.junit.jupiter.api.Assertions.*;

import com.setinterface.symmetricdifference.SetOperations;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsTest {

    @Test
    public void testSymmetricDifference() {
        SetOperations setOps = new SetOperations();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedSymmetricDifference = new HashSet<>();
        expectedSymmetricDifference.add(1);
        expectedSymmetricDifference.add(2);
        expectedSymmetricDifference.add(4);
        expectedSymmetricDifference.add(5);

        // Test symmetric difference
        Set<Integer> actualSymmetricDifference = setOps.symmetricDifference(set1, set2);
        assertEquals(expectedSymmetricDifference, actualSymmetricDifference, "Symmetric difference test failed!");
    }
}

