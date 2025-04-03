package s1t4.exercici5.nivell2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyMap {
    @Test
    public void testMapContainsKey() {
        // Creamos una instancia de MyMap
        MyMap myMap = new MyMap();

        // Añadimos algunas claves y valores
        myMap.addEntry("animal", "gato");
        myMap.addEntry("coche", "ford mustang");
        myMap.addEntry("persona", "marcos");

        // Verificamos que la clave "animal" está presente en el mapa
        assertTrue(myMap.containsKey("animal"), "El Map no contiene la clave esperada.");
    }
}
