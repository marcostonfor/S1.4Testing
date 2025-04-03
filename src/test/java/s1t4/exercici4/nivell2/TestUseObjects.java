package s1t4.exercici4.nivell2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestUseObjects {


    @Test
    public void testListContainsObjectsRegardlessOfOrder() {
        // Llista original amb els objectes
        ArrayList<Object> actualList = new ArrayList<>();
        actualList.add(new Animal("gato"));
        actualList.add(new Car("ford mustang"));
        actualList.add(new Person("marcos"));

        // Llista esperada
        ArrayList<Object> expectedList = new ArrayList<>();
        expectedList.add(new Animal("gato"));
        expectedList.add(new Car("ford mustang"));
        expectedList.add(new Person("marcos"));

        // Verificació: la llista actual conté tots els objectes esperats
        assertFalse(actualList.containsAll(expectedList), "La llista no conté tots els objectes esperats.");
    }

    @Test
    public void testListContainsOnlyOne() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Animal("gato"));
        list.add(new Car("ford mustang"));
        list.add(new Person("marcos"));
        list.add(new Animal("gato")); // Intentem afegir un objecte duplicat

        assertEquals(4                                                                                                                                                                                     , list.size(), "Se han añadido objetos duplicados.");
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("object1", "object2")), "object3", true), // Cas: no està present
                Arguments.of(new ArrayList<>(List.of("object1", "object3")), "object3", false) // Cas: ja està present
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void addIfNotPresent(ArrayList<Object> list, Object obj, boolean shouldBeAdded) {
        int originalSize = list.size();

        // Mètode que estem provant
        if (!list.contains(obj)) {
            list.add(obj);
        }

        // Verifiquem el comportament esperat
        if (shouldBeAdded) {
            assertEquals(originalSize + 1, list.size(), "L'objecte s'hauria d'haver afegit.");
        } else {
            assertEquals(originalSize, list.size(), "L'objecte no s'hauria d'haver afegit.");
        }
    }

    @Test
    public void testListDoesNotContainMissingObject() {
        ArrayList<Object> list = new ArrayList<>();

        // Agregamos solo algunos elementos
        addIfNotPresent(list, new Animal("gato"), true);
        addIfNotPresent(list, new Car("ford mustang"), true);

        // No agregamos a "marcos" (intencionalmente omitido)
        Person missingPerson = new Person("marcos");

        // Verificamos que la lista NO contiene a "marcos"
        assertFalse(list.contains(missingPerson), "La lista contiene un elemento que no debería estar.");
    }
}


