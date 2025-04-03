package s1t4.exercici6.nivell2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestArrayIndexBound {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayIndexBound arrayHandler = new ArrayIndexBound();
        int[] array = {1, 2, 3};

        // Verificamos que acceder a un índice inválido lanza la excepción esperada
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAtIndex(array, 5); // Índice fuera de rango
        });
    }
}
