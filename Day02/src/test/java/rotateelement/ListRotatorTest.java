package rortateelement;

import static org.junit.jupiter.api.Assertions.*;

import com.rotateelement.ListRotator;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListRotatorTest {

    // Test for rotating by a positive number
    @Test
    public void testRotatePositive() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        ListRotator<Integer> rotator = new ListRotator<>();
        List<Integer> rotatedList = rotator.rotate(numbers, rotateBy);

        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        assertEquals(expected, rotatedList, "Rotation by a positive number failed!");
    }

}

