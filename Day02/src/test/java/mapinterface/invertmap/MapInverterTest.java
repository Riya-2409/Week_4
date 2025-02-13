package mapinterface.invertmap;

import com.mapinterface.invertmap.MapInverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MapInverterTest {

    @Test
    public void testInvertMap() {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> expectedInvertedMap = new HashMap<>();
        expectedInvertedMap.put(1, Arrays.asList("A", "C"));
        expectedInvertedMap.put(2, Collections.singletonList("B"));

        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(originalMap);

        assertEquals(expectedInvertedMap, invertedMap);
    }
}

