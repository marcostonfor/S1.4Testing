package s1t4.exercici1.nivell2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class testAssertInteger {
    private int numberOne;
    private int numberTwo;
    @Test
    public void equalIntegerTest() {
        numberOne = 12;
        numberTwo = 12;
        assertThat(numberOne).isEqualTo(numberTwo);
    }

    public void notEqualInteger() {
        numberOne = 12;
        numberTwo = 14;
        assertThat(numberOne).isNotEqualTo(numberTwo);
    }

}
