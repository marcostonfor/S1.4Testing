package s1t4.exercici3.nivell1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IndexExceptionTest {

    @Test
    void testInvalidAccess() {
       IndexException example = new IndexException();
        assertThrows(ArrayIndexOutOfBoundsException.class, example::invaliidAccess);
    }

    @Test
    void testNegativeAccess() {
        IndexException example = new IndexException();
        assertThrows(ArrayIndexOutOfBoundsException.class, example::negativeAccess);
    }

    @Test
    void testIteracionInvalida() {
        IndexException example = new IndexException();
        assertThrows(ArrayIndexOutOfBoundsException.class, example::invalidIteration);
    }

    @Test
    void testThrowException() {
        IndexException example = new IndexException();
        assertThrows(ArrayIndexOutOfBoundsException.class, example::throwException);
    }
}
