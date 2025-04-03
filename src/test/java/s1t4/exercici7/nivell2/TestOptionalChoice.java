package s1t4.exercici7.nivell2;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOptionalChoice {
    @Test
    public void testOptionalIsEmpty() {
        OptionalChoice handler = new OptionalChoice();

        // Obtenemos el Optional vacío
        Optional<String> emptyOptional = handler.getEmptyOptional();

        // Verificamos que está vacío
        assertTrue(emptyOptional.isEmpty(), "El Optional no está vacío cuando debería estarlo.");
    }
}
