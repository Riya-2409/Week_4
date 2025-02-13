package reversealist;

import com.reversealist.ReverseList;
import com.reversealist.ReverseArrayList;
import com.reversealist.ReverseLinkedList;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void testReverseListArrayList() {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseList.reverseList(arrayList);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), arrayList);
    }

}
