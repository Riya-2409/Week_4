package mapinterface.keyvaluewithhighestvalue;

import com.mapinterface.keywithhighestvalue.MaxKeyValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MaxKeyValueTest {
    @Test
    void testFindKeyWithMaxValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        assertEquals("B", MaxKeyValue.findKeyWithMaxValue(map));
    }

    @Test
    void testFindKeyWithMaxValueSingleEntry() {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 100);

        assertEquals("X", MaxKeyValue.findKeyWithMaxValue(map));
    }

}

