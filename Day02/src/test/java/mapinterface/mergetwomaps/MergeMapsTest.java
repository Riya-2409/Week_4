package mapinterface.mergetwomaps;

import com.mapinterface.mergetwomaps.MergeMaps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MergeMapsTest {
    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 5);
        expected.put("C", 4);

        assertEquals(expected, MergeMaps.mergeMaps(map1, map2));
    }

}

