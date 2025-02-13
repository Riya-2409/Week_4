package setinterface.convertsettosortedlist;

import static org.junit.jupiter.api.Assertions.*;

import com.setinterface.convertsettosortedlist.SetToSortedList;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SetToSortedListTest {

    @Test
    public void testConvertToSortedList_IntegerSet() {
        // Given a set of integers
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(9);
        integerSet.add(1);

        // Create an instance of SetToSortedList
        SetToSortedList converter = new SetToSortedList();

        // Convert and verify the sorted list
        List<Integer> sortedList = converter.convertToSortedList(integerSet);

        List<Integer> expectedList = Arrays.asList(1, 3, 5, 9);
        assertEquals(expectedList, sortedList, "The sorted list of integers should be [1, 3, 5, 9].");
    }

}

