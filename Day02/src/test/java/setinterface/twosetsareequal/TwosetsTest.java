package setinterface.twosetsareequal;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class TwosetsTest {

        // Method to compare two sets for equality
        public <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
            return set1.equals(set2);
        }

        @Test
        public void testSetsEqualWithSameElementsInDifferentOrder() {
            Set<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(2);
            set1.add(3);

            Set<Integer> set2 = new HashSet<>();
            set2.add(3);
            set2.add(2);
            set2.add(1);

            assertTrue(areSetsEqual(set1, set2), "Sets should be equal regardless of the order.");
        }

}
