package s1t4.exercici3.nivell2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestIdenticArrays {

    @Test
    public void compareArrays() {
        IdenticArrays comparator = new IdenticArrays();

        assertArrayEquals(comparator.getArray1(), comparator.getArray2(), "Los arrays no son iguales");
    }
}
